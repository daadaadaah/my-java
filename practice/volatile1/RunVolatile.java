package volatile1;

public class RunVolatile {
  public static void main(String[] args) {
    RunVolatile runVolatile  = new RunVolatile();
    runVolatile.runVolatitleSample();
  }

  public void runVolatitleSample() {
    VolatileSample sample = new VolatileSample();
    sample.start();

    try {
      Thread.sleep(1000);
    } catch(Exception e) {
      e.printStackTrace();
    }

    System.out.println("RunVolatitle : sleep() end ");
    sample.setDouble(-1);
    System.out.println("RunVolatitle : Set value is completed !");

  }
}
