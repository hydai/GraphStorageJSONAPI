package edu.iseatel.api;

public class Info {
	private String usernameString;
	
	public Info() {
		usernameString = null;
	}
	
	public Info(String usernameString) {
		this.usernameString = usernameString;
	}
	
	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}
	public String getUsernameString() {
		return usernameString;
	}
}
