package com.Zaffierce.songr;

import javax.persistence.*;

@Entity
public class Songs {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    long id;

    @ManyToOne
    Album album;

    public String title;
    public int length;
    public int trackNumber;
//    public String album;

    public Songs() {}

    public Songs(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public void setAlbum(Album a) {
        this.album = a;
    }

    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }

    public int getTrackNumber() {
        return this.trackNumber;
    }

    public Album getAlbum() {
        return this.album;
    }
}
