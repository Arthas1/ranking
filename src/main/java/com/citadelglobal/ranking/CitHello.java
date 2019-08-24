package com.citadelglobal.ranking;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // potrzebne do web


public class CitHello {

    @GetMapping("/pop")

    public String ranking()    {
        return "Ranking";
    }
}
