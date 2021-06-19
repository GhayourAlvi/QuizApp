package com.example.demo;

import com.example.demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repo.Quiz_repo;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/ghayour_quiz/")
public class control {

    @Autowired
    Quiz_repo quizRepo;

    @CrossOrigin
    @GetMapping(value = "/findall")
    public List<Quiz> full_data(){
        return (List<Quiz>) quizRepo.findAll();
    }

    @CrossOrigin
    @PostMapping(value = "/save")
    public List<Quiz> persist(@RequestBody Quiz Quiz_data){
        quizRepo.save(Quiz_data);
        return (List<Quiz>) quizRepo.findAll();
    }

}
