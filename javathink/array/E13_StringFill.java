package array;

import java.util.Arrays;
import java.util.List;

import javax.print.StreamPrintService;

import net.mindview.util.Print;

public class E13_StringFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new CountingGenerator.String(15).next();
		Print.print(s);
		String[] strs = {"123","234"};
		List<String> lStrings = Arrays.asList(strs);
		Print.print(lStrings);
	}

}
