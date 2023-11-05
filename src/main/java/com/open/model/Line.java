package com.open.model;

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

	  
	  public Line() {
		  
	  }
	  

	 public Line(String __typename, String activationStatusDesc, String iccId, Id idObject, String imei,
			String lineNumber, PortInfo portInfoObject, String networkStatus, String status, String type, String lineId,
			String errorCode) {
		super();
		this.__typename = __typename;
		this.activationStatusDesc = activationStatusDesc;
		this.iccId = iccId;
		IdObject = idObject;
		this.imei = imei;
		this.lineNumber = lineNumber;
		PortInfoObject = portInfoObject;
		this.networkStatus = networkStatus;
		this.status = status;
		this.type = type;
		this.lineId = lineId;
		this.errorCode = errorCode;
	}

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