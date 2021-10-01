
public class SixSidedDie extends Die {
	
	public SixSidedDie()
	{
		super(6);
	}
	
	public void display(int sides)
	{
		System.out.println("*******");
		System.out.println("*     *");
		System.out.println("*  " + sides + "  *");
		System.out.println("*     *");
		System.out.println("*******");
	}
}
