import java.util.Scanner;
public class Test502{ 
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��3λ������");
		int n = scanner.nextInt();

		if ( n < 100 || n > 999) {
			System.out.println("��������");
		} else {
			int n1 = n / 100;
			int n2 = (n - n1 * 100) / 10;
			int n3 = n % 10;
			System.out.println(n1 + " " + n2 + " " + n3);
			if ( n == n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3) {
				System.out.println(n + " ��ˮ�ɻ�����");
			} else {
				System.out.println(n + " ����ˮ�ɻ�����");
			}
		}
	}
}