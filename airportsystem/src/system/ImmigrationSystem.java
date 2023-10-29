package system;

interface ImmigrationSystem 
{
	void applyForVisa(String applicantName, String passportNumber, String destinationCountry);
  void checkVisaStatus(String applicantName, String passportNumber);
	void processVisa(String applicantName, String passportNumber, String destinationCountry);
}