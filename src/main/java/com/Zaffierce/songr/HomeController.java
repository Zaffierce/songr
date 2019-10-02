package com.Zaffierce.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AlbumRepository albumRepository;

    //The model "m" is for us to specify variables that the view should have access to.

    @GetMapping("/")
    public String getHome(String username, Model m) {
        m.addAttribute("potato", "russett");
        if (username == null) {
            m.addAttribute("username", "Jon");
        } else {
            m.addAttribute("username", username);
        }
        return "home";
    }

    @GetMapping("/hello/{username}")
    //the username is coming from a path this time.
    public String getHelloRoute(@PathVariable String username, Model m) {
        m.addAttribute("username", username);
        return "home";
    }

    @GetMapping("/capitalize/{keyword}")
    public String getCapitalizeRoute(@PathVariable String keyword, Model m) {
        m.addAttribute("keyword", keyword.toUpperCase());
        return "home";
    }

//    @GetMapping("/emotions")
//    public String getTheEmotions(Model m) {
//        List<Emotion> feelings = emotionRepository.findAll();
//        m.addAttribute("feeling", feelings);
//        return "emotions";
//    }

//    @PostMapping("/emotions")
//    public RedirectView addTheEmotions(String emotionName, String reason, int strength){
//        Emotion em = new Emotion(emotionName, strength, reason);
//        emotionRepository.save(em);
//        return new RedirectView("/emotions");
//    }

    @GetMapping("/albums")
    public String getAlbums(Model m) {
        List<Album> myAlbums = albumRepository.findAll();
//        System.out.println(myAlbums);
        m.addAttribute("albums", myAlbums);
        return "albums";
    }


    @PostMapping("/albums")
    public RedirectView addAlbums(String title, String artist, int songCount, int length, String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

//    @DeleteMapping("/albums")
//    public RedirectView deleteAlbums(String title) {
////        albumRepository.deleteByTitle(title);
//        return new RedirectView("/home");
//    }
}
