package Dovelet;

import java.util.*;

public class measure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double len = sc.nextDouble();
		double dot[][] = new double[4][3];

		for (int i = 1; i <= 3; ++i) {
			dot[i][1] = sc.nextDouble();
			dot[i][2] = sc.nextDouble();
		}
		sc.close();

		for (int i = 1; i <= 3; ++i) {
			if (dot[i][1] != dot[i][2]) {
				double loc = (double) (dot[i][1] + dot[i][2]) / 2.0;
				if (loc < len - loc) {
					for (int j = i + 1; j <= 3; ++j) {
						for (int k = 1; k <= 2; ++k) {
							if (dot[j][k] > loc)
								dot[j][k] = len - dot[j][k];
							else
								dot[j][k] += (len - loc - loc);
						}
					}
					len -= loc;
				} else {
					for (int j = i + 1; j <= 3; ++j) {
						for (int k = 1; k <= 2; ++k) {
							if (dot[j][k] > loc)
								dot[j][k] = loc - (dot[j][k] - loc);
						}
					}
					len = loc;
				}
			}
		}
		System.out.println(len);

	}
}
