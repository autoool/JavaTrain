package lambda.chapter8;

import java.awt.RenderingHints;

public class Close implements Action{

private final Editor editor;
	
	public Close(Editor editor) {
	this.editor = editor;
	}
	
	@Override
		public void perform() {
		this.editor.close();			
		}
}
