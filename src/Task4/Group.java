package Task4;

import java.util.*;

public class Group {
    private List<Student> students;

    public Group(final List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public void addSubject(final List<Subject> subjects, final String name) {
        final Subject subject = new Subject(name);
        subjects.add(subject);

        final List<Mark> mark = new ArrayList<>(students.size());
        for (int i = 0;i< students.size();i++) {
            final  Mark mark1 = new Mark();
            mark.add(mark1);
        }

        for (int i = 0; i < students.size(); i++) {
            students.get(i).getMarks().add(mark.get(i));
        }
    }

    public void printMap(final Subject subject) {
        final Map<Long, List<Integer>> map = new TreeMap<>();
        for (final Student student : getStudents()) {
            final int index = student.getSubject().indexOf(subject);
            map.put(student.getId(), student.getMarks().get(index).getMark());
        }
        System.out.println(map);
    }

    public Student bestStudent() {
        int tmp = 0;
        int result = 0;
        Student studentTmp = students.get(0);

        for (final Student student : students) {
            int count = 0;
            for (final Subject subject : student.getSubject()) {
                for (final Integer value : student.getMarks().get(student.getSubject().indexOf(subject)).getMark()) {
                    count++;
                    tmp += value;
                }
            }
            if (tmp / count > result) {
                result = tmp;
                studentTmp = student;
            }
        }
        return studentTmp;
    }

    @Override
    public String toString() {
        String res = "";                                       // Вивід інформації про студентів
        for (final Student student : students) {
            res += "Student { " + "name= " + student.getName() +
                    ", surName= " + student.getSurName();
            for (final Subject subject : student.getSubject()) {
                res += ", subject= " + subject.getNameSubject() + "{ ";
                for (final Integer txt : student.getMarks().get(student.getSubject().indexOf(subject)).getMark())
                    res += txt + " ";
                res += "}";
            }
            res += " }" + '\n';
        }
        return res;
    }

}


