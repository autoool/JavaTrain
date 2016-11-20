package chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.message.BufferedHeader;

public class BufferedWriterTest {

	public static void main(String[] args) {		
		String content[] = {"好久不见","最近好吗","常联系"};
		File file = new File("butteredtest.txt");
		try {
			FileWriter fWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fWriter);
			for (int i = 0; i < content.length; i++) {
				bufferedWriter.write(content[i]);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			fWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			FileReader fReader = new FileReader(file);		
			BufferedReader bufferedReader = new BufferedReader(fReader);		
			String s = null;
			int i=0;
			while ((s=bufferedReader.readLine())!=null) {
				i++;
				System.out.println("第"+i+"行："+ s);
			}
			bufferedReader.close();
			fReader.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
