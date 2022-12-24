public class ManageHeight {
  int [][] gradeHeights;

	public static void main(String[] args) {
    ManageHeight manageHeight = new ManageHeight();
    manageHeight.setData();
    for(int i = 1; i <= 5; i++) {
      manageHeight.printHeight(i);
      manageHeight.printAverage(i);
    }
  }

  public void setData() {
    gradeHeights = new int[5][];
    gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
    gradeHeights[1] = new int[] {160, 165, 167, 186};
    gradeHeights[2] = new int[] {158, 177, 187, 176};
    gradeHeights[3] = new int[] {173, 182, 181};
    gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
  }

  public void printHeight(int classNo) {
    System.out.println("Class No. : "+classNo);

    for(int height: gradeHeights[classNo - 1]) {
      System.out.println(height);
    }
  }

  public void printAverage(int classNo) {
    System.out.println("Class No. : "+classNo);

    double sum = 0;
    for(int height: gradeHeights[classNo - 1]) {
      sum = sum + height;
    }
    double average = sum / gradeHeights[classNo - 1].length;
    System.out.println("Height average:"+average);
  }
}
