package ru.kors.springstudents.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.repository.InMemoryStudentDAO;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO REPOSITORY;
    @Override
    public List<Student> findAllStudent() {
        return REPOSITORY.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return REPOSITORY.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return REPOSITORY.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return REPOSITORY.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        REPOSITORY.deleteStudent(email);
    }
}
