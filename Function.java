class Function
{
	public static void main (String [] args)
	{
		Function f1=new Function();
		f1.price("brinjal");
		f1.price("mango");
		f1.color();
		f1.Fruits("orange=",100.0);
		f1.Fruits("Apple=",90.0);
	}
	//no returntype no parameter define
	void color()
	{
		System.out.println("RED");
	}
	//no returntype single parameter define
	void price(String vegtable)
	{
		System.out.println(vegtable);
	}
	//no returntype multi parameter define
	void Fruits(String name,double price)
	{
		System.out.println(name+":"+price);
	}
}