package chapter06;

public class StaticInnerSingleton {

	/*
	 * 静态内之类实现单例模式
	 */
	private static class SingletonObject {
		private static StaticInnerSingleton Instance = new StaticInnerSingleton();
	}

	private String content;

	private StaticInnerSingleton() {
		// TODO Auto-generated constructor stub
	}

	public static StaticInnerSingleton getInstance(String content) {
		SingletonObject.Instance.setContent(content);
		return SingletonObject.Instance;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println(String.valueOf(super.hashCode()) + ": " + this.content);
		return super.hashCode();
	}

}
