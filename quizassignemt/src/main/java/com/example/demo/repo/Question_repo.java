package com.example.demo.repo;

import com.example.demo.model.Question;
import org.springframework.data.repository.CrudRepository;

public interface Question_repo extends CrudRepository<Question,Integer> {
}
