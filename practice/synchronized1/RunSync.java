package synchronized1;

public class RunSync {
  
  public static void main(String[] args) {
    RunSync runSync = new RunSync();
    for (int i = 0; i < 5; i++) {
      runSync.runCommonCalculate();
    }
  }

  public void runCommonCalculate() {
    CommonCalculate calc = new CommonCalculate();

    ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
    ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

    thread1.start();
    thread2.start();

    try {
      thread1.join(); // 쓰레드가 종료될 때까지 기다리는 메소드
      thread2.join();

      System.out.println("calc : "+calc.getAmount());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
