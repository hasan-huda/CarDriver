public class Driver extends Car{
  public Driver(){
    super();
  }

  public void drive(){
    gasLevel-=1;
    status();
  }

  public void useBoosters(){
    gasLevel-=3;
    status();
  }

  public void refuel(){
    gasLevel+=2;
    status();
  }
}