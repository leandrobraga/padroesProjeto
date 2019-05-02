package bridge;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Carlos");
		mapa.put("idade", 32);
		
		GeradorArquivo gerador = new GeradorArquivoPropriedades(new ProcessaCriptografado());
		gerador.gerarArquivo("Cripto.txt", mapa);
		
		GeradorArquivo gerador1 = new GeradorArquivoXml(new ProcessaCompactado());
		gerador1.gerarArquivo("XML.zip", mapa);
		
		GeradorArquivo gerador2 = new GeradorArquivoPropriedades(new ProcessaDefault());
		gerador2.gerarArquivo("default.txt", mapa);
	}

}
