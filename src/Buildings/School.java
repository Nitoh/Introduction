package Buildings;

import People.Teacher;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private final List<Teacher> teachers = new ArrayList<>();

//    private List<Student> students;

    public School(String name) {
        this.name = name;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher != null)
            teachers.add(teacher);
    }
}
