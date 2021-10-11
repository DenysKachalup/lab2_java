package Task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surName;
    private List<Subject> subject;
    private List<Mark> marks;

    public Student(List<Mark> marks) {
        this.marks = marks;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Student(String name, String surName, List<Subject> subject) {
        this.name = name;
        this.surName = surName;
        this.subject = subject;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

}
