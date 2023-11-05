package com.open.model;

public class AccountBillingAddress {
	  private String __typename;
	  private String address1;
	  private String address2;
	  private String city;
	  private String state;
	  private String zip;
	  
	  public AccountBillingAddress() {
		  
	  }


	 public AccountBillingAddress(String __typename, String address1, String address2, String city, String state,
			String zip) {
		super();
		this.__typename = __typename;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	// Getter Methods 

	  public String get__typename() {
	    return __typename;
	  }

	  public String getAddress1() {
	    return address1;
	  }

	  public String getAddress2() {
	    return address2;
	  }

	  public String getCity() {
	    return city;
	  }

	  public String getState() {
	    return state;
	  }

	  public String getZip() {
	    return zip;
	  }

	 // Setter Methods 

	  public void set__typename( String __typename ) {
	    this.__typename = __typename;
	  }

	  public void setAddress1( String address1 ) {
	    this.address1 = address1;
	  }

	  public void setAddress2( String address2 ) {
	    this.address2 = address2;
	  }

	  public void setCity( String city ) {
	    this.city = city;
	  }

	  public void setState( String state ) {
	    this.state = state;
	  }

	  public void setZip( String zip ) {
	    this.zip = zip;
	  }
	}