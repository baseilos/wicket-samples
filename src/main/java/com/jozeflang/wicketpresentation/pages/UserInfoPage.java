package com.jozeflang.wicketpresentation.pages;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.validation.validator.EmailAddressValidator;

import com.jozeflang.wicketpresentation.app.UserInfo;

public class UserInfoPage extends MasterPage {

	private static final long serialVersionUID = 1L;
	
	public UserInfoPage() {
		init(null);
	}
	
	public UserInfoPage(IModel<UserInfo> model) {
		init(model);
	}
	
	private void init(IModel<UserInfo> model) {
		WebMarkupContainer showContainer = new WebMarkupContainer("showInfo");
		add(showContainer);
		WebMarkupContainer formContainer = new WebMarkupContainer("form");
		add(formContainer);
		if (model == null) {
			initForm(formContainer);
			showContainer.setVisible(false);
		} else {
			initShow(showContainer, model.getObject());
			formContainer.setVisible(false);
		}
	}
	
	private void initShow(WebMarkupContainer container, UserInfo user) {
		container.add(new Label("username", Model.of(user.getUsername())));
		container.add(new Label("realname", Model.of(user.getRealname())));
		container.add(new Label("email", Model.of(user.getMail())));
		container.add(new Link<Void>("backLink") {
			private static final long serialVersionUID = 1L;
			@Override
			public void onClick() {
				setResponsePage(UserInfoPage.class);
			}
			
		});
	}
	
	private void initForm(WebMarkupContainer container) {
		container.add(new FeedbackPanel("formFeedback"));
		
		CompoundPropertyModel<UserInfo> model = new CompoundPropertyModel<UserInfo>(new UserInfo());
		Form<UserInfo> userInfoForm = new Form<UserInfo>("userInfoForm", model) {
			private static final long serialVersionUID = 1L;
			@Override
			protected void onSubmit() {
				setResponsePage(new UserInfoPage(getModel()));
			}	
		};
		userInfoForm.add(new TextField<String>("username", model.<String>bind("username")));
		userInfoForm.add(new TextField<String>("realname", model.<String>bind("realname")));
		TextField<String> emailTextField = new TextField<String>("email", model.<String>bind("mail"));
		emailTextField.add(EmailAddressValidator.getInstance());
		userInfoForm.add(emailTextField);
		container.add(userInfoForm);
	}

}
