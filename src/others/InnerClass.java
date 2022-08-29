package others;

/**
 * @Author Wang
 * @Date 2022/7/27
 */
public class InnerClass {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        String  name = "老王";

        class Person{
            public void showName(){
                System.out.println(name);
            }
        }


        Person person = new Person();
        person.showName();
    }
}
