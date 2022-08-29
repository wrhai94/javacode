public class YangHun{ 
	public static void main (String[] args){
		int [][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((i - 1) + "," +  (j - 1) + "\t");
				if ((i - 1) < 0 || (j - 1) < 0 || i == j)
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
			System.out.println("");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}