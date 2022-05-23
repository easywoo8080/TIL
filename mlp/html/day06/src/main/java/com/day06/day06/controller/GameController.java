package com.day06.day06.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {
    
    @RequestMapping("/game")
    public String game(Model m) {
        m.addAttribute("center", "game/center");
        m.addAttribute("gamecenter", "game/gamemain");
        m.addAttribute("left", "game/left");
        return "main";
    }

    @RequestMapping("/numbers")
    public String numbers(Model m) {
        m.addAttribute("center", "game/center");
        m.addAttribute("gamecenter", "game/numbers");
        m.addAttribute("left", "game/left");
        return "main";
    }

    
}
