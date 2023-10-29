package system;

class EUImmigrationSystem implements ImmigrationSystem 
{
	  public void applyForVisa(String applicantName, String passportNumber, String destinationCountry) 
	  {
	    System.out.println("\nEU immigration system: Applying for visa for " + applicantName +
	                       " (passport number: " + passportNumber + ") to " + destinationCountry + ".");
	  }
	  
	  public void checkVisaStatus(String applicantName, String passportNumber)
	  {
	    System.out.println("\nEU immigration system: Checking visa status for " + applicantName +
	                       " (passport number: " + passportNumber + ").");
	  }

	  public void processVisa(String applicantName, String passportNumber, String destinationCountry) 
	  {
	    System.out.println("\nEU immigration system: Processing visa for " + applicantName +
	                       " (passport number: " + passportNumber + ") to " + destinationCountry + ".");
	  }
	}