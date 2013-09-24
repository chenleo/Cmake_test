//import java.io.*;
import java.lang.Thread; 

public class Count extends Thread {

	private int _upto; 

	public Count (int upto) {
		_upto = upto;
	}

	public void run () {

		int i;          // iterator

		for (i = 1; i <= _upto; i++) {
			System.out.println(i);
		}

		if (i > 20) {
			System.exit(1);  // what effect does this have? 
		}

		System.exit(0); // successful execution
	}

	public static void main (String[] argv) {
		int upto = 10; // count to 10 by default

		// Notice we dont use argv[0] here (what happens if we try?) 
		System.out.println("Inside program " + "Count.java");

		if (argv.length > 0) { // use first argument
			upto = Integer.parseInt(argv[0]);
		}

		// perform my count
		Thread runner = new Count(upto);
		runner.start();
	}
}
