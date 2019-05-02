package templateMethod;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Carlos");
		mapa.put("idade", 32);
		
		GeradorArquivo gerador = new GeradorArquivoPropriedadesCriptografado();
		gerador.gerarArquivo("Cripto.txt", mapa);
		
		GeradorArquivo gerador1 = new GeradorArquivoXmlCompactado();
		gerador1.gerarArquivo("XML.zip", mapa);	

	}

}