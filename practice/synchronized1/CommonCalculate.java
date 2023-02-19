package synchronized1;

public class CommonCalculate {
  private int amount;
  
  public CommonCalculate() {
    this.amount = 0;
  }

  public void plus(int value) {
    // ...
    // 10만 줄....
    // ...
    synchronized(this) {
      this.amount += value;
    }
  }
  
  public void minus(int value) {
    this.amount -= value;
  }

  public int getAmount() {
    return this.amount;
  }
}
