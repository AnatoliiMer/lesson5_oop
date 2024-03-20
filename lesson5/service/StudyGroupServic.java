package service;

import model.Teacher;
import model.Student;
import model.StudyGroup;

import java.util.List;

public class StudyGroupServic {

    public StudyGroup createStudyGrou(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}