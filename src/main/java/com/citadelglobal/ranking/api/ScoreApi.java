package com.citadelglobal.ranking.api;

import com.citadelglobal.ranking.entity.CitadelRanking;
import com.citadelglobal.ranking.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class ScoreApi {
    private UserRepository userRepository;
    @Autowired
    public ScoreApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @PostMapping("/add-score")
    public void addScore(@RequestParam String player, @RequestParam int score) {
        System.out.println("Dodano!!!");
        userRepository.save(new CitadelRanking(player, "123",1, 0, 0, LocalDate.now(), LocalDate.now(), LocalDate.now(), 0, 0));
    }
    @GetMapping("/view-score")
    public Iterable<CitadelRanking> viewScore() {
        System.out.println("Ktos pyta!!!");
        return userRepository.findAll();

    }
}