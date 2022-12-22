public class SalaryManager {
  public static void main(String[] arg) {
    SalaryManager salaryManager = new SalaryManager();
    System.out.println("월급 : " +  salaryManager.getMonthlySalary(20000000));
  }
  
  public double getMonthlySalary(int yearlySalary) {
    double monthlySalary = yearlySalary / 12.0;
    double earnedIncomeTax = calculateTax(monthlySalary);
    double nationalPension = calculateNationalPension(monthlySalary);
    double healthInsurance = calculateHealthInsurance(monthlySalary);

    double totalTax = (earnedIncomeTax + nationalPension + healthInsurance);
    monthlySalary -= totalTax;
    return monthlySalary;
  }

  public double calculateTax(double monthlySalary) {
    double earnedIncomeTax  = monthlySalary * 0.125; 
    System.out.println("근로 소득세 : " + earnedIncomeTax);
    return earnedIncomeTax;
  }

  public double calculateNationalPension(double monthlySalary) {
    double nationalPension  = monthlySalary * 0.081; 
    System.out.println("국민 연금 : " + nationalPension);
    return nationalPension;
  }

  public double calculateHealthInsurance(double monthlySalary) {
    double healthInsurance  = monthlySalary * 0.135; 
    System.out.println("건강 보험료 : " + healthInsurance);
    return healthInsurance;
  }

}
