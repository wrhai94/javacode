public class MiGong{
	public static void main (String[] args){
		int[][] map = 
			{
				{1, 1, 1, 1, 1, 1, 1}
				,{1, 0, 0, 0, 0, 0, 1}
				,{1, 0, 1, 0, 0, 0, 1}
				,{1, 1, 1, 0, 0, 0, 1}
				,{1, 0, 0, 0, 0, 0, 1}
				,{1, 0, 0, 0, 0, 0, 1}
				,{1, 0, 0, 0, 0, -1, 1}
				,{1, 1, 1, 1, 1, 1, 1}
			};

		Person p = new Person();
		p.map = map;
		p.run(1, 1);

		System.out.println("路线：");
		for (int i =0; i< map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + ",");
			}
			System.out.println("");
		}
	}
}

class Person {
	// public int x = 1,y = 1;

	public int[][] map;

	public boolean run(int x, int y){
		if (map[x][y] == 1 || map[x][y] == 3){
			return false;
		} 

		System.out.println("当前位置:" + x + ", "+ y);

		if (map[x][y] == -1){
			System.out.println("到底终点！");
			return true;
		}

		map[x][y] = 3;

		if (run(x + 1, y))
			return true;
		else if(run(x, y + 1))
			return true;
		else if(run(x-1, y))
			return true;
		else if(run(x, y - 1))
			return true;
		// if (bx != 0 && by != 0) {
		// 	x = bx;
		// 	y = by;
		// }
		return false;
	}
}