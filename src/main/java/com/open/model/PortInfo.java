package com.open.model;

public class PortInfo {
	  private String __typename;
	  AccountBillingAddress AccountBillingAddressObject;
	  private String accountNumber;
	  private String accountPin;
	  private String carrierName;
	  private String firstName;
	  private String lastName;
	  private String businessName;


	  public PortInfo() {
		  
	  }
	  
	  
	 public PortInfo(String __typename, AccountBillingAddress accountBillingAddressObject, String accountNumber,
			String accountPin, String carrierName, String firstName, String lastName, String businessName) {
		super();
		this.__typename = __typename;
		AccountBillingAddressObject = accountBillingAddressObject;
		this.accountNumber = accountNumber;
		this.accountPin = accountPin;
		this.carrierName = carrierName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.businessName = businessName;
	}

	// Getter Methods 

	  public String get__typename() {
	    return __typename;
	  }

	  public AccountBillingAddress getAccountBillingAddress() {
	    return AccountBillingAddressObject;
	  }

	  public String getAccountNumber() {
	    return accountNumber;
	  }

	  public String getAccountPin() {
	    return accountPin;
	  }

	  public String getCarrierName() {
	    return carrierName;
	  }

	  public String getFirstName() {
	    return firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public String getBusinessName() {
	    return businessName;
	  }

	 // Setter Methods 

	  public void set__typename( String __typename ) {
	    this.__typename = __typename;
	  }

	  public void setAccountBillingAddress( AccountBillingAddress accountBillingAddressObject ) {
	    this.AccountBillingAddressObject = accountBillingAddressObject;
	  }

	  public void setAccountNumber( String accountNumber ) {
	    this.accountNumber = accountNumber;
	  }

	  public void setAccountPin( String accountPin ) {
	    this.accountPin = accountPin;
	  }

	  public void setCarrierName( String carrierName ) {
	    this.carrierName = carrierName;
	  }

	  public void setFirstName( String firstName ) {
	    this.firstName = firstName;
	  }

	  public void setLastName( String lastName ) {
	    this.lastName = lastName;
	  }

	  public void setBusinessName( String businessName ) {
	    this.businessName = businessName;
	  }
	}