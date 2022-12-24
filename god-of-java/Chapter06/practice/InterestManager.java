
public class InterestManager {

	public static void main(String[] args) {
    InterestManager interestManager  = new InterestManager();

    for(int i = 1; i <=365; i++) {
      if(i % 10 == 0) {
        System.out.println(i + " : "+interestManager.calculateAmount(i, 2000000));
      }
    }

  }

  public double getInterestRate(int day) {
    if(day >= 1 && day <= 90) {
      return 0.5;
    }

    if(day >= 91 && day <= 180) {
      return 1;
    }

    if(day >= 181 && day <= 364) {
      return 2;
    }

    return 5.6;
  }

  public double calculateAmount(int day, long amount) {
    double interest = getInterestRate(day);

    double total = amount + amount * interest / 100;

    return total;
  }
}