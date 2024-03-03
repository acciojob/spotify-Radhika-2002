package com.driver;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class SpotifyRepository {
    public HashMap<Artist, List<Album>> artistAlbumMap;
    public HashMap<Album, List<Song>> albumSongMap;
    public HashMap<Playlist, List<Song>> playlistSongMap;
    public HashMap<Playlist, List<User>> playlistListenerMap;
    public HashMap<User, Playlist> creatorPlaylistMap;
    public HashMap<User, List<Playlist>> userPlaylistMap;
    public HashMap<Song, List<User>> songLikeMap;

    public List<User> users;
    public List<Song> songs;
    public List<Playlist> playlists;
    public List<Album> albums;
    public List<Artist> artists;

    public SpotifyRepository() {
        artistAlbumMap = new HashMap<>();
        albumSongMap = new HashMap<>();
        playlistSongMap = new HashMap<>();
        playlistListenerMap = new HashMap<>();
        creatorPlaylistMap = new HashMap<>();
        userPlaylistMap = new HashMap<>();
        songLikeMap = new HashMap<>();

        users = new ArrayList<>();
        songs = new ArrayList<>();
        playlists = new ArrayList<>();
        albums = new ArrayList<>();
        artists = new ArrayList<>();
    }

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
