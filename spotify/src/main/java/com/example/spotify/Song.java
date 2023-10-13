package com.example.demo.spotify;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    private String artist;

    private String album;

    private Date releaseDate;

    private String genre;

    private Integer duration;

    private String coverImage;

    private String spotifyUrl;

    // TODO: Añadir constructores, getters y setters

    public Song(){}
    public Song(Long id, String title, String artist, String album, Date releaseDate, String genre, Integer duration, String coverImage, String spotifyUrl){
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.duration = duration;
        this.coverImage = coverImage;
        this.spotifyUrl = spotifyUrl;
    }


    public Long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getAlbum(){
        return album;
    }
    public Date getReleaseDate(){
        return releaseDate;
    }
    public String genre(){
        return genre;
    }
    public Integer duration(){
        return duration;
    }
    public String getCoverImage(){
        return coverImage;
    }
    public String getSpotifyURL(){
        return spotifyUrl;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setArtist(String artist){
        this.artist  = artist;
    }

    public void setAlbum(String album){
        this.album = album;
    }
    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setDuration(Integer duration){
        this.duration = duration;
    }
    public void setCoverImage(String coverImage){
        this.coverImage = coverImage;
    }
    public void setSpotifyUrl(String spotifyUrl){
        this.spotifyUrl = spotifyUrl;
    }

}
