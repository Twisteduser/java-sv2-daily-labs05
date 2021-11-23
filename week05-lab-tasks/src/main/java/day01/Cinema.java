package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }


    public List<String> findMovieByTime (LocalDateTime time){
        List<String> selectedMovies = new ArrayList<>();
        for (Movie m: movies){
            for (int i = 0; i < m.getDates().size(); i++){
                if (m.getDates().get(i).equals(time)){
                    selectedMovies.add(m.getName());
                }
            }
        }
        return selectedMovies;
    }
}
