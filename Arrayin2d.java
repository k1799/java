class Arrayin{//2dimensional for used evalau rows and colums vena vaikalam
	public static void main(String args[]){
		//Litrel method
		int [][] arr = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		//printing array
		for(int i=0; i<arr.length; i++){
			for (int j =0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}