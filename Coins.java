public class Coins {
	public static void main (String [] args) {

	int quarter = 25;
	int total = Integer.parseInt(args[0]);
	int num_of_quarters = total / quarter;
	int num_of_cents = total - (quarter * num_of_quarters); 

	System.out.println("Use " + num_of_quarters + " Quarters and " + num_of_cents + " Cents");
	
	}
}

/*
Example in Terminal:
(base) nirmarciano@NirMarc 1 % java Coins 3252
Use 130 Quarters and 2 Cents
(base) nirmarciano@NirMarc 1 % java Coins 24
Use 0 Quarters and 24 Cents
(base) nirmarciano@NirMarc 1 % java Coins 100
Use 4 Quarters and 0 Cents
*/