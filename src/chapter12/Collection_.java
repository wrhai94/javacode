package chapter12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_ {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.ensureCapacity(10);
        list.add("aaa");
        list.iterator();
        Set s = new HashSet();
        for (int i = 0; i < 12; i++) {
            s.add(new String("wrh" + i));
        }
        s.add("wrh");
    }




    public void m1(){
        System.out.println("调用");
    }
}
