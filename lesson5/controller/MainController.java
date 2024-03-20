package controller;

import model.Teacher;
import model.Student;
import model.StudyGroup;
import service.StudyGroupServic;

import java.util.List;

public class MainController {
    private StudyGroupServic studyGroupService;

    public MainController(StudyGroupServic studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup createStudyGrou(List<Student> students, Teacher teacher) {
        return studyGroupService.createStudyGrou(teacher, students);
    }
}