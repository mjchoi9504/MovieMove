package chobong.movie.dto;

public class MovieDTO {
	private String movieCode;
	private String movieTitle;
	private int movieYear;
	private int starPoint;
	private String movieSummary;
	private String movieImage;
	
	//Constructor
	public MovieDTO(String movieCode, String movieTitle, int movieYear, int starPoint, String movieSummary,
			String movieImage) {
		super();
		this.movieCode = movieCode;
		this.movieTitle = movieTitle;
		this.movieYear = movieYear;
		this.starPoint = starPoint;
		this.movieSummary = movieSummary;
		this.movieImage = movieImage;
	}
	
	//getXxx,setXxx
	public String getMovieCode() {
		return movieCode;
	}

	public void setMovieCode(String movieCode) {
		this.movieCode = movieCode;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}

	public int getStarPoint() {
		return starPoint;
	}

	public void setStarPoint(int starPoint) {
		this.starPoint = starPoint;
	}

	public String getMovieSummary() {
		return movieSummary;
	}

	public void setMovieSummary(String movieSummary) {
		this.movieSummary = movieSummary;
	}

	public String getMovieImage() {
		return movieImage;
	}

	public void setMovieImage(String movieImage) {
		this.movieImage  = movieImage;
	}
		  
	
}
