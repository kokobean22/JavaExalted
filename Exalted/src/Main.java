
public class Main
{
	public static void main(String[] args)
	{
		Exalt tom = new Exalt();
		tom.printChar();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		int[] maAb = {3,4,5,4,4,2,0,0,4,0,5,4,4,3,4,2,5,2,1,4,5,5,5,2,0,3,5,0,3,6};
		Exalt marian = new Exalt("Marian", "Solar", "Night", 4, 5, 5, 5, 4, 6, 3, 4, 5, maAb, 9, 6, 2, 5, 3, 3, "Red Rage of Compassion");
		marian.printChar();
		
		Charm test = new Charm();
		test.printCharm();
	}
}
