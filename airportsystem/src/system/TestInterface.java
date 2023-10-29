package system;

class TestInterface 
{
  public static void main(String[] args)
  {
    ImmigrationSystem usSystem = new USImmigrationSystem();
    usSystem.applyForVisa("John", "123", "US");
    usSystem.checkVisaStatus("John", "123");
    usSystem.processVisa("John", "123", "US");

    ImmigrationSystem euSystem = new EUImmigrationSystem();
    euSystem.applyForVisa("Mike", "678", "EU");
    euSystem.checkVisaStatus("Mike", "678");
    euSystem.processVisa("Mike", "678", "EU");
  }
}
