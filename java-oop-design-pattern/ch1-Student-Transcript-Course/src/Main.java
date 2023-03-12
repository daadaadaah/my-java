import java.util.Vector;


public class Main {


	public static void main(String[] args) {
		Student s1 = new Student("ManSup");
		Student s2 = new Student("GilDong");
		Student s3 = new Student("GilSeo");
		Course se = new Course("Software Engineering");
		Course designPattern = new Course("Design Pattern");
		Transcript t1 = new Transcript(s1, se);
		Transcript t2 = new Transcript(s1, designPattern);
		Transcript t3 = new Transcript(s2, designPattern);
		Transcript t4 = new Transcript(s1, designPattern);

		t1.setDate("2012");
		t1.setGrade("B0");
		t3.setDate("2013");
		t3.setGrade("C+");
		t2.setDate("2012");
		t2.setGrade("D+");
		t4.setDate("2013");
		t4.setGrade("A+");

		Vector<Course> courses;

		courses = s1.getCourses();
		for (int i=0; i<courses.size(); i++) 							
			System.out.println(courses.get(i).getName());
		
		Vector<Student> students;

		students = designPattern.getStudents();
		for (int i=0; i<students.size(); i++) 							
			System.out.println(students.get(i).getName());
	}

}
