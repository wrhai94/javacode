public class Test{
	public static void main (String[] args){
		// boolean x = true;
		// boolean y = false;
		// short z = 46;
		// if ((z++ == 46) && (y = true))
		// 	z++;
		// if ((x = false) || (++z == 49))
		// 	z++; 
		// System.out.println(z);

		// int a = 10;
		// System.out.println(++a * 3);
		// int b = 10;
		// System.out.println(b++ * 3);
		// int c = 10;
		// int d = 5;
		// d += c + 3;
		// System.out.println(d);


        boolean x = true;
        boolean y = false;
        short z = 46;
        if ((z++ == 46) && (y = true))
            z++;
        if ((x = false) || (++z == 49))
            z++; 
        System.out.println(z);
	}
}