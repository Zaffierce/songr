package com.Zaffierce.songr.Emotions;

import com.Zaffierce.songr.Emotions.Emotion;
import com.Zaffierce.songr.Emotions.EmotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class EmotionController {
    @Autowired
    EmotionRepository emotionRepository;

    @GetMapping("/emotions")
    public String getTheEmotions(Model m) {
        List<Emotion> feelings = emotionRepository.findAll();
        m.addAttribute("feeling", feelings);
        return "emotions";
    }

    @PostMapping("/emotions")
    public RedirectView addTheEmotions(String emotionName, String reason, int strength){
        Emotion em = new Emotion(emotionName, strength);
        emotionRepository.save(em);
        return new RedirectView("/emotions");
    }
}
