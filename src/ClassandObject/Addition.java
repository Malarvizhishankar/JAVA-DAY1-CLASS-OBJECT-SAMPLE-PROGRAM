package ClassandObject;

public class Addition {
	
	private int a;
	private int b;
	//private int answer;
	/*public void addition(int x,int y)
	{
		this.a=x;
		this.b=y;
		this.answer=a+b;
	}
	Addition(int x,int y )
	{
		this.a=x;
		this.b=y;
		this.answer=a+b;
	}*/
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		int answer=a+b;
		System.out.println(answer);
	}
	/*public void display()
	{
		System.out.println(answer);
	}*/
}
