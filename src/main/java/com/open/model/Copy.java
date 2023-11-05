package com.open.model;

public class Copy {
	
	
	public class Application {
		  Data DataObject;


		 // Getter Methods 

		  public Data getData() {
		    return DataObject;
		  }

		 // Setter Methods 

		  public void setData( Data dataObject ) {
		    this.DataObject = dataObject;
		  }
		}
		public class Data {
		  Mobile MobileObject;


		 // Getter Methods 

		  public Mobile getMobile() {
		    return MobileObject;
		  }

		 // Setter Methods 

		  public void setMobile( Mobile mobileObject ) {
		    this.MobileObject = mobileObject;
		  }
		}
		public class Mobile {
		  private String __typename;
		  Activation ActivationObject;


		 // Getter Methods 

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
		public class Activation {
		  private String __typename;
		  Line LineObject;


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
		public class Line {
		  private String __typename;
		  private String activationStatusDesc;
		  private String iccId;
		  Id IdObject;
		  private String imei;
		  private String lineNumber = null;
		  PortInfo PortInfoObject;
		  private String networkStatus;
		  private String status;
		  private String type;
		  private String lineId;
		  private String errorCode = null;


		 // Getter Methods 

		  public String get__typename() {
		    return __typename;
		  }

		  public String getActivationStatusDesc() {
		    return activationStatusDesc;
		  }

		  public String getIccId() {
		    return iccId;
		  }

		  public Id getId() {
		    return IdObject;
		  }

		  public String getImei() {
		    return imei;
		  }

		  public String getLineNumber() {
		    return lineNumber;
		  }

		  public PortInfo getPortInfo() {
		    return PortInfoObject;
		  }

		  public String getNetworkStatus() {
		    return networkStatus;
		  }

		  public String getStatus() {
		    return status;
		  }

		  public String getType() {
		    return type;
		  }

		  public String getLineId() {
		    return lineId;
		  }

		  public String getErrorCode() {
		    return errorCode;
		  }

		 // Setter Methods 

		  public void set__typename( String __typename ) {
		    this.__typename = __typename;
		  }

		  public void setActivationStatusDesc( String activationStatusDesc ) {
		    this.activationStatusDesc = activationStatusDesc;
		  }

		  public void setIccId( String iccId ) {
		    this.iccId = iccId;
		  }

		  public void setId( Id idObject ) {
		    this.IdObject = idObject;
		  }

		  public void setImei( String imei ) {
		    this.imei = imei;
		  }

		  public void setLineNumber( String lineNumber ) {
		    this.lineNumber = lineNumber;
		  }

		  public void setPortInfo( PortInfo portInfoObject ) {
		    this.PortInfoObject = portInfoObject;
		  }

		  public void setNetworkStatus( String networkStatus ) {
		    this.networkStatus = networkStatus;
		  }

		  public void setStatus( String status ) {
		    this.status = status;
		  }

		  public void setType( String type ) {
		    this.type = type;
		  }

		  public void setLineId( String lineId ) {
		    this.lineId = lineId;
		  }

		  public void setErrorCode( String errorCode ) {
		    this.errorCode = errorCode;
		  }
		}
		public class PortInfo {
		  private String __typename;
		  AccountBillingAddress AccountBillingAddressObject;
		  private String accountNumber;
		  private String accountPin;
		  private String carrierName;
		  private String firstName;
		  private String lastName;
		  private String businessName;


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
		public class AccountBillingAddress {
		  private String __typename;
		  private String address1;
		  private String address2;
		  private String city;
		  private String state;
		  private String zip;


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
		public class Id {
		  private String __typename;
		  private String key;
		  private String value;


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

}
