import java.util.Scanner;

public class NameGenerator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Choose your character race:");
		System.out.println("1: Elf");
		System.out.println("2: Dwarf");
		System.out.println("3: Human");
		System.out.println("4: Orc");

		String name = "";
		int race;
		
		try {
			race = s.nextInt();
		} catch (Exception e) {
			System.out.println("Input not a number, please re-run the program.");
			return;
		}
	
		switch (race) {
		case 1:
			name += "Legolas ";
			break;
		case 2:
			name += "Gimli ";
			break;
		case 3:
			name += "Aragon ";
			break;
		case 4:
			name += "Lurtz ";
			break;
		default:
			System.out.println("Choice not in range, please re-run the program.");
			return;
		}

		System.out.println("Choose your character alignment:");
		System.out.println("a: Chaotic Good");
		System.out.println("b: Good");
		System.out.println("c: Evil");
		System.out.println("d: Chaotic Evil");

		String alignment;
		try {
			alignment = s.next();
		} catch (Exception e) {
			System.out.println("Invalid input, please re-run the program");
			return;
		}
		
		switch (alignment) {
		case "a":
			name += "The Brave";
			break;
		case "b":
			name += "The Hero";
			break;
		case "c":
			name += "The Schemer";
			break;
		case "d":
			name += "The Destroyer";
			break;
		default:
			System.out.println("Choice not in range, please re-run the program.");
			return;
		}
		System.out.println("Your character name is " + name +".");
		s.close();
	}
}
