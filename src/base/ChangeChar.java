/**
 * ת���ַ���ϰ
 * @author ����
 * @version 1.0
 */
public class ChangeChar{
	/**
	 *  ����
	 */
	public static String NAME;
	/**
	����
	*/
	public static Integer AGE = 18;
	/**
	 * �Ա�
	 */
	public static String SEX;

	/**
	 * ������
	 */
	public static void main (String[] args){
		String numStr = "1.5";
		double num = Double.parseDouble(numStr);

		char c = 'W';
		String str = ""+c;

		System.out.println(num);		
		System.out.println(str);


		System.out.println("����\t����\t�Ϻ�");
		System.out.println("������\r����");
		System.out.println("������\n����");
		System.out.println("������\r\n����");
		System.out.println("������\n\r����");

		System.out.println("����\t����\t�۸�\t����");
		System.out.println("���μ�\t�޹���\t120\t1000");
		System.out.println("���μ�\t�޹���\t120\t1000");
	}
}