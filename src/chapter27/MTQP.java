package chapter27;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang
 * @Date 2022/7/30
 */
public class MTQP {
    int[][] chessboard;
    int max = 0;
    int maxStep = 0;
//    List list = new ArrayList<Integer[]>();
    public static void main(String[] args) {
        MTQP mtqp = new MTQP(8);
        long start = System.currentTimeMillis();
        boolean run = mtqp.run(0, 0, 1);
        if (!run){
            System.out.println("无解");
            return;
        }
        long end = System.currentTimeMillis();
        for (int i = 0; i < mtqp.chessboard.length; i++) {
            for (int y = 0; y < mtqp.chessboard[i].length; y++){
                System.out.print(mtqp.chessboard[i][y] + "\t");
            }
            System.out.println("");
        }

        System.out.println("耗时:" + (end-start));
    }

    public MTQP(int max) {
        this.max = max;
        this.maxStep = max*max;
        chessboard = new int[max][max];
    }

    public boolean run(int x, int y, int step){
        if (!((0 <= x && x < max) && (0 <= y && y < max))){
            return false;
        }

        if (chessboard[x][y] != 0){
            return false;
        }

//        canStep = (step>canStep)?step:canStep;
        chessboard[x][y] = step;

        if (step == maxStep) {
            return true;
        }

        if(run(x+2, y-1, step + 1)){
            return true;
        }
        if(run(x+2, y+1, step + 1)){
            return true;
        }
        if(run(x+1, y+2, step + 1)){
            return true;
        }
        if(run(x-1, y+2, step + 1)){
            return true;
        }
        if(run(x-2, y+1, step + 1)){
            return true;
        }
        if(run(x-2, y-1, step + 1)){
            return true;
        }
        if(run(x+1, y-2, step + 1)){
            return true;
        }
        if(run(x-1, y-2, step + 1)){
            return true;
        }

        chessboard[x][y] = 0;
        return false;
    }
}
