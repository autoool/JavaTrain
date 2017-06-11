package lambda.chapter8;

public class Open implements Action{

	private final Editor editor;
	
	public Open(Editor editor) {
	this.editor = editor;
	}
	
	@Override
	public void perform() {
		this.editor.open();		
	}
}
