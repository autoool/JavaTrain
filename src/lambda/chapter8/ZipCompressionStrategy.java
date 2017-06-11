package lambda.chapter8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

public class ZipCompressionStrategy implements CompressionStrategy{
	
	@Override
	public OutputStream compress(OutputStream data) throws IOException {
		// TODO Auto-generated method stub
		return new ZipOutputStream(data);
	}

}
