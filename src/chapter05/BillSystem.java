import java.util.Scanner;
public class BillSystem{ 
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = scanner.nextInt();

		System.out.println("���������䣺");
		int age = scanner.nextInt();

		double price =  60.0;
		if (month >= 4 && month <= 10) {
			if (age > 60) {
				price = 20;
			} else if (age < 18) {
				price = 30;
			} 
		} else {
			if ( age >= 18 && age <= 60) {
				price = 40;
			} else {
				price = 20;
			}
		}

		System.out.println("Ʊ�ۣ�" + price);
	}
}