package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Subject english = new Subject("English");
        final Subject physic = new Subject("Physic");
        final Subject math = new Subject("Math");

        List<Subject> subjects = new ArrayList<>();
        subjects.add(english);
        subjects.add(physic);
        subjects.add(math);

        final Student stud1 = new Student("Name1", "Surname1", subjects);
        final Student stud2 = new Student("Name2", "Surname2", subjects);
        final Student stud3 = new Student("Name3", "Surname3", subjects);

        List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);

    }
}
