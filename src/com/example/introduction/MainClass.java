package com.example.introduction;

import Base.TextFileReader;
import People.Human;
import People.Teacher;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {

//        doTeacherLogic();
//         doFileLogic();
    }

    private static void doTeacherLogic() {
        Teacher teacher = createTeacher();
        System.out.println(teacher.getName());
    }

    private static Teacher createTeacher() {
        Human human = new Teacher("Serhat", 26, "männlich");
        return (Teacher) human;
    }

    private static void doFileLogic() throws IOException {
        TextFileReader.openFileDialog();
        String res = new String(TextFileReader.getFileContent());

        System.out.println(res);
    }
}
