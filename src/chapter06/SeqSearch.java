import java.util.Scanner;
public class SeqSearch{ 
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);

		int arr[] = new int[]{1, 8, 10, 89, 1000, 1234};
		System.out.println("������һ������");
		int num = scanner.nextInt();

		int beginIndex = 0;
		int endIndex = arr.length - 1;
		while(true){

			int midIndex = (endIndex + beginIndex) / 2;
			System.out.println(midIndex);

			if (arr[midIndex] == num) {
				System.out.println("�������ֵ��±�" + midIndex);
				break;
			} else if (arr[midIndex] > num) {
				endIndex = midIndex - 1;
			} else if (arr[midIndex] < num) {
				beginIndex = midIndex + 1;
			} 

			if (beginIndex > endIndex ) {
				System.out.println("û���������");
				break;
			} 


		}

		System.out.println("�������");
	}
}