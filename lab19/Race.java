public class Race {

	public static int car1distance = 0;
	public static int car2distance = 0;	

	public static void main(String[] args) {
		int distance = 100;

		Thread car1 = new Thread( () -> {
			for (int i = 0; i < distance; i++) {
				car1distance++;
				System.out.println( car1distance );
			}
		});
		Thread car2 = new Thread( () -> {
			car1.start();
			for (int i = 0; i < distance; i++) {
				car2distance++;
				System.out.println( "\t\t\t" + Integer.toString(car2distance) );
			}
		});

		car2.start();

	}
}