package com.open.model;

public class Application {
	 
	Data DataObject;
	
	
	public Application() {
		
	}

	 

	  public Application(Data dataObject) {
		super();
		DataObject = dataObject;
	}
	// Getter Methods 

	public Data getData() {
	    return DataObject;
	  }

	 // Setter Methods 

	  public void setData( Data dataObject ) {
	    this.DataObject = dataObject;
	  }
	}