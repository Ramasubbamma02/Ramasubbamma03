package demo;
class Riding{
	public void display()
	{
		System.out.println("hellow");
	}
}
public class Overriding extends Riding {
	public void display()
	{
		System.out.println("hellow every one");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Overriding or = new Overriding();
			or.display();

		}

	}


