package com.Myproject.Repository;

import com.Myproject.Entities.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentsRepo extends CrudRepository<Students, Integer> {
    @Override
    List<Students> findAll();
}
