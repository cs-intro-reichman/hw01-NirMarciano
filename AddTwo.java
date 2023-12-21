public class AddTwo {
	public static void main (String [] args) {

	int Num1 = Integer.parseInt(args[0]);
	int Num2 = Integer.parseInt(args[1]);
	int sum = Num1 + Num2;
	System.out.println(Num1 + " + " + Num2 + " = " + sum);
	
	}
}

/*
Example in Terminal:
(base) nirmarciano@NirMarc 1 % Java AddTwo 425 8352
425 + 8352 = 8777
*/