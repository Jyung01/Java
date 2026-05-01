package sub2;

public class Movie {
	
	private String title;
	private String director;
	private double rating;
	private int availableSeats;
	
	public Movie(String title, String director, double rating, int availableSeats) {
		super();
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}

	public boolean reserveSeat() {
		if (availableSeats >= 1) {
			availableSeats--;
			return true;
		} else {
			return false;
		}
	}
	
	public void cancelreservation() {
		availableSeats++;
	}
	
	public void showDetails() {
		System.out.println("영화 제목 : " + title);
		System.out.println("영화 감독 : " + director);
		System.out.println("영화 평점 : " + rating);
		System.out.println("잔여 좌석 : " + availableSeats);
	}
	

}
