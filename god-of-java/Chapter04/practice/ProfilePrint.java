public class ProfilePrint {
  byte age;
  String name;
  boolean isMarried;
  
  public static void main(String[] args) {
		ProfilePrint profilePrint=new ProfilePrint();
		profilePrint.setName("daadaadaah");
    byte age = 33;
		profilePrint.setAge(age);
    profilePrint.setMarried(false);
    
    System.out.println(profilePrint.getName());
    System.out.println(profilePrint.getAge());
    System.out.println(profilePrint.isMarried());
	}
  
  public void setAge(byte paramAge) {
    age = paramAge;
  }

  public byte getAge() {
    return age;
  }

  public void setName(String paramName) {
    name = paramName;
  }

  public String getName() {
    return name;
  }

  public void setMarried(boolean flag) {
    isMarried = flag;
  }

  public boolean isMarried() {
    return isMarried;
  }
}
