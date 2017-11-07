import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;



public class Sum {

	int i = 0;

	public Sum() {
		i = 0;
	}

	public synchronized void incrementSeq() {
		i++;
	}

	public void increment() {
		i++;
	}

	public String toString() {
		return Integer.toString(i);
	}

	public static void main(String[] args) {


		ExecutorService executor = Executors.newFixedThreadPool( 1000 );

		Sum sumA = new Sum();

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 1000; i++) {
			sumA.incrementSeq();
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Sequential time is " + (endTime - startTime));
		System.out.println(sumA);

		Sum sumB = new Sum();

		startTime = System.currentTimeMillis();



		for (int i = 0; i < 1000; i++) {
			executor.execute( () -> sumB.increment() );
		}

		endTime = System.currentTimeMillis();

		executor.shutdown();

		System.out.println("Parallel time is " + (endTime - startTime));
		System.out.println(sumB);		

	}
}