


void enqueue (int queue[], int element, int)



private int movieId;
    private float rating;
    
    private List<Movie> similarMovies;
    
    public Movie(int movieId, float rating) {
        this.movieId = movieId;
        this.rating = rating;
        similarMovies = new ArrayList<Movie>();
    }
    
    public int getId() {
        return movieId;
    }
    
    public float getRating() {
        return rating;
    }
    
    public void addSimilarMovie(Movie movie) {
        similarMovies.add(movie);
        movie.similarMovies.add(this);
    }
    
    public List<Movie> getSimilarMovies() {
        return similarMovies;
    }