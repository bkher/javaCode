package practice1;

public class Matrix {

	public static void main(String []args) {
		
		
	//	int c[][]= new int [3][2];
		int b[][]= {{4,5,6,4},{4,5,6,3},{4,5,6,2},{4,5,6,5}};
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int sum =0;
		for(int i=0;i<b.length;i++) {
			for (int j=0;j<b[i].length;j++){
				if(i==j) {
					sum = sum + b[i][j];
				}	
			}
		}
		System.out.print(sum);
		
	}
}
