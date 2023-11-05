package com.open.model;

public class Activation {
	  private String __typename;
	  Line LineObject;

	  public Activation() {
		  
	  }
	  

	  public Activation(String __typename, Line lineObject) {
		super();
		this.__typename = __typename;
		LineObject = lineObject;
	}
	  
	// Getter Methods

	public String get__typename() {
	    return __typename;
	  }

	  public Line getLine() {
	    return LineObject;
	  }

	 // Setter Methods 

	  public void set__typename( String __typename ) {
	    this.__typename = __typename;
	  }

	  public void setLine( Line lineObject ) {
	    this.LineObject = lineObject;
	  }
	}