package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean hungry = true;

		if (hungry) {
			System.out.println("I'm starving .....");
		} else {
			System.out.println("I'm not hungry");

		}

		int hungerRating = 5;

		// not example "!"
		if (!(hungerRating < 6)) {
			System.out.println("Not hungry");
		} else {
			System.out.println("I'm starving");
		}

		// Using variables
		// temps in fahrenheit
		int favoriteTemp = 75;
		int currentTemp = 100;
		String opinion;

		if (favoriteTemp == currentTemp) {
			if (currentTemp < favoriteTemp - 30) {
				opinion = "Its pretty darn cold";
			} else if (currentTemp < favoriteTemp - 20) {
				opinion = "Its kinda cold out";
			} else if (currentTemp > favoriteTemp + 10) {
				opinion = "Its hot out";
			} else {
				opinion = "Its a beautiful day";
			}
		} else {
			opinion = "unknown temp";
		}

		System.out.println(opinion);

		// Switch statement

		int month = 2;
		String monthString;

		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "Febuary";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;

		default:
			monthString = "Unknown month";
		}
		
		System.out.println(monthString);

	}

}
