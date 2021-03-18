package ro.ase.cts.after;

import ro.ase.cts.after.contracts.RestApi;

public class RestApiRelease implements RestApi {
    public RestApiRelease() {
	      System.out.println("Api Release");
    }
    
    public void connect() {
    	System.out.println("Connected successfully");
    }
}
