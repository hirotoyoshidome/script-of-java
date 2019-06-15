package jp.yoru722.java.script;

/**
 * 6 * 6のマス目で経路を考える main実行ファイル
 * 
 * @author hiroto
 *
 */
public class RouteMain {
	public static void main(String[] args) {
		// マス目
		final short HEIGHT = 6;
		final short WIDTH = 6;

		// ゴールの座標
		final short goal_x = 3;
		final short goal_y = 4;

		// 自分の位置
		short own_x = 0;
		short own_y = 5;

		// スタート位置からゴールまでの最短距離
		short range_x = (short) (goal_x - own_x);
		short range_y = (short) (goal_y - own_y);

		// イメージとしてはこんな感じ(自分の位置を●で表現)
		for (int i = 0; i < HEIGHT; i++) {
			System.out.println();
			for (int j = 0; j < WIDTH; j++) {
				if (i == own_y && j == own_x) {
					System.out.print("S");
				} else if (i == goal_y && j == goal_x) {
					System.out.print("G");
				} else {
					System.out.print("○");
				}
			}
		}
		System.out.println("\n");
		// 最短距離を出力
		System.out.println("x : " + absShort(range_x) + ", y : " + absShort(range_y));

	}

	/**
	 * 絶対値で出力する
	 * 
	 * @param x
	 * @return
	 */
	private static short absShort(short x) {
		return (short) (x > 0 ? x : -x);
	}
}
