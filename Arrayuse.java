import java.util.Scanner;//array use new keyword in scanner
 
class Arrayuse{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter the Row size : ");
		int rows = sc.nextInt();
		System.out.println ("Enter the Column size : ");
		int cols = sc.nextInt();

		//array creation using new keyword
		int [][] ar = new int[rows][cols];

		//asign
		for(int i =0 ; i < rows ; i++){
			for (int j =0; j < cols ; j++) {
				System.out.print ("Enter the value of "+ i + " " + j +" ");
				ar[i][j]=sc.nextInt();
			}
		}
		//print 
		for(int i =0 ; i < rows ; i++){
			for (int j =0; j < cols ; j++) {
				System.out.print (ar[i][j]+ " "); 
			}
			System.out.println();
		}

	}
}