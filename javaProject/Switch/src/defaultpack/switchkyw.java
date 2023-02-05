package defaultpack;
import java.util.Scanner;

public class switchkyw {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command");
		String text = input.nextLine();
		
		switch(text) {
		case "start":
			System.out.println("Machine Started");
			
		case "stop":
			System.out.println("Machine Stopped");
			
		default:
			System.out.println("Command Not Recognized");
		}
		
		
	}

}
