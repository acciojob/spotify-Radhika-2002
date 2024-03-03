package com.driver;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SpotifyService {

    SpotifyRepository spotifyRepository = new SpotifyRepository();

    public User createUser(String name, String mobile) {
        return null;
    }

    public Artist createArtist(String name) {
        return null;
    }

    public Album createAlbum(String title, String artistName) {
        return null;
    }

    public Song createSong(String title, String albumName, int length) throws Exception {
        return null;
    }

    public Playlist createPlaylistOnLength(String mobile, String title, int length) throws Exception {
        return null;
    }

    public Playlist createPlaylistOnName(String mobile, String title, List<String> songTitles) throws Exception {
        return null;
    }

    public Playlist findPlaylist(String mobile, String playlistTitle) throws Exception {
        return null;
    }

    public Song likeSong(String mobile, String songTitle) throws Exception {
        return null;
    }

    public String mostPopularArtist() {
        return null;
    }

    public String mostPopularSong() {
        return null;
    }
}
