package travelers;

import java.util.Scanner;

public class TicketPurchaseCheck {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // prompt the user to enter the website name and move to the second question
	        System.out.print("Enter the name of the website where the ticket was purchased from please: ");
	        String website = input.nextLine();

	        // check if the website they bought their ticket is valid and not a scam
	        if (website.equals("www.airasia.com") || website.equals("www.thaiairways.com")) {
	            System.out.println("This is a valid ticket purchase.");
	        } 
	        else {
	            System.out.println("This person is a scammer. Report to the local Thai Police and call 191 immediately.");
	            }
	        }
	}

