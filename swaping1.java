class Swaping
{
	public static void main(String[]args)
	{
	int a = 1999;
	int b = 2012;
	int c = 2020;
	a=a+b+c;
	b=a-(b+c);
	c=a-(b+c);
	a=a-(b+c);
	System.out.println("A:"+a);
	System.out.println("B:"+b);
	System.out.println("C:"+c);
	
	int d = 1111;
	int e = 2222;
	int f = 3333;
	int g = 4444;
	int temp = d;
	d=e;
	e=f;
	f=g;
	g=temp;
	System.out.println("D:"+d);
	System.out.println("E:"+e);
	System.out.println("F:"+f);
	System.out.println("G:"+g);
	int h = 1000;
	int i = 2000;
	int j = 3000;
	int l = 4000;
	h=h+i+j+l;
	i=h-(i+j+l);
	j=h-(i+j+l);
	l=h-(l+i+j);
	h=h-(i+j+l);
	System.out.println("H:"+h);
	System.out.println("I:"+i);
	System.out.println("J:"+j);
	System.out.println("L:"+l);
	}
}
	