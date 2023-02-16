package com.example.demo;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Controller
public class WhateverIWant {

    private Team team;

    @PostConstruct
    public void init() {

        Set<Player> players = new HashSet<>();
        players.add(new Player("Charlie Brown", "pitcher"));
        players.add(new Player("Snoopy", "shortstop"));

        team = new Team("Peanuts", "California", players);
    }

    @RequestMapping("/hi")
    public @ResponseBody Team hiThere() {
        return team;
    }

}
