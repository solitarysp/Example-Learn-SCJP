package com.higgusp.testEqualsAndInstanceofObject;/*
  By Chi Can Em  11-03-2018
 */

public class MainTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        if (s1.equals(s2)) {
            System.out.println(" equals Bằng nhau");
        } else {
            System.out.println(" equals khác nhau");
        }
        if (s1 instanceof Student) {
            System.out.println(" instanceof với Student Bằng nhau");
        } else {
            System.out.println(" instanceof với  Student không Bằng nhau");
        }

        if (s1 instanceof Object) {
            System.out.println(" instanceof với Object Bằng nhau");
        } else {
            System.out.println(" instanceof với  Object không Bằng nhau");
        }

        if (s1 == s2) {
            System.out.println(" == Bằng nhau");
        } else {
            System.out.println(" == khác nhau");
        }

    }
}
