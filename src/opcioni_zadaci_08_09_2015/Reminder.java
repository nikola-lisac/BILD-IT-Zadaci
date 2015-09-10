package opcioni_zadaci_08_09_2015;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reminder extends Calendar {
	String dateOfReminder = "";
	String reminderNote = " ";
	static ArrayList<Reminder> reminderList = new ArrayList<>(); // lista koja
																	// zadrzi
																	// sve
																	// podsjetnike

	Reminder() {

	}

	Reminder(String date, String note) {
		dateOfReminder = date;
		reminderNote = note;
	}

	/*
	 * konstruktor za podsjetnik day, month,year se smjestaju u string
	 * dateOfReminder a note u reminderNote
	 */
	Reminder(int day, int month, int year, String note) {
		if (day < 10) {
			dateOfReminder = "0" + Integer.toString(day) + "/";
		} else {
			dateOfReminder = Integer.toString(day) + "/";
		}
		if (month < 10) {
			dateOfReminder += "0" + Integer.toString(month) + "/";
		} else {
			dateOfReminder += Integer.toString(month) + "/";
		}
		dateOfReminder += Integer.toString(year);
		reminderNote = note;

	}

	/*
	 * stampanje podsjetnika iz liste u bazu podataka
	 */
	public static void printRemindersToDatabase() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "nikola");
			if (connection != null) {
			}
			String sql = "INSERT INTO remainder(Date,Note) VALUES(?,?);";
			// statement
			PreparedStatement tempStat = connection.prepareStatement(sql);
			/*
			 * petlja prolazi sve podsjetnike u i za svaki upisuje datum
			 * podsjetnika i tekst podsjetnika u bazu podataka
			 */
			for (Reminder rem : reminderList) {
				tempStat.setString(1, rem.dateOfReminder);
				tempStat.setString(2, rem.reminderNote);
				tempStat.executeUpdate();
			}
		} catch (Exception el) {
			el.printStackTrace();
		} finally {
			// zatvaranje konekcije
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * unosenje podsjetnika iz baze podataka
	 */
	static void enterRemindersFromDatabase() {
		ArrayList<Reminder> tempReminderList = new ArrayList<>();// privremena
																	// lista
																	// podsjetnika
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "nikola");
			if (connection != null) {
			}
			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery("SELECT * FROM remainder;");
			
			// unos datuma i teksta podsjetnika sve dok postoji upis u bazi, 
			// pravljenje nove instance Reminder na osnovu polja baze podataka i
			// smjestanje instanci u listu
			while (result.next()) {
				Reminder rem = new Reminder(result.getString(1), result.getString(2));
				tempReminderList.add(rem);
			}
			reminderList = tempReminderList;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// zatvaranje konekcije
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

	/*
	 * Meni za kreiranje novog podsjetnika
	 */
	public static void newReminder(Calendar cal) {
		Scanner input = null;
		int numOfDay = 0;
		String reminder = "";
		try {
			input = new Scanner(System.in);
			System.out.print("Unesite broj dana za koji zelite staviti podsjetnik: ");
			numOfDay = input.nextInt();// dan za podsjetnik
			input.nextLine();
			// ako je uneseni dan 0 ili veci od broja dana u tom mjeseci ponovo
			// trazi da unese dan
			if (numOfDay < 1 && numOfDay > cal.numOfDaysInAMonth()) {
				System.out.println("Unijeli ste nepostojeci dan, pokusajte ponovo.");
				newReminder(cal);
			} else {
				System.out.print("Unesite tekst podsjetnika: ");
				reminder = input.nextLine();
			}
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos.");
			newReminder(cal);
		}

		// kreiranje novog podsjetnika
		Reminder rem = new Reminder(numOfDay, cal.numberOfMonth, cal.year, reminder);
		// dodavanje novog podsjetnika u listu
		reminderList.add(rem);
		printRemindersToDatabase();
		System.out.println("Podsjetnik je unesen.");
		userMenu();

	}

	/*
	 * printanje svih podsjetnika
	 */
	static void printAllReminders() {

		System.out.println("Lista podsjetnika");
		System.out.println("---------------------");

		for (Reminder rem : reminderList) {
			System.out.println(rem.dateOfReminder + " " + rem.reminderNote + "\n");
		}
	}

	/*
	 * Metoda koja pronalazi remindere za dati mjesec i smjesta ih u listu, a
	 * zatim prosledjuje tu listu
	 */
	static ArrayList<Reminder> checkForReminder(int month, int year) {
		ArrayList<Reminder> remindersForPrinting = new ArrayList<>();
		if (reminderList.size() > 0) {
			for (Reminder r : reminderList) {
				String[] date = r.dateOfReminder.split("/");
				int monthReminder = Integer.parseInt(date[1]);
				int yearReminder = Integer.parseInt(date[2]);
				if (month == monthReminder && year == yearReminder) {
					remindersForPrinting.add(r);
				}

			}
		}
		return remindersForPrinting;

	}

	/*
	 * Metoda koja printa remindere iz liste za printanje
	 */
	static void printReminders(ArrayList<Reminder> remindersForPrinting) {
		System.out.println("\n");
		if (remindersForPrinting.size() > 0) {
			for (Reminder reminder : remindersForPrinting) {
				System.out.println(reminder.dateOfReminder + " " + reminder.reminderNote);
			}
		}
	}

}
