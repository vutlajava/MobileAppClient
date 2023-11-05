package com.open.model;

public class Mobile {
	  private String __typename;
	  Activation ActivationObject;


	  public Mobile() {
		  
	  }
	  
	 // Getter Methods 

	  public Mobile(String __typename, Activation activationObject) {
		super();
		this.__typename = __typename;
		ActivationObject = activationObject;
	}

	public String get__typename() {
	    return __typename;
	  }

	  public Activation getActivation() {
	    return ActivationObject;
	  }

	 // Setter Methods 

	  public void set__typename( String __typename ) {
	    this.__typename = __typename;
	  }

	  public void setActivation( Activation activationObject ) {
	    this.ActivationObject = activationObject;
	  }
	}