package lambda.test;

public class SplitTest {

	public static void main(String[] args) {
		
//		AtomicInteger count = new AtomicInteger();
//		count.addAndGet(1);count.addAndGet(2);
//		System.out.println(count);
		SplitTest splitTest = new SplitTest();
		System.out.println(splitTest.caculateNum());
		
		
//		Map<String, String> maps = new HashMap<>();
//		maps.put("111", "aaa");
//		maps.put("222", "bbb");
//		maps.put("333", "ccc");
//		
//		for( Entry<String,String> entry:maps.entrySet()){
//			System.out.println(entry.getValue());
//		}
//		
//		Set<String> setStr = maps.keySet();
//		List<String> mapValues = new ArrayList<>(maps.values()) ;
//		if (mapValues.contains("222")) {
//			
//		}
//		SimpleDateFormat
//		LocalDateTime
//		DateTimeFormatter
		
		
		// String string = "a,b,c,,";
		// String[] ary = string.split(",");
		// System.out.print(ary.length);
		// List listStr = Arrays.asList(ary);
		//// listStr.add("123");
		// System.out.println(ary);

/*		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		for (String temp : a) {
			if ("2".equals(temp)) {
				a.remove(temp);
			}
		}*/
//		boolean isExist = true;
//		Boolean boolean1 = Boolean.TRUE;
//		if (isExist==1) {
//			System.out.println("true");
//		}
//		System.out.println(isExist);

	}
	
	private int caculateNum() {
		try {
			int a = 0;
			return a;
		}catch (NullPointerException e) {
				// TODO: handle exception
		
		} catch (Exception e) {
			
			// TODO: handle exception
		}finally {
//			return 4;
		}
		return 3;
	}
}
