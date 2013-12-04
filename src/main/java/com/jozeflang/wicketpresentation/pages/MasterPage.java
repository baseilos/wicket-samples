package com.jozeflang.wicketpresentation.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.model.IModel;

public abstract class MasterPage extends WebPage {

	private static final long serialVersionUID = 1L;
	
	public MasterPage() {
		super();
		init();
	}
	
	public MasterPage(IModel<?> model) {
		super(model);
	}
	
	private void init() {
		add(new BookmarkablePageLink<HomePage>("homeLink", HomePage.class));
	}

}
