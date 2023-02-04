public class Driver extends Car{
  public Driver(){
    super();
  }

  public void drive(){
    gasLevel-=1;
    System.out.println("You drive the car.");
    System.out.println("Gas remaining: "+gasLevel+"/10");
  }

  public void useBoosters(){
    gasLevel-=3;
  }

  public void refuel(){
    gasLevel+=2;
  }
}