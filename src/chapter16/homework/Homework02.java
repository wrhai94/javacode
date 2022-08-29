package chapter16.homework;

/**
 * @Author Wang
 * @Date 2022/7/9
 */
public class Homework02 {
    public static void main(String[] args) {
        Card card = new Card(10000);
        User u1 = new User(card);
        User u2 = new User(card);
        u1.start();
        u2.start();
    }
}

class User extends Thread {
    private Card c;

    public User(Card c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            c.getAmount(1000);

            if (c.getBanlance() < 1000) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Card {
    private double banlance;

    public Card(double banlance) {
        this.banlance = banlance;
    }

    public synchronized void getAmount(double amount) {
        if (banlance < amount) {
            System.out.println("余额不足无法取款。" + banlance );
        } else {
            banlance -= amount ;
        }
        System.out.println(Thread.currentThread().getName() + " 取出 " + amount + ",卡内余额：" + banlance);
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }


    @Override
    public String toString() {
        return "banlance = " + banlance;
    }
}
