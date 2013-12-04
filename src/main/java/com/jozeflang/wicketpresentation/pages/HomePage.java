package com.jozeflang.wicketpresentation.pages;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends MasterPage {

	private static final long serialVersionUID = 1L;

	public HomePage() {
		init();
	}
	
	private void init() {
		add(new BookmarkablePageLink<HelloWorldPage>("helloWorld", HelloWorldPage.class));
		add(new BookmarkablePageLink<PropertyModelPage>("propertyModel", PropertyModelPage.class));
		add(new BookmarkablePageLink<PropertyModelAjaxPage>("propertyModelAJAX", PropertyModelAjaxPage.class));
		add(new BookmarkablePageLink<UserInfoPage>("form", UserInfoPage.class));
		add(new BookmarkablePageLink<UserInfoPage>("error", ErrorPage.class));
	}
}
