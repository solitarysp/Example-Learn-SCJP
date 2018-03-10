package com.higgusp.testEqualsAndInstanceofObjectHasOvrHashWithEquals;/*
  By Chi Can Em  11-03-2018
 */

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }
}
