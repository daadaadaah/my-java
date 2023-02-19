package volatile1;

public class VolatileSample extends Thread {

  private double instanceVariable = 0;
  
  void setDouble(double value) {
    this.instanceVariable = value;
  }

  public void run() {
    System.out.println("--------------------- VolatileSample : run() start ");
    
    try {
      while(instanceVariable == 0) {
        Thread.sleep(1);      
      }
    } catch(Exception e) {
      e.printStackTrace();
    }

    System.out.println("--------------------- VolatileSample : instanceVariable : "+instanceVariable);

    System.out.println("--------------------- VolatileSample : run() end ");
  }
}
