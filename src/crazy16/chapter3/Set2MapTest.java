package crazy16.chapter3;

/**
 * Created by zchao on 2017/3/30.
 */
public class Set2MapTest {

    public static void main(String[] args) {
        Set2Map<String, Integer> scores = new Set2Map<>();
        scores.put("数学", 99);
        scores.put("英语", 130);
        scores.put("语文", 140);
        System.out.println(scores);
    }
}
