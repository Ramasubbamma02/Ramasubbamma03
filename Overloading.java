package demo;

	public class Overloading {
		public void add(int a, int b)
		{
			System.out.println(a+b);
		}
		public void add(int a, int b, int c)
		{
			System.out.println(a+b+c);
		}
		public void add(int a, float d)
		{
			System.out.println(a+d);
		}
		public void add(int a, float d, float e)
		{
			System.out.println(a+d+e);
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
		    Overloading m = new Overloading();
		    m.add(4, 25.6f);
		    m.add(9, 5);
		    m.add(12, 69, 78);
		    m.add(63, 56.2f, 84.6f);
		}
	}

