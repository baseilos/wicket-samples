package com.jozeflang.wicketpresentation.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class HelloWorldPage extends MasterPage {
	
	private static final long serialVersionUID = 1L;
	
	public HelloWorldPage() {
		init();
	}
	
	private void init() {
		Label helloWorld = new Label("helloworldLbl", Model.<String>of("Hello World Wicket"));
		add(helloWorld);
	}

}
