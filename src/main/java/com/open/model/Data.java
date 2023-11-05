package com.open.model;

public class Data {
	  Mobile MobileObject;
	  
	  
	  public Data() {
		  
	  }
	  


	 public Data(Mobile mobileObject) {
		super();
		MobileObject = mobileObject;
	}

	// Getter Methods 

	  public Mobile getMobile() {
	    return MobileObject;
	  }

	 // Setter Methods 

	  public void setMobile( Mobile mobileObject ) {
	    this.MobileObject = mobileObject;
	  }
	}
