public class BuddleExercise{ 
	public static void main (String[] args){
		int arr[] = new int[]{24, 60, 80, 57, 13};
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

			System.out.print("arr = ");
			for (int j = 0; j < arr.length ; j++) {
				System.out.print(arr[j] + "\t");
			}
			System.out.println("");
		}
	}
}