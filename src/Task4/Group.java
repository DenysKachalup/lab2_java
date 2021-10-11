package Task4;

import java.util.*;

public class Group {
    private List<Student> students = new ArrayList<>();

    public Group(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addSubject(List<Subject> subjects, String name) {
        Subject subject = new Subject(name);
        subjects.add(subject);

        Mark[] mark = new Mark[students.size()];
        for (int i = 0; i < students.size(); i++) {
            students.get(i).getMarks().add(mark[i] = new Mark());
        }
    }

    public void printMap(final Subject subject) {
        Map<Long, List<Integer>> map = new TreeMap<>();
        for (Student student : getStudents()) {
            int index = student.getSubject().indexOf(subject);
            map.put(student.getId(), student.getMarks().get(index).getMark());
        }
        System.out.println(map);
    }

    public String bestStudent() {
        int tmp = 0;
        int result = 0;
        String res = "";

        for (Student student : students) {
            int count = 0;
            for (Subject subject : student.getSubject()) {
                for (Integer txt : student.getMarks().get(student.getSubject().indexOf(subject)).getMark()) {
                    count++;
                    tmp += txt;
                }
            }
            if (tmp / count > result) {
                result = tmp;
                res = "ID = " + student.getId()
                        + " Name = " + student.getName()
                        + " Surname = " + student.getSurName();
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";                                       // Вивід інформації про студентів
        for (Student student : students) {
            res += "Student { " + "name= " + student.getName() +
                    ", surName= " + student.getSurName();
            for (Subject subject : student.getSubject()) {
                res += ", subject= " + subject.getNameSubject() + "{ ";
                for (Integer txt : student.getMarks().get(student.getSubject().indexOf(subject)).getMark())
                    res += txt + " ";
                res += "}";
            }
            res += " }" + '\n';
        }
        return res;
    }

}


