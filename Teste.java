package factory;

public class Teste {

	public static void main(String[] args) {
		String[] lista = {"McNealy, Scott", "James Gosling", "Naughton, Patrick"};
		//se nada for passado como parâmetro
		if(args.length == 0) {
			args = lista;
		}
		Nomes nomes = new Nomes(args);
	}

}
