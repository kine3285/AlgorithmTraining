package Dovelet;

import java.util.*;

public class robot {
	static char[][] map;
	static int[][] visit;
	static int cnt;
	static int r;
	static int c;

	public static void travel(int i, int j) {
		cnt++;
		if (i < 0 || i >= r || j < 0 || j >= c) {
			System.out.println(cnt - 1 + " step(s) to exit");
			return;
		} else if (visit[i][j] == 0) {
			visit[i][j] = cnt;

			if (map[i][j] == 'N') {
				travel(i - 1, j);
			} else if (map[i][j] == 'E') {
				travel(i, j + 1);
			} else if (map[i][j] == 'S') {
				travel(i + 1, j);
			} else if (map[i][j] == 'W') {
				travel(i, j - 1);
			}

		} else if (visit[i][j] != 0) {
			System.out.print(visit[i][j] - 1 + " step(s) before a loop of " + (cnt - visit[i][j]) + " step(s)");
			return;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		int start = sc.nextInt();
		map = new char[r][c];
		visit = new int[r][c];
		cnt = 0;
		String[] s = new String[r + 1];
		for (int i = 0; i <= r; i++) {
			s[i] = sc.nextLine();
			for (int j = 0; j < c; j++) {
				if (i > 0) {
					map[i - 1][j] = s[i].charAt(j);
				}
			}
		}
		travel(0, start - 1);
	}
}
