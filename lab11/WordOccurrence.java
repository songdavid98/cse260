public class WordOccurrence implements Comparable<WordOccurrence>{

	private String word;
	private int count;

	public WordOccurrence(String w, int c) {
		word = w;
		count = c;
	}

	public int getCount() {
		return count;
	}

	public int compareTo( WordOccurrence w) {
		if (getCount() > w.getCount())
			return 1;
		else if (getCount() < w.getCount())
			return -1;
		else 
			return 0;
	}

	public String toString() {
		String s = word + ": ";
		return s + Integer.toString(count);
	}
}