public class ForExercise{
	public static void main (String[] args){
		int count = 0;
		int sum = 0;
		for (int i = 1; i<=100 ; i++) {
			if(i % 9 == 0){
				count++;
				sum += i;
			}
		}

		System.out.println("¸öÊý£º" + count);
		System.out.println("ºÍ£º" + sum);


		int n = 12;
		for (int i = 0; i<=n ; i++) {
			System.out.println(i + " + " + (n - i) + " = " + n);
		}
	}
}