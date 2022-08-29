package chapter19;

import java.io.*;
import java.util.Properties;

/**
 * @Author Wang
 * @Date 2022/7/12
 */
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileReader("e://mytemp/dog.properties"));
        Dog dog = new Dog(properties.getProperty("name")
                , Integer.valueOf(properties.getProperty("age"))
                , properties.getProperty("color"));

        System.out.println(dog);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("e://mytemp/dog.dat"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("e://mytemp/dog.dat"));
        Object o = objectInputStream.readObject();
        System.out.println("反序列化");
        System.out.println(o);
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
