package org.example;

public class Teacher extends Person {

    private String teacherId;

    public Teacher(String firstName, String lastName, String email, String gradeLevel, org.example.Role role, String teacherId) {
        super(firstName, lastName, email, gradeLevel, role);
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

}

