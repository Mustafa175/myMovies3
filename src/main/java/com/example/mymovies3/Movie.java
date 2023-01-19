package com.example.mymovies3;

public class Movie {

    private int MovieId;
    private String Name;
    private Double Rating;

    private Double IMDBRating;
    private String FileLink;
    private String LastView;


    public String toString() { return Name + "          " + Rating + "          " + IMDBRating + "          " + FileLink + "          " + LastView;}

    public Movie(int MovieId, String Name, Double Rating, Double RatingIMDB, String Filelink, String LastView) {
        this.MovieId = MovieId;
        this.Name = Name;
        this.Rating = Rating;
        this.IMDBRating = RatingIMDB;
        this.FileLink = Filelink;
        this.LastView = LastView;

    }
    public int getMovieId() { return this.MovieId;
    }
    public String getName() { return this.Name;
    }
    public Double getRating() { return this.Rating;
    }
    public Double getRatingIMDB() { return this.IMDBRating;
    }
    public String getFileLink() { return this.FileLink;
    }
    public String getLastView() { return this.LastView;
    }
}


