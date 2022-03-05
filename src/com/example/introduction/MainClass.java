package com.example.introduction;

import Base.TextFileReader;
import People.Human;
import People.Student;
import People.Teacher;
import Questions.HyenaQuestion;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {

//        Student student = new Student("Serhat", 26);
//        student.chooseDoor();

        HyenaQuestion hq = new HyenaQuestion();
        hq.askQuestion();

//        doTeacherLogic();
//         doFileLogic();
    }

    private static void doTeacherLogic() {
        Teacher teacher = createTeacher();
        System.out.println(teacher.getName());
    }

    private static Teacher createTeacher() {
        Human human = new Teacher("Serhat", 26);
        return (Teacher) human;
    }

    private static void doFileLogic() throws IOException {
        TextFileReader.openFileDialog();
        String res = new String(TextFileReader.getFileContent());

        System.out.println(res);
    }
}
