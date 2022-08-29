public class Queens{
	public static void main (String[] args){
		int[][] board = new int[8][8];
		T t = new T();
		t.play(0, board);
		System.out.println(t.count);
	}
}

class T {
	public long count = 0;
	public void play(int row, int[][] board){
		for(int i = 0; i < board.length; i++){
			board[row] = new int[8];
			board[row][i] = 1;

			boolean isDeath = false;
			for (int j = 0; j < row - 1; j++) {
				if (row == 0) {
					break;
				}

				if (board[j][i] == 1) {
					isDeath = true;
					break;
				}

				int diff = Math.abs(i - j);
				if (i - diff >= 0 && board[j][i - diff] == 1) {
					isDeath = true;
					break;
				}

				if (i + diff < 8 && board[j][i + diff] == 1) {
					isDeath = true;
					break;
				}
			}

			if (isDeath) {
				continue;
			}

			if (row == board.length - 1) {
				++count;
			} else {
				play(row + 1, board);
			}
		}
	}
}