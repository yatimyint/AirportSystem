package travelers;

public class AbstractDemo 
{
    public static void main(String[] args) 
    {
        ImmigrationSystem system = new THAIImmigrationSystem("Su", 22, "Abc123", "ED", true);
        System.out.println("Check System");
        system.checkSystem();
    }
}
