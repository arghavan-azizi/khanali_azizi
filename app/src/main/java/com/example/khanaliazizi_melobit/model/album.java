package com.example.khanaliazizi_melobit.model;

import java.util.List;

public class album
{
    String name;
    List<artists> artists;
    image image;
    String releaseDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<com.example.khanaliazizi_melobit.model.artists> getArtists() {
        return artists;
    }

    public void setArtists(List<com.example.khanaliazizi_melobit.model.artists> artists) {
        this.artists = artists;
    }

    public com.example.khanaliazizi_melobit.model.image getImage() {
        return image;
    }

    public void setImage(com.example.khanaliazizi_melobit.model.image image) {
        this.image = image;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
