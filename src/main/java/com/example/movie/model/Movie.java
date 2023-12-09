package com.example.movie.model;
import javax.persistence.*;
import java.util.*;

@Entity 
@Table(name="movielist")
public class Movie{
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="movieid")
    int movieId;
    @Column(name="moviename")
    String movieName;
    @Column(name="leadactor")
    String leadActor;
    public Movie(){}

    public Movie(int movieId,String movieName,String leadactor){
        this.movieId=movieId;
        this.movieName=movieName;
        this.leadActor=leadActor;
    }

    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movidId){
        this.movieId=movieId;
    }
    public String getMovieName(){
        return movieName;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public String getLeadActor(){
        return leadActor;
    }
    public void setLeadActor(String leadActor){
        this.leadActor=leadActor;
    }
}
 