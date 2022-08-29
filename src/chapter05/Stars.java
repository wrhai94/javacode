import java.util.Scanner;
public class Stars{ 
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈë½ğ×ÖËş²ãÊı£º");
		int totalLevel = scanner.nextInt();

		for (int i = 1; i <= 2 * totalLevel -1; i++) {
			for (int j = 1; j <= Math.abs(totalLevel - i); j++) {
				System.out.print(" ");
			}

			int cs = i > totalLevel ? 2 * totalLevel - i : i;
			int num = 2 * cs -1;
			for (int j = 1; j <= num; j++) {
				if(j == 1 || j == num){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}