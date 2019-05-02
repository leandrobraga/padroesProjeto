package bridge;

import java.util.Map;
import java.io.IOException;

public class GeradorArquivoPropriedades extends GeradorArquivo {
	
	public GeradorArquivoPropriedades(Processador processador) {
		super(processador);
	}
	
	@Override
	protected String gerarConteudo(Map<String, Object> propriedades) {
		StringBuilder propFileBuilder = new StringBuilder();
		for (String prop : propriedades.keySet()) {
			propFileBuilder.append(prop+"="+propriedades.get(prop)+"\n");
		}
		return propFileBuilder.toString();
	}
}
