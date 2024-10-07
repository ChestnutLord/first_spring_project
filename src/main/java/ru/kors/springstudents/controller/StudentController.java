package ru.kors.springstudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/vi/students")
@AllArgsConstructor
public class StudentController {

    //
    //Создаём объект интерфейса???
    //
    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent() {
        //todo
        return service.findAllStudent();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student) {
         service.saveStudent(student);
         return "Студент успешно сохранён";
    }

    @GetMapping("/{email}")
    public Student getByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }
    @DeleteMapping("delete_student/{email}")
    public void  deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }

}
