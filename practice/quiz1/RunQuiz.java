package quiz1;

import quiz1.enums.*;

import java.util.ArrayList;

public class RunQuiz {
  
  public static void main(String[] args) {
    RunQuiz runQuiz = new RunQuiz();
    runQuiz.runSort();
  }

  public void runSort() {
    ArrayList<Student> students =  createStudents();

    ArrayList<Student> boys = new ArrayList<Student>();
    ArrayList<Student> girls = new ArrayList<Student>();

    for(Student student: students) {
      if(student.getGender() == Gender.MAN) {
        boys.add(student);
      } else {
        girls.add(student);
      }
    }

    boys.sort(new StudentComparator(SortType.HEIGHT, SortOrder.ASC).create());

    girls.sort(new StudentComparator(SortType.STUDENT_ID, SortOrder.ASC).create());

    girls.addAll(boys);

    ArrayList<Student> newStudents = new ArrayList<Student>(girls);

    newStudents.sort(new StudentComparator(SortType.GENDER, SortOrder.ASC).create());

    printResult(newStudents);
  }

    public ArrayList<Student> createStudents() {
    ArrayList<Student> students = new ArrayList<Student>();

    Student student1 = new Student(1, Gender.WOMAN, 140);
    Student student2 = new Student(2, Gender.MAN, 184);
    Student student3 = new Student(3, Gender.MAN, 183);
    Student student4 = new Student(4, Gender.WOMAN, 122);
    Student student5 = new Student(5, Gender.WOMAN, 120);
    Student student6 = new Student(6, Gender.MAN, 129);
    Student student7 = new Student(7, Gender.WOMAN, 180);
    Student student8 = new Student(8, Gender.MAN, 183);
    Student student9 = new Student(9, Gender.WOMAN, 155);
    Student student10 = new Student(10, Gender.WOMAN, 165);

    students.add(student1);
    students.add(student10);
    students.add(student8);
    students.add(student9);
    students.add(student3);
    students.add(student5);
    students.add(student4);
    students.add(student2);
    students.add(student7);
    students.add(student6);

    return students;
  }

  public void printResult(ArrayList<Student> students) {
    for(Student student: students) {
      System.out.println("최종 : "+student.toString());
    }
  }
}
