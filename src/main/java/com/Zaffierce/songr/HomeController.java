package com.Zaffierce.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

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

    @GetMapping("/emotions")
    public String getTheEmotions(Model m) {
        Emotion[] feelings = new Emotion[]{
                new Emotion("Uncertanity", 8, "Because fuck Bob Dole"),
                new Emotion("Confusion", 20, "Java hurt James' Brain")
        };
        m.addAttribute("feeling", feelings);

        return "emotions";
    }

    @GetMapping("/albums")
    public String getAlbums(Model m) {
        Album[] myAlbums = new Album[]{
                new Album("Jazz", "Queen", 12, 2679, "https://upload.wikimedia.org/wikipedia/en/4/43/Queen_Bicycle_Race1.png"),
                new Album("A Night at the Opera", "Queen", 13, 2588, "https://upload.wikimedia.org/wikipedia/en/4/4d/Queen_A_Night_At_The_Opera.png"),
                new Album("Hey Jude", "Beatles", 10, 1944, "https://upload.wikimedia.org/wikipedia/en/0/0a/Heyjudealbum.jpg")
        };
        m.addAttribute("albums", myAlbums);

        return "albums";
    }

}
