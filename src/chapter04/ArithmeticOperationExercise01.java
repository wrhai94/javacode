public class ArithmeticOperationExercise01{
	public static void main (String[] args){
		int i = 1;
		i = i++;
		System.out.println("i = " + i);

		//�ȼ���
		int i2 = 1;
		int temp = i2; // temp = 1
		i2++;	// i2 = 2;
		i2 = temp; // i2 = 1
		System.out.println("i2 = " + i2);

		//��59�����
		int day = 59;
		int wk = 59 / 7;
		int balanceDay = 59 % 7;
		System.out.println("�� " + wk + " �������� " + balanceDay + " ��");

		double hs = 234.5;
		double wd = 5.0 / 9 * (hs - 100);
		System.out.println("�¶� = " + wd);
	}
}