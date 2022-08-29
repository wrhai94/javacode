/**
 * 转义字符练习
 * @author 王锐海
 * @version 1.0
 */
public class ChangeChar{
	/**
	 *  姓名
	 */
	public static String NAME;
	/**
	年龄
	*/
	public static Integer AGE = 18;
	/**
	 * 性别
	 */
	public static String SEX;

	/**
	 * 主方法
	 */
	public static void main (String[] args){
		String numStr = "1.5";
		double num = Double.parseDouble(numStr);

		char c = 'W';
		String str = ""+c;

		System.out.println(num);		
		System.out.println(str);


		System.out.println("广州\t北京\t上海");
		System.out.println("王锐海在\r广州");
		System.out.println("王锐海在\n广州");
		System.out.println("王锐海在\r\n广州");
		System.out.println("王锐海在\n\r广州");

		System.out.println("书名\t作者\t价格\t销量");
		System.out.println("西游记\t罗贯中\t120\t1000");
		System.out.println("西游记\t罗贯中\t120\t1000");
	}
}