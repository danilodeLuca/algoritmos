package algoritmos;

public class Ex1 {
	public static int a(int n) {
		if (n <= 1) {
			return 1;
		}
		return 1 + a(n - 1) + a(n - 2);
	}

	public static int b(int n) {
		int retorno = 1, retornoAnterior = 1;
		for (int i = 2; i <= n; i++) {
			int aux = retorno;
			retorno += 1 + retornoAnterior;
			retornoAnterior = aux;
		}
		return retorno;
	}

	public static void main(String[] args) {
		for (int i = 1; i < args.length; i++) {
			System.out.println(b(Integer.parseInt(args[i])));
		}
	}

}
