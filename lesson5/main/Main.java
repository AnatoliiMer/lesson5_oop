package main;

import controller.MainController;
import model.Teacher;
import model.Student;
import model.StudyGroup;
import service.StudyGroupServic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroupServic studyGroupService = new StudyGroupServic();
        MainController mainController = new MainController(studyGroupService);

        Teacher teacher = new Teacher("Иванов", 1);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Петров", 101));
        students.add(new Student("Сидоров", 102));

        StudyGroup studyGroup = mainController.createStudyGrou(students, teacher);
        System.out.println("Создана учебная группа с преподавателем: " + studyGroup.getTeacher()/*.getName()*/ +
                " и студентами: " + studyGroup.getStudents());
    }
}