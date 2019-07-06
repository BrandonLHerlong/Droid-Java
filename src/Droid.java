public class Droid {
  int batteryLevel;
  String name;
  
  public Droid(String droidName) {
    name = droidName; 
    batteryLevel = 100;
  }
  
  
  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
    System.out.println("Battery level after task is now " + batteryLevel);
  }
  
  public void energyReport() {
    System.out.println( "Energy level is currently " + batteryLevel);
  }
  
  public String toString() {
    return "Hello, I'm the droid: " + name + "!";
  }
  
  
  
  
  

  
  public static void main(String[] args) {
    Droid newDroid = new Droid("Codey");
    System.out.println(newDroid);
    newDroid.performTask("drive");
    newDroid.energyReport();
  }
  
}