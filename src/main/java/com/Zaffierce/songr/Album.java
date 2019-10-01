package com.Zaffierce.songr;

public class Album {

    protected String title;
    protected String artist;
    protected int songCount;
    protected int length;
    protected String imageUrl;

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return String.format("The artist %s released an album called %s which contained %d songs spanning a total of %d seconds long.", this.artist, this.title, this.songCount, this.length);
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getSongCount() {
        return this.songCount;
    }

    public int getLength() {
        return this.length/60;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
}
