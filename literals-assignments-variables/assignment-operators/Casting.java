class Casting {
	public static void main(String[] args) {
		int x = 3957.229  // illegal
		
		int x2 = (int)3957.229; // legal cast
		System.out.println("int x = " + x);

		long l = 56L;
		byte b = (byte)l;
		System.out.println("Byte b = " + b);

		//what if the value is larger than 127?
		long l2 = 130L;
		byte b2 = (byte)l;
		System.out.println("The byte is " + b);
	}
}

/*
The last example, the bits to the left of the lower 8 are gone.
If the leftmost (signifigane bit) is a 1, the value is negative.

Declare a float variable: float f = 234.56F;
Assign the float to a short: short s = (short)f;
*/
