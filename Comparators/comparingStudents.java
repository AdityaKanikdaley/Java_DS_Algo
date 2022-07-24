package apniKaksha.Comparators;

import java.util.ArrayList;
import java.util.Comparator;

public class comparingStudents {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Aditya"));
        list.add(new Student(3, "Tejas"));
        list.add(new Student(4, "Nitin"));
        list.add(new Student(2, "Safala"));

        // ascending sort
        list.sort(new ascendingComparator());
        for(Student s : list) {
            System.out.println(s.roll + " " + s.name);
        }

        System.out.println("-------------");

        // descending sort
        list.sort(new descendingComparator());
        for(Student s : list) {
            System.out.println(s.roll + " " + s.name);
        }

    }
}

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

class ascendingComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if(s1.roll < s2.roll)
            return -1;

        return 0;

        // 0 represents  ==
        // 1 represents  >
        // -1 represents <
    }
}

class descendingComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if(s1.roll > s2.roll)
            return -1;

        return 0;

        // 0 represents  ==
        // 1 represents  >
        // -1 represents <
    }
}