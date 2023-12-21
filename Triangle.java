public class Triangle {
	public static void main (String [] args) {

	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);

	boolean test = (a + b > c) & (a + c > b) & (b + c > a);

	System.out.println(a + ", " + b + ", " + c + ": " + test);
	
	}
}

/*
Example in Terminal:
(base) nirmarciano@NirMarc 1 % java Triangle 2 7 43
2, 7, 43: false
(base) nirmarciano@NirMarc 1 % java Triangle 4 5 7
4, 5, 7: true
*/