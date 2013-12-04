package com.jozeflang.wicketpresentation.pages;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.OnChangeAjaxBehavior;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;

public class PropertyModelAjaxPage extends MasterPage {
	private static final long serialVersionUID = 1L;
	private String inputText;
	public PropertyModelAjaxPage() {
		init();
	}
	private void init() {		
		final IModel<String> model = new PropertyModel<String>(this, "inputText");
		final Label inputTextLbl = new Label("inputTextLbl", model);
		inputTextLbl.setOutputMarkupId(true);
		add(inputTextLbl);
		Form<String> form = new Form<String>("form");
		TextField<String> tf = new TextField<String>("inputText", model);
		tf.setOutputMarkupId(true);
		tf.add(new OnChangeAjaxBehavior() {
			private static final long serialVersionUID = 1L;
			@Override
			protected void onUpdate(AjaxRequestTarget target) {
				target.add(inputTextLbl);
			}
			
		});
		form.add(tf);
		add(form);
	}
}
