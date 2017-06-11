package lambda.chapter8;

import org.junit.Test;

public class MacroTest {
	
	@Test
	public void command(){
		MockEditor editor = new MockEditor();
		Macro macro = new Macro();
		macro.record(new Open(editor));
		macro.record(()->editor.save());
		macro.record(editor::close);
		macro.run();
//		editor.check();
	}
}
