public class DoWhileExercise01{
	public static void main (String[] args){
		int i = 1;
		int n = 200;
		int sum = 0;
		int count = 0;
		do{
			System.out.println("i = " + i);
			sum += i;

			if (i % 5 == 0 && i % 3 != 0) {
				count++;
			}

			i++;
		} while (i <= n);
		System.out.println("sum = " + sum);
		System.out.println("count = " + count);
		System.out.println("============== ");
		System.out.println("³ÌÐò½áÊø");
	}
}