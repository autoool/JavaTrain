package javain_terview;

import org.junit.Test;

/**
 * Created by zchao on 2017/3/31.
 */
public class Chapter05 {

    @Test
    public void test52() {
        int i = "abc".length();
        float f1 = 1.0f;
        Float floatValue = new Float(f1);
        Double dl = floatValue.doubleValue();
        //12 34  6+16*5 = 86;
        int value = 012;

        char x = 'x';
        i = 10;
        System.out.println(false ? i : x);
        System.out.println(false ? 10 : x);

    }

    public static void main() {

    }
}
