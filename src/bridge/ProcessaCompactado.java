package bridge;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class ProcessaCompactado implements Processador {
	@Override
	public byte[] processaConteudo(byte[] bytes)  throws IOException{
		ByteArrayOutputStream byteout = new ByteArrayOutputStream();
		ZipOutputStream out = new ZipOutputStream(byteout);
		out.closeEntry();
		out.close();
		return byteout.toByteArray();	
	}
}
