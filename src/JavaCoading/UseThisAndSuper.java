class Super
{
    String A = " Kumar";
}
public class UseThisAndSuper extends Super
{
    String A = " Amit";
    public void name(String A)
    {
        System.out.print(A);
        System.out.print(this.A);
        System.out.print(super.A);
    }
	public static void main(String[] args)
	{
	    UseThisAndSuper obj = new UseThisAndSuper();
	    obj.name("Er.");
	}
}
