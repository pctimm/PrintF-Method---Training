
public class Pontos {

	public static void main(String[] args) {
		int a = 21903; // qualquer valor
		// %d para números inteiros. Digamos que o meu formato tenha 10 casas inteiras.
		// Então, usar 10 como [tamanho], mostrando zeros (0).
		
		// Obs: Na frente se usa "0" zero e nenhum outro número, se não ele trata tudo como
		// [tamanho].
		// Ex: "Pts. %010d" -> Pts. 0000021903. "Pts. %110d" -> Pts.        (110 - 5 espaços)
		
		System.out.printf("Pts. %010d", a);
	}

}
