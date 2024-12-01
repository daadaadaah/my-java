package volatile1;

public class VolatileSample extends Thread {

  private double instanceVariable = 0;
  
  void setDouble(double value) {
    this.instanceVariable = value;
  }

  public void run() {
    System.out.println("--------------------- VolatileSample : run() start ");
    
    while(instanceVariable == 0) {
      System.out.println("--------------------- VolatileSample : while ing... ");
    }

    System.out.println("--------------------- VolatileSample : instanceVariable : "+instanceVariable);

    System.out.println("--------------------- VolatileSample : run() end ");
  }
}
