package chapter22;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author Wang
 * @Date 2022/7/20
 */
public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> fileClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor declaredConstructor:declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor<?> constructor = fileClass.getConstructor(String.class);
        Object o = constructor.newInstance("e://mynew.txt");
        Method createNewFile = fileClass.getMethod("createNewFile");
        createNewFile.invoke(o);
    }
}
