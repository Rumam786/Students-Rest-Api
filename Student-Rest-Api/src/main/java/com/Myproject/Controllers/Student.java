package com.Myproject.Controllers;

import com.Myproject.Entities.Students;
import com.Myproject.Services.studentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Student {

    @Autowired
    private studentsService studentsService;

//    Add Students(Post Mapping)
    @PostMapping("/students")
    public Students addstudents(@RequestBody Students students) {
        return studentsService.addstudents(students);
    }

//    Get All Students(Get mapping)
    @GetMapping("/students")
    public List<Students> getallstudents() {
        return studentsService.getStudents();
    }

//    Get Single Student By id (Get Mapping)
    @GetMapping("/students/{sid}")
    public Students getstudentbyid(@PathVariable("sid") int studentid) {
        return studentsService.getstudentbyid(studentid);
    }

//    Update Students (Put Mapping)
    @PutMapping("/students/{sid}")
    public Students updatestudent(@PathVariable("sid") int studentid, @RequestBody Students students) {
        return studentsService.updatestudents(studentid, students);
    }

//    Delete Students (Delete Mapping)
    @DeleteMapping("/students/{sid}")
    public void deletestudent(@PathVariable("sid") int studentid) {
        this.studentsService.deletestudent(studentid);
    }
}

