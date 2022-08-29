public class Dg{ 
	private static int[] a;
	private static int[] b;
	private static int[] c;

	public static void main (String[] args){
		a = new int[]{5, 4, 3, 2, 1};
		b = new int[5];
		c = new int[5];
		change(4);
		printAll();
 	}

 	private static void change (int index) {
 		if (index >= 0){
 			printAll();
 			int curIndex = b.length - 1 - index;
 			b[curIndex] = a[index];
 			a[index] = 0;
 			change(index - 1);
 			c[index] = b[curIndex];
 			b[curIndex] = 0;
 			printAll();
 		}
 	}


	private static void printAll(){
		print(a);
		print(b);
		print(c);
		System.out.println("---------------------------");
	}

 	private static void print(int[] arr){
 		for (int i = 0; i < arr.length; i++) {
 			System.out.print(arr[i] + " ");
 		}
 		System.out.println("");
 	}


}