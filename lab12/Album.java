import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Comparator;

public class Album {

	public List<Track> tracks;
	public String name;

	public Album(String s) {
		tracks = new ArrayList<Track>();
		name = s;
	}

	public void add(Track t) {
		tracks.add(t);
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {

		List<Album> albums = new ArrayList<Album>();

		Track a = new Track(3);
		Track b = new Track(4);
		Track c = new Track(5);

		Album al1 = new Album("a");
		al1.add(a);
		al1.add(b);
		al1.add(c);

		Track d = new Track(2);
		Track e = new Track(3);
		Track f = new Track(6);

		Album al2 = new Album("b");
		al2.add(d);
		al2.add(e);
		al2.add(f);


		Track g = new Track(2);
		Track h = new Track(1);
		Track i = new Track(3);

		Album al3 = new Album("c");
		al3.add(g);
		al3.add(h);
		al3.add(i);

		albums.add(al1);
		albums.add(al2);
		albums.add(al3);

		List<Album> favs = albums
			.stream()
			.filter( al -> 
				al.tracks.stream()
					.anyMatch( t -> t.rating >= 4))
			.sorted(Comparator.comparing( al -> al.name) )
			.collect( Collectors.toList());

		System.out.println(favs);

	}
}