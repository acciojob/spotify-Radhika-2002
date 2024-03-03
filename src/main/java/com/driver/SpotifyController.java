package com.driver;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("spotify")
public class SpotifyController {

    SpotifyService spotifyService = new SpotifyService();

    @PostMapping("/add-user")
    public String createUser(@RequestParam(name = "name") String name, String mobile) {
        return "Success";
    }

    @PostMapping("/add-artist")
    public String createArtist(@RequestParam(name = "name") String name) {
        return "Success";
    }

    @PostMapping("/add-album")
    public String createAlbum(@RequestParam(name = "title") String title, String artistName) {
        return "Success";
    }

    @PostMapping("/add-song")
    public String createSong(String title, String albumName, int length) throws Exception {
        return "Success";
    }

    @PostMapping("/add-playlist-on-length")
    public String createPlaylistOnLength(String mobile, String title, int length) throws Exception {
        return "Success";
    }

    @PostMapping("/add-playlist-on-name")
    public String createPlaylistOnName(String mobile, String title, List<String> songTitles) throws Exception {
        return "Success";
    }

    @PutMapping("/find-playlist")
    public String findPlaylist(String mobile, String playlistTitle) throws Exception {
        return "Success";
    }

    @PutMapping("/like-song")
    public String likeSong(String mobile, String songTitle) throws Exception {
        return "Success";
    }

    @GetMapping("/popular-artist")
    public String mostPopularArtist() {
        return "Success";
    }

    @GetMapping("/popular-song")
    public String mostPopularSong() {
        return "Success";
    }
}
