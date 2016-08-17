package ro.erni.java.training.model;

import java.io.File;

public class Employee {

	private int id;
	private String username;
	private String password; // TODO this must be encoded
	private String email;
	private String firstName;
	private String lastName;
	private String subsidiaryName;
	private String subsidiaryCountry;
	private String subsidiaryCity;
	private String role;
	private String level;
	private File feedback;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSubsidiaryName() {
		return subsidiaryName;
	}

	public void setSubsidiaryName(String subsidiaryName) {
		this.subsidiaryName = subsidiaryName;
	}

	public String getSubsidiaryCountry() {
		return subsidiaryCountry;
	}

	public void setSubsidiaryCountry(String subsidiaryCountry) {
		this.subsidiaryCountry = subsidiaryCountry;
	}

	public String getSubsidiaryCity() {
		return subsidiaryCity;
	}

	public void setSubsidiaryCity(String subsidiaryCity) {
		this.subsidiaryCity = subsidiaryCity;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public File getFeedback() {
		return feedback;
	}

	public void setFeedback(File feedback) {
		this.feedback = feedback;
	}
}
