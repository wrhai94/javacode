public class Test501{ 
	public static void main (String[] args){
		double amount = 100000;
		double b = 50000;
		int count = 0;
		while (true){
			double fee = amount > b ? amount * 0.05 : 1000;
			if ( fee > amount) {
				System.out.println("���㣬�޷�ͨ����");
				break;
			}
			amount -= fee;
			count++;
			System.out.println("���νɷѣ�" + fee);
			System.out.println("��" + amount);
		}

		System.out.println("ͨ��·�ڴ�����" + count);
	}


}