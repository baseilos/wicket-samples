package com.jozeflang.wicketpresentation.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;

public class PropertyModelPage extends MasterPage {
	private static final long serialVersionUID = 1L;
	private String inputText;
	public PropertyModelPage() {
		init();
	}
	private void init() {		
		final IModel<String> model = new PropertyModel<String>(this, "inputText");
		Label inputTextLbl = new Label("inputTextLbl", model);
		add(inputTextLbl);
		Form<String> form = new Form<String>("form") {
			private static final long serialVersionUID = 1L;
			@Override
			protected void onSubmit() {
				super.onSubmit();
			}
		};
		form.add(new TextField<String>("inputText", model));
		add(form);
	}
}
