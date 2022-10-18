package com.Myproject.Services;

import com.Myproject.Entities.Students;
import com.Myproject.Exceptions.studentNotFound;
import com.Myproject.Repository.studentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class studentsService {
    @Autowired
    private studentsRepo studentsRepo;

    public List<Students> students = new CopyOnWriteArrayList<>();

//    Add Students
    public Students addstudents(Students students) {
        return studentsRepo.save(students);
    }

//    Get All Students
    public List<Students> getStudents() {
        return studentsRepo.findAll();
    }

//    Get Single Student by id
    public Students getstudentbyid(int studentid) {
        Optional<Students> optionalStudents = studentsRepo.findById(studentid);
        if (!optionalStudents.isPresent())
            throw new studentNotFound("Student Record is Not Available......");
        return optionalStudents.get();
    }

//    Update Students
    public  Students updatestudents(int id, Students students) {

        Optional<Students> optionalStudents = studentsRepo.findById(id);
        if (optionalStudents.isPresent())
            Students.setid(id);
        else {
            throw new studentNotFound("User Record is Not Available.......");
        }
        return studentsRepo.save(students);
    }

//    Delete Students
    public void deletestudent(int studentid) {
        studentsRepo.deleteById(studentid);
    }
}
