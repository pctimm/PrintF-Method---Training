
public class Paragrafo {

	public static void main(String[] args) {
		int linhaCaracteres = 50;
		int paragrafoCaracteres = 5;
		
		String titulo = "As propriedades eletromagnéticas de uma batata"; // seria bom um sublinhado
		String linha1 = "Batatas são comumente reconhecidas como fonte";
		String linha2 = "rica de alimentação, para o preparo de diversos";
		String linha3 = "pratos, de vez em quando gordurosos.";
		
		int tituloCaracteres = titulo.length();
		// System.out.println(tituloCaracteres); 46 caracteres.
		// int espacosTitulo = (linhaCaracteres - tituloCaracteres) / 2; 2 caracteres
		
		char espaco = ' ';
		System.out.printf("%-2c%s%2c\n", espaco, titulo, espaco);
		System.out.println();
		System.out.printf("%-5c%-45s\n", espaco, linha1);
		System.out.printf("%-50s\n", linha2);
		System.out.printf("%-50s", linha3);
		
		// Não consigo utilizar a variavel linhaCaracteres dentro da String do printf().
	}

}
