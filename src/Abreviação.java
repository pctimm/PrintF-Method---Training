
public class Abreviação {

	public static void main(String[] args) {
		String texto = "Oblíquo";  // qualquer palavra legal do dicionário.
		
		System.out.printf("%s\n", texto);  // a String inteira.
		
		System.out.printf("%.3s.", texto); // . para diminuir o tamanho de caracteres (String).
		
		// OBS: Ao usar o número sem o ponto, como tentei: "%3s.", eram mostrados todos os
		// caracteres da String (então significa: número minimo de caracteres, mas não quer dizer
		// que serão justamente 3 caracteres).
		
		// Agora, com "." antes do número, é feito um corte da String, assim se tem uma
		// abreviação :)

	}

}
