package com.open.model;

public class Id {
	  private String __typename;
	  private String key;
	  private String value;

	  
	  public Id() {
		  
	  }
	  

	 public Id(String __typename, String key, String value) {
		super();
		this.__typename = __typename;
		this.key = key;
		this.value = value;
	}

	// Getter Methods 

	  public String get__typename() {
	    return __typename;
	  }

	  public String getKey() {
	    return key;
	  }

	  public String getValue() {
	    return value;
	  }

	 // Setter Methods 

	  public void set__typename( String __typename ) {
	    this.__typename = __typename;
	  }

	  public void setKey( String key ) {
	    this.key = key;
	  }

	  public void setValue( String value ) {
	    this.value = value;
	  }
	}