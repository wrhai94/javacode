import java.util.Scanner;
public class Test601{ 
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);

		int[] arr = {10, 12, 45, 90};
		System.out.println("请输入一个数字");
		int num = scanner.nextInt();

		int start = 0;
		int end = arr.length - 1;
		int inserIndex = 0;
		while (true) {
			int mid = (start + end) / 2;
			if (arr[mid] > num) {
				end = mid - 1;
			} else if (arr[mid] <= num) {
				start = mid + 1;
			}

			if (start > end){
				inserIndex = start;
				break;
			}
		}

		int[] newArr = new int[arr.length + 1];
		for (int i = 0; i < newArr.length; i++) {
			if (inserIndex == i){
				newArr[i] = num;
			} else if (inserIndex > i) {
				newArr[i] = arr[i];
			} else {
				newArr[i] = arr[i - 1];
			}

		}

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}