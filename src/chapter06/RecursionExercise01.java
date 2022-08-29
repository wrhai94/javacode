import java.util.Scanner;
public class RecursionExercise01{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int n = scanner.nextInt();

		NumberHelper nh = new NumberHelper();
		// int[] arr = new int[n];
		// nh.sum(n, arr);

		// for (int i=0; i<arr.length; i++) {
		// 	System.out.print(arr[i] + ",");
		// }

		int count = nh.getTotalCountBeforeDays(n);
		System.out.println("原有桃子 " + count);
	}
} 

class NumberHelper {
	public int sum(int n, int[] arr){
		// System.out.println(1);
		// System.out.println(1+0);
		// System.out.println(1+1);
		// System.out.println(1+1 +1);
		// System.out.println(1+1+1 +1+1);
		if (n <= 0) {
			return 0;
		} else {
			int s = sum(n - 1, arr) + sum(n - 2, arr);
			if (s == 0)
				s = 1;
			
			arr[n - 1] = s;
			return s;
		}
		
	}

	public int getTotalCountBeforeDays(int days){
		if (days <= 1){
			return 1;
		} else {
			return 2 * (getTotalCountBeforeDays(days - 1) + 1);
		}
	}
}