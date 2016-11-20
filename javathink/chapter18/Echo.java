package chapter18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String str;
	while ((str=stdin.readLine())!=null&&str.length()!=0) {
		System.out.println(str);
		if (str.equals("exit")) {
			return;
		}
	}
		
	}

}
