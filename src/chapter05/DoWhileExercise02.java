import java.util.Scanner;
public class DoWhileExercise02{
	public static void main (String[] args){
		char a = 'n';
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("��������Ǯ��");
			a = scanner.next().charAt(0);
		} while (a == 'n');

		System.out.println("�������");
	}
}