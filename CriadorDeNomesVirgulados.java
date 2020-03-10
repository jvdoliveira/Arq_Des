package factory;

public class CriadorDeNomesVirgulados implements CriadorDeNomes {

	@Override
	public Nome criar(String s) {
		//Gosling, James
		int pos = s.indexOf(',');
		String sobrenome = s.substring(0, pos);
		String nome = s.substring(pos+2,s.length());
		return new Nome(nome, sobrenome);
	}

}
