package com.citadelglobal.ranking.api;

import com.citadelglobal.ranking.entity.CitadelRanking;
import com.citadelglobal.ranking.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

import static sun.audio.AudioPlayer.player;

@RestController
public class ScoreApi {
    private UserRepository userRepository;
    String responseCheck;

    @Autowired
    public ScoreApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/add-score")
    public void addScore(@RequestParam String player, @RequestParam int score, @RequestParam String pass) {


        if (userRepository.findByName(player).isEmpty() == true) {

            userRepository.save(new CitadelRanking(player, pass, 0, 0, 0, LocalDate.now(), LocalDate.now(), LocalDate.now(), 0, 0));
            System.out.println("Dodano!!!" + player);
        } else {
            System.out.println("Juz istnieje: " + player + " nie dodano.");

        }
    }

    @GetMapping("/view-score")
    public Iterable<CitadelRanking> viewScore() {

        //if (player==null){player=" ";}
        System.out.println("Ktos pyta o ranking!!!");
        return userRepository.findByScore();


    }

    @GetMapping("/check-user")
    public String checkUser(@RequestParam String player) {
        System.out.println("Pytanie o usera!" + player);
        if (userRepository.findByName(player).isEmpty() == true) {

            return responseCheck = "SUCCESS. User " + player + " added.";

        } else {

        }

        return responseCheck = "NOT ADDED. Name already used !";
    }




    @GetMapping("/login-user")
    public String loginUser(@RequestParam String player, String pass) {
        System.out.println("Proba logowania usera!" + player + " haslo: "+pass);

        if (userRepository.loginUser(player, pass).isEmpty() == true) {

            return responseCheck="UNRECOGNIZED TRY...";

        } else {

        }

        return responseCheck="SUCCESS. HELLO AGAIN "+player;
    }



}