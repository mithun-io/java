package com.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // natural ordering (by id)
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;   // ascending order
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>(Arrays.asList(new Student(3, "smith"), new Student(1, "allen"), new Student(2, "wards")));
        
        // uses compareTo()
        Collections.sort(list); 

        for (Student student : list) {
            System.out.println(student.id + " --- " + student.name);
        }
    }
}
