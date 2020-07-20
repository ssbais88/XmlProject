package com.app.externalizasion;

public class DbConfig {
	
	private String driver;
	private String url;
	private String user;

	public DbConfig() {
		super();
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "DbConfig [driver=" + driver + ", url=" + url + ", user=" + user + "]";
	}
	
	
	
	
}
