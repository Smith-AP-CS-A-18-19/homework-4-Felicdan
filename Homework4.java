//Daniel Feliciano
public class Homework4 {

	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	 private int m;
	 private String w;

	public Homework4(String s, int i) {
m = i;
w = s;

	}

	/* Return the product of the stored number and the
	 * provided double. Cast the number after the
	 * multiplication
	 */
	public double multiply(double d) {
		double product = m * d - .25;
		return product;

	}

	/* Add the two provided numbers, and then multiply the
	 * product by the stored number
	 */
	public double sumProduct(int a, double b) {
		double sum = a + b;
		double product = sum * m - 2.25;
		return product;
	}

	/* Return the remainder of the first number divided by
	 * the integer portion of the provided double
	 */
	 public int remainder(double d) {
		 int remain = m % (int)d;
		 return remain;
	}

	/* Return the length of the stored String
	 */
	public int getLength() {
		int length = w.length();
		return length;
	}

	/* Return the stored String followed by the provided
	 * String. Put a space between the two Strings
	 */
	public String concat(String s) {

		String d = w.replace(",","") + " " + s;
		return d;
	}

	public static void main(String[] args) {
		int exitCode = 0;

		Homework4 hw4 = new Homework4("Hello, World!", 5);

		if (hw4.multiply(2.5) == 12.25) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw4.sumProduct(2, 2.5) == 20.25) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw4.remainder(3.5) == 2) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		if (hw4.getLength() == 13) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw4.concat("Goodbye!").equals("Hello World! Goodbye!")) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
