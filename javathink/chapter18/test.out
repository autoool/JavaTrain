package chapter18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Redirecting {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PrintStream consol = System.out;
		BufferedInputStream in = new 
				BufferedInputStream(new FileInputStream("H:/JavaProjectOne/JavaTrain/javathink/chapter18/Redirecting.java"));
		PrintStream out = new PrintStream(new BufferedOutputStream(
				new FileOutputStream("H:/JavaProjectOne/JavaTrain/javathink/chapter18/test.out")));
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=bReader.readLine())!=null){
			System.out.println(s);
		}
		out.close();
		System.setOut(consol);
	}

}
