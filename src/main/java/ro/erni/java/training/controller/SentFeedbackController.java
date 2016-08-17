package ro.erni.java.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import ro.erni.java.training.app.MainApp;
import ro.erni.java.training.dao.EmployeeDao;

public class SentFeedbackController {
	@FXML
	private Label loggedAs;
	@FXML
	private Button searchEmployeeButton;
	@FXML
	private Button inboxButton;
	@FXML
	private Button signOutButton;
	@FXML
	private Button deleteButton;

	private ApplicationContext ctx;
	private EmployeeDao dao;

	@FXML
	private void initialize() {
		this.ctx=  new ClassPathXmlApplicationContext("applicationContext.xml");
		this.dao = (EmployeeDao) ctx.getBean("edao");
		loggedAs.setText(MainApp.loggedUsername);
	}
	
	@FXML
	private void goToInbox(ActionEvent event){
		MainApp.showInbox();
	}
	
	@FXML
	private void goToSearchEmployee(ActionEvent event){
		MainApp.showSearchEmployee();
	}
	
	@FXML
	private void goToLogIn(ActionEvent event){
		MainApp.showLogIn();
	}
}
	


