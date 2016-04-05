package algoritmos;

import java.util.Arrays;

public class Ex2 {

	public static int c(int p, int[] a) {
		int i = 0, ap = a[a.length - 1];
		if (a.length == 1) {
			if (p % ap == 0) {
				return p / ap;
			}
			return 0;
		}
		int min = 0;
		while (true) {
			int s = i * ap;

			if (s > p) {
				break;
			}
			int r = c(p - s, Arrays.copyOf(a, a.length - 1));
			if (r != 0) {
				if (min == 0 || r + i < min) {
					min = r + i;
				}
			}
			i++;
		}
		return min;
	}

	public static int d(int p, int a[]) {
		int i = 0;
		int min = 0;
		int valorRestante = p;
		for (int j = a.length - 1; j >= 0; j--) {
			int ap = a[j];
			while (true) {
				int valoresSomadosMoedas = 1 * ap;
				if (valoresSomadosMoedas > valorRestante) {
					break;
				}
				valorRestante -= valoresSomadosMoedas;

				int r = d(p - valoresSomadosMoedas, Arrays.copyOf(a, a.length - 1));
				if (r != 0) {
					if (min == 0 || r + i < min) {
						min = r + i;
					}
				}
			}

		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(c(127, new int[] { 1, 5, 25, 50 }));
		System.out.println(c(62, new int[] { 3, 10, 50 }));
	}
}
