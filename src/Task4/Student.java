package Task4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    static long idStatic = 0;
    private long id;
    private String name;
    private String surName;
    private List<Subject> subject;
    private List<Mark> marks;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
        this.id = Student.idStatic++;
    }

    public static long getIdStatic() {
        return idStatic;
    }

    public static void setIdStatic(long idStatic) {
        Student.idStatic = idStatic;
    }

    public Student(String name, String surName, List<Subject> subject) {
        this.name = name;
        this.surName = surName;
        this.subject = subject;
        this.marks = setMarkSubject();
        this.id = Student.idStatic++;
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

    public void addMark(int value, String nameSubject) {
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getNameSubject() == nameSubject) {
                if (value > 12 || value < 0)
                    marks.get(i).getMark().add(12);
                else
                    marks.get(i).getMark().add(value);
            }
        }
    }

    /*public List<Mark> setMarkSubject() {
        List<Mark> marks1 = new ArrayList<>();

        Mark mark1 = new Mark();
        Mark mark2 = new Mark();
        Mark mark3 = new Mark();

        marks1.add(mark1);
        marks1.add(mark2);
        marks1.add(mark3);

        return marks1;
    }*/
    public List<Mark> setMarkSubject() {
        List<Mark> marks1 = new ArrayList<>();
        Mark[] mark1 = new Mark[subject.size()];

        for (int i = 0; i < subject.size(); i++) {
            mark1[i] = new Mark();
            marks1.add(mark1[i]);
            // marks1.add(mark1[i] = new Mark());    // Чи можна так робити?
        }
        return marks1;
    }
}
