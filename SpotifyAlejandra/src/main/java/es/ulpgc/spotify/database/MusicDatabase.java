package es.ulpgc.spotify.database;

import es.ulpgc.spotify.model.Album;
import es.ulpgc.spotify.model.Artist;
import es.ulpgc.spotify.model.Song;

import java.sql.SQLException;

public interface MusicDatabase {
    void add(Album albums) throws SQLException;
    void add(Artist artist) throws SQLException;
    void add(Song song) throws SQLException;
}
