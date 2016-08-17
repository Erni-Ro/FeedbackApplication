package ro.erni.java.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import ro.erni.java.training.app.MainApp;
import ro.erni.java.training.dao.EmployeeDao;

public class WriteFeedbackController {
	@FXML
	private TextArea a1;
	@FXML
	private TextArea a2;
	@FXML
	private TextArea a3;
	@FXML
	private CheckBox anonymous;
	@FXML
	private Button sendButton;
	@FXML
	private Button backButton;
	


	private ApplicationContext ctx;
	private EmployeeDao dao;

	@FXML
	private void initialize() {
		this.ctx=  new ClassPathXmlApplicationContext("applicationContext.xml");
		this.dao = (EmployeeDao) ctx.getBean("edao");
	}
	
	@FXML
	private void goToSearchEmployee(ActionEvent event){
		MainApp.showSearchEmployee();
	}
	
	@FXML
	private void sendFeedback(ActionEvent event){
		System.out.println("send");
	}

}
