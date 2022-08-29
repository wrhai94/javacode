public class Test501{ 
	public static void main (String[] args){
		double amount = 100000;
		double b = 50000;
		int count = 0;
		while (true){
			double fee = amount > b ? amount * 0.05 : 1000;
			if ( fee > amount) {
				System.out.println("余额不足，无法通过！");
				break;
			}
			amount -= fee;
			count++;
			System.out.println("本次缴费：" + fee);
			System.out.println("余额：" + amount);
		}

		System.out.println("通过路口次数：" + count);
	}


}