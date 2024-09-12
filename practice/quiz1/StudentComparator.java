package quiz1;

import quiz1.enums.SortOrder;
import quiz1.enums.SortType;

import java.util.Comparator;

public class StudentComparator {
    private SortType sortType;
    private SortOrder sortOrder;

    StudentComparator(SortType sortType, SortOrder sortOrder) {
        this.sortType = sortType;
        this.sortOrder = sortOrder;
    }

    public Comparator<Student> create() {
        Comparator<Student> comparator = null;

        if(this.sortType == SortType.HEIGHT && this.sortOrder == SortOrder.ASC) {
            return new HeightASCComparator();
        }

        if(this.sortType == SortType.STUDENT_ID && this.sortOrder == SortOrder.ASC) {
            return new StudentIdASCComparator();
        }

        if(this.sortType == SortType.GENDER && this.sortOrder == SortOrder.ASC) {
            return new GenderASCComparator();
        }

        return comparator;
    }

    class GenderASCComparator implements Comparator<Student> {
        @Override
        public int compare(Student a,Student b) {
            if(a.getGender().ordinal() > b.getGender().ordinal()) return 1;
            if(a.getGender().ordinal() < b.getGender().ordinal()) return -1;
            return 0;
        }
    }

    class HeightASCComparator implements Comparator<Student> {
        @Override
        public int compare(Student a,Student b){
            if(a.getHeight() > b.getHeight()) return 1;
            if(a.getHeight() < b.getHeight()) return -1;
            return 0;
        }
    }

    class StudentIdASCComparator implements Comparator<Student> {
        @Override
        public int compare(Student a,Student b){
            if(a.getStudentId() > b.getStudentId()) return 1;
            if(a.getStudentId() < b.getStudentId()) return -1;
            return 0;
        }
    }
}
