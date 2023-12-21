public class Gen3 {
	public static void main (String [] args) {

	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	
	int ran1 = (int) (Math.random() * ( b - a ) + a);
	int ran2 = (int) (Math.random() * ( b - a ) + a);
	int ran3 = (int) (Math.random() * ( b - a ) + a);

	int min = Math.min (Math.min(ran1, ran2), ran3);

	System.out.println(ran1);
	System.out.println(ran2);
	System.out.println(ran3);

	System.out.println("The minimal generated number was " + min);

	}
}

/*
Example in Terminal:
(base) nirmarciano@NirMarc 1 % java Gen3 400 1240
456
808
779
The minimal generated number was 456
(base) nirmarciano@NirMarc 1 % java Gen3 20 25
23
21
20
The minimal generated number was 20
(base) nirmarciano@NirMarc 1 % 
*/