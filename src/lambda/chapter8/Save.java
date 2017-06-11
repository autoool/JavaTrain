package lambda.chapter8;

public class Save implements Action{

	private final Editor editor;
	
	public Save(Editor editor) {
		this.editor = editor;
	}
	
	@Override
	public void perform() {
		this.editor.save();		
	}
	
}
