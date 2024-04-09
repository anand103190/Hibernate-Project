package com.app.modal;



	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Version;

	@Entity
	@Table(name = "user")
	public class UserDetails {

	    @Id
	    private int id;
	    private String user_Name;
	    @Version
	    private int version;

	    public int getVersion() {
	        return version;
	    }

	    public void setVersion(int version) {
	        this.version = version;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getUser_Name() {
	        return user_Name;
	    }

	    public void setUser_Name(String user_Name) {
	        this.user_Name = user_Name;
	    }

	}

