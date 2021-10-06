
public class Driver {

	public static void main(String[] args) {
		
		Die d = new SixSidedDie();
		int roll1=0, roll2=0, roll3=0, roll4=0, roll5=0, roll6=0, other=0;
		
		for (int i = 1; i <= 10000000; i++)
		{
			switch(d.roll())
			{
				case 1: roll1 = roll1 + 1;
						break;
				case 2: roll2 = roll2 + 1;
						break;
				case 3: roll3 = roll3 + 1;
						break;
				case 4: roll4 = roll4 + 1;
						break;
				case 5: roll5 = roll5 + 1;
						break;
				case 6: roll6 = roll6 + 1;
						break;
				default: other = other + 1;
			}
		}
		
		System.out.println("Rolled 1:" + roll1/10000000.0);
		System.out.println("Rolled 2:" + roll2/10000000.0);
		System.out.println("Rolled 3:" + roll3/10000000.0);
		System.out.println("Rolled 4:" + roll4/10000000.0);
		System.out.println("Rolled 5:" + roll5/10000000.0);
		System.out.println("Rolled 6:" + roll6/10000000.0);
		System.out.println("Rolled other:" + other/1000000.0);
	}

}
