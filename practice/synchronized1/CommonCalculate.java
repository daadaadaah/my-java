package synchronized1;

public class CommonCalculate {
  private int amount;
  
  public CommonCalculate() {
    this.amount = 0;
  }

  public synchronized void plus(int value) {
    this.amount += value;
  }
  
  public void minus(int value) {
    this.amount -= value;
  }

  public int getAmount() {
    return this.amount;
  }
}
