import java.util.Scanner;
public class MulForExercise01{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int b = 3;
		int count = 5;
		double sum = 0;
		int jg = 0;
		for (int i = 0; i < b; i++) {
			double bSum = 0;
			for (int j = 0; j < count; j++) {
				double score = scanner.nextDouble();
				bSum += score;

				if (score >= 60.0) {
					jg++;
				}
			}
			System.out.println(b + "班平均分：" + (bSum / count));
			sum += bSum;
		}

		System.out.println("所有班级平均分：" + (sum / (count * b)));
		System.out.println("及格人数：" + jg);
	}
}