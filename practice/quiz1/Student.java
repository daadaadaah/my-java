package quiz1;

import quiz1.enums.Gender;

public class Student {
    private int studentId;
    private Gender gender;
    private double height;

    Student(int studentId, Gender gender, double height) {
        this.studentId = studentId;
        this.gender = gender;
        this.height = height;
    }

    @Override
    public String toString() {
        return "{ studentId : "+ this.studentId + ", gender : " + this.gender + ", height : "+ this.height +" }";
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
