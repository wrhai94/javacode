import java.util.Scanner;
public class ArrayAdd{ 
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[]{1, 2, 3};
		char isContinue = 'y'; 
		do{
			System.out.println("请输入增加的数组：");
			int newNum = scanner.nextInt();

			int[] newArr = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			newArr[arr.length] = newNum;
			arr = newArr;

			System.out.println("是否继续y/n：");
			isContinue = scanner.next().charAt(0);
		} while (isContinue == 'y');
		

		System.out.print("arr = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}