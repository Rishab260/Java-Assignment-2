// Java Program Illustrate Serializing an Object

// Importing input output classes
import java.io.*;

// Main class
// Implementing the Serializable interface
class Main implements Serializable {

	// Member variables
	private String name;
	Main(String name)
	{
		// This keyword refers to current object itself
		this.name = name;
	}

	// Main driver method
	public static void main(String[] args)
	{
		// Try block to check for exceptions
		try {
			// Creating object of class in main() method
			Main d = new Main("GeeksForGeeks");

			FileOutputStream f
				= new FileOutputStream("file.txt");
			ObjectOutputStream oos
				= new ObjectOutputStream(f);
			oos.writeObject(d);
			oos.close();

			// Freeing up memory resources
			f.close();
		}

		// Catch block to handle the exceptiona
		catch (Exception e) {
			// Display the exception along with line number
			// using printStacktrace() method
			e.printStackTrace();
		}
	}
}
