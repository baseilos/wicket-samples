package com.jozeflang.wicketpresentation.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

import com.jozeflang.wicketpresentation.pages.ErrorPage;
import com.jozeflang.wicketpresentation.pages.HelloWorldPage;
import com.jozeflang.wicketpresentation.pages.HomePage;
import com.jozeflang.wicketpresentation.pages.MasterPage;
import com.jozeflang.wicketpresentation.pages.PropertyModelAjaxPage;
import com.jozeflang.wicketpresentation.pages.PropertyModelPage;
import com.jozeflang.wicketpresentation.pages.UserInfoPage;

public class WicketApplication extends WebApplication
{
	
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

	@Override
	public void init()
	{
		super.init();
		mountPage("/helloWorld", HelloWorldPage.class);
		mountPage("/propertyModel", PropertyModelPage.class);
		mountPage("/propertyModelAJAX", PropertyModelAjaxPage.class);
		mountPage("/userInfo", UserInfoPage.class);
		mountPage("/error", ErrorPage.class);
	}
	
}
