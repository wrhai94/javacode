package others;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang
 * @Date 2022/8/7
 */
public class Sfa {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'}, {'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";

        if (new Sfa().exist(board, word)){
            System.out.println("匹配成功");
        } else {
            System.out.println("匹配失败");
        }

    }

    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        int[][] pathBoard = new int[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(find(board, pathBoard, chars, 0, i, j)){
                    return true;
                }
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

        return false;
    }

    private boolean find(char[][] board, int[][] pathBoard, char[] chars, int index, int x, int y){
        if(board[x][y] != chars[index]){
            return false;
        }

        if(index + 1 == chars.length){
            return true;
        }

        pathBoard[x][y] = 1;

        List<int[]>[] nexts = getNexts(pathBoard, x, y);
        // 从下标0开始，即从下一个节点它的可走节点数少的开始
        for (int i = 0; i < nexts.length; i++) {
            if (nexts[i] == null){
                continue;
            }

            for (int[] next:nexts[i]){
                if(find(board, pathBoard, chars, index + 1, next[0], next[1])){
                    return true;
                }
            }
        }
        pathBoard[x][y] = 0;
        return false;
    }

    /**
     * 获取可走的下一个节点，并且根据它们再一个节点可走的节点数，存入数组对应下标中
     * @param pathBoard
     * @param x
     * @param y
     * @return
     */
    private List<int []>[] getNexts(int[][] pathBoard, int x, int y){
        ArrayList[] nexts = new ArrayList[5];
        int nextSize = 0;
        if(x + 1 < pathBoard.length && pathBoard[x + 1][y] != 1){
            nextSize = getNextSize(pathBoard, x + 1, y);
            if (nexts[nextSize] == null){
                nexts[nextSize] = new ArrayList();
            }
            nexts[nextSize].add(new int[]{x + 1, y});
        }
        if(x - 1 >= 0 && pathBoard[x - 1][y] != 1){
            nextSize = getNextSize(pathBoard,x - 1, y);
            if (nexts[nextSize] == null){
                nexts[nextSize] = new ArrayList();
            }
            nexts[nextSize].add(new int[]{x - 1, y});
        }
        if(y + 1 < pathBoard[x].length && pathBoard[x][y + 1] != 1){
            nextSize = getNextSize(pathBoard, x, y + 1);
            if (nexts[nextSize] == null){
                nexts[nextSize] = new ArrayList();
            }
            nexts[nextSize].add(new int[]{x, y + 1});
        }
        if(y - 1 >= 0 && pathBoard[x][y - 1] != 1){
            nextSize = getNextSize(pathBoard, x, y - 1);
            if (nexts[nextSize] == null){
                nexts[nextSize] = new ArrayList();
            }
            nexts[nextSize].add(new int[]{x, y - 1});
        }
        return nexts;
    }

    /**
     * 获取下一个节点有多少可走节点
     * @param pathBoard
     * @param x
     * @param y
     * @return
     */
    private int getNextSize(int[][] pathBoard, int x, int y){
        int size = 0;
        if(x + 1 < pathBoard.length && pathBoard[x + 1][y] != 1){
            size++;
        }
        if(x - 1 >= 0 && pathBoard[x - 1][y] != 1){
            size++;
        }
        if(y + 1 < pathBoard[x].length && pathBoard[x][y + 1] != 1){
            size++;
        }
        if(y - 1 >= 0 && pathBoard[x][y - 1] != 1){
            size++;
        }
        return size;
    }
}
