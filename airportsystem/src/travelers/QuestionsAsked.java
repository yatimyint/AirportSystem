package travelers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import officials.Denial;
import officials.ImmigrationOfficerResponse;
import officials.Welcome;


public class QuestionsAsked {
	public static void main(String
			args[])
			{
		int i = 1;
		List<String> acceptedAnswers = Arrays.asList("education", "work", "visit");
		Scanner scanner = new 
				Scanner(System.in);	
		ImmigrationOfficerResponse greetingMessage = new ImmigrationOfficerResponse();
		Denial denialMessage = new Denial();
		Welcome welcomeMessage = new Welcome();

		greetingMessage.message();
		
		System.out.println("Name: ");
		String name1 = scanner.nextLine();
		
		System.out.println("Age: ");
		int age1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Passport Number: ");
		String passportNumber1 = scanner.nextLine();
		
		System.out.println("What is the purpose of your travel (education/work/visit)? ");
		String travelPurpose1 = scanner.nextLine();
		while (!acceptedAnswers.contains(travelPurpose1) && i < 2) {
				System.out.println("Answer the question properly. What is the purpose of your travel (education/work/visit)?");
			    travelPurpose1 = scanner.nextLine();
			    if(!acceptedAnswers.contains(travelPurpose1)) {
			    i = i+2;
			    }
			    else {
			    	i++;
			    }
			    
			} 
			
			if (i > 2) {
				denialMessage.message();
			}
			
			else {
				
				System.out.println("What visa are you on (education/work/visit)? ");
				String visa1 = scanner.nextLine();
				if (!visa1.contains(travelPurpose1)) {
					denialMessage.message();
				}
				else {
					Person newPerson = new Person(name1, age1, passportNumber1, travelPurpose1, visa1);
					newPerson.displayName();
					welcomeMessage.message();
				}
				
			}

			}
	

}
