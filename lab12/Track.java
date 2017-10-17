public class Track implements Comparable<Track>{

	public int rating;

	public Track(int r) {
		rating = r;
	}

	public int compareTo(Track t) {
		if (rating == t.rating)
			return 0;
		else
			return rating > t.rating ? 1 : -1;
	}

	public String toString() {
		return Integer.toString(rating);
	}
}