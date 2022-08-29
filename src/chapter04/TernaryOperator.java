public class TernaryOperator{
	public static void main (String[] args){
		int a = 24;
		int b = 63;
		int c = 12;

		int max = (a > b)? a : b;
		max = (max > c)? max : c;
		System.out.println(max);

		System.out.println((byte)((byte)-1>>>27));
		System.out.println((byte)(-128>>>1));
		System.out.println(-10.5%3);
		System.out.println(11%3.2);

		System.out.println(010);

		int i = 10;
		int y = 10;
		i = i++ + ++i;
		System.out.println("i = " + i);
	}
}