class Operators
{
	public static void main(String[]args)
	{
		//Arithmetic operators
		int a=20;
		int b=60;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Relational(comparison) operators
		int c=10;
		int d=20;
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println(c>d);
		System.out.println(c<d);
		System.out.println(c>=d);
		System.out.println(c<=d);
		
		//Assignment operators
		int e=6;
		int var;
		// assign value using =
		var=e;
		System.out.println("var using =:"+var);
		//assign value using +=
		var += e;
		System.out.println("var using +=:"+var);
		//assign value using -=
		var -= e;
		System.out.println("var using -=:"+var);
		//assign value using *=
		var *= e;
		System.out.println("var using *=:"+var);
		//assign value using /=
		var /= e;
		System.out.println("var using /=:"+var);
		
		//Logical operators 
		// AND operator (double side one false it's also output false)
		int x=2;
		int y=6;
		int z=8;
		System.out.println((x<y) && (x<z)); //true
		System.out.println((x>y) && (x>z)); //false
		System.out.println(((x>y) && (x<z)) && ((x>y) && (x>z))); //false
		//OR operator (double side one true it's also output true)
		int r=3;
		int s=7;
		int t=9;
		System.out.println((r<s) || (r>t));
		//NOT operator(its used reverse result)
		int k=4;
		System.out.print(!(k>2 && k>8));

		
		
		
	}
}