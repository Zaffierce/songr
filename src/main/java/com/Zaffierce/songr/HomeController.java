package com.Zaffierce.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

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


    @GetMapping("/albums")
    public String getAlbums(Model m) {
        List<Album> myAlbums = albumRepository.findAll();
        m.addAttribute("albums", myAlbums);
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbums(String title, String artist, int songCount, int length, String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

    @PostMapping("/albums/delete")
    public RedirectView deleteAlbums(Long id) {
    albumRepository.deleteById(id);
    return new RedirectView("/albums");
    }

    @GetMapping("/albums/{albumID}")
    public String viewAlbumDetails(Model m, @PathVariable Long albumID) {
        m.addAttribute("album", albumRepository.getOne(albumID));
        return "detailed";
    }

//    @PostMapping("albums/{albumID}")

}
