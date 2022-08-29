package chapter16.homework;

import java.util.Scanner;

/**
 * @Author Wang
 * @Date 2022/7/8
 */
public class Homework01 {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        Thread thread1 = new Thread(printNumber);
        Thread thread2 = new Thread(new EnterChar(printNumber));
        thread1.start();
        thread2.start();
    }
}

class PrintNumber implements Runnable{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){
            System.out.println((int)(Math.random() * 100));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


class EnterChar implements Runnable{
    private PrintNumber p;
    public EnterChar(PrintNumber p) {
        this.p = p;
    }

    @Override
    public void run() {
        char c;
       {
           Scanner scanner = new Scanner(System.in);
           c = scanner.next().charAt(0);
        } while (c != 'Q');
        System.out.println("退出");
        p.setLoop(false);
    }
}