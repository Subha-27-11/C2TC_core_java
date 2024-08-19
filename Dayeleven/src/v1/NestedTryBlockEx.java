package v1;

public class NestedTryBlockEx {
	public static void main1(String[] args)  {
		int z = 0;
		int x = 0;
		int y = 0;
		z = x / y;
		System.out.println("Result of division is z: " + z);

	}

	public static void main(String[] args) {
		int x, y,z;
		try {
			x = Integer.parseInt(args[0]); // command line args
			y = Integer.parseInt(args[1]);
			try {
				z=divide(x, y);
			} catch (ArithmeticException ae) {
				System.err.println("Error! A number cannot be divided by 0");
			}
		} catch (NumberFormatException e) {
			System.err.println("Error! Invalid input, number must be an integer.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error! please pass numbers ");
		}
		System.out.println("I am out of outer catch block");
	}

	private static int divide(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
}
