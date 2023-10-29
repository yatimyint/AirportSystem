package travelers;

public class THAIImmigrationSystem extends ImmigrationSystem
{
   public THAIImmigrationSystem(String name, int age, String passportNumber, String travelPurpose, boolean visa)
    {
        super(name, age, passportNumber, travelPurpose, visa);
    }
  
   public void checkSystem() 
    {
        System.out.println("System is checking to " + name + "," + age + "," + passportNumber + "," + travelPurpose);
        if (visa == true) {
        	Airport obj = new Passport();
            obj.approveVisa();
            System.out.println("Welcome to Thailand!");
        }
        else {
        	Airport obj2 = new Passport();
        	obj2.denyVisa();
        }
    }
}
