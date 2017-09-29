package com.beans.demo;

import java.util.ArrayList;

public class Employee {
	private String firstName;
	private String lastName;
	private String password;
	private String userName;
	private String Gender;
	private String Designation;
	private ArrayList<String> hobbies = new ArrayList<>() ;
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return Designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		Designation = designation;
	}
	/**
	 * @return the hobbies
	 */
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

}
