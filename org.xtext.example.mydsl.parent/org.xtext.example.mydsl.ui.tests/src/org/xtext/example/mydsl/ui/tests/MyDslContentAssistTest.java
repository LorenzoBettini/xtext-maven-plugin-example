package org.xtext.example.mydsl.ui.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.ui.testing.AbstractContentAssistTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(MyDslUiInjectorProvider.class)
public class MyDslContentAssistTest extends AbstractContentAssistTest {
	@Test
	public void testImportCompletion() throws Exception {
		newBuilder()
			.append("Hello Xtext { val LinkedHashSet")
			.assertText("java.util.LinkedHashSet");
	}
}
