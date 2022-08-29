public class ArrayExercise01{ 
	public static void main (String[] args){
		char cs[] = new char[26];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = (char)('A' + i);
		}

		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}

		double num[] = new double[]{4, -1.9, 10, 23};
		int maxIndex = 0;
		double max = num[maxIndex];
		for (int i = 0; i < num.length; i++)  {
			if (num[i] > max) {
				max = num[i];
				maxIndex = i;
			}
		}

		System.out.println("最大值：" + max);
		System.out.println("最大值下标：" + maxIndex);
	}
}