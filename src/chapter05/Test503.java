public class Test503{ 
	public static void main (String[] args){
		// for (int i = 97; i < 97 + 26; i++) {
		// 	System.out.println((char)i);
		// }

		// for (int i = 71 ; i < 71 +26; i++) {
		// 	System.out.println((char)i);
		// }
		int n = 100;
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				sum += 1.0 / i;
			}else{
				sum -= 1.0 / i;
			}
		}
		System.out.println(sum);	
	}
}