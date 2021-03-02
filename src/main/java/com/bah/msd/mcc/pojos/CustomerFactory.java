package com.bah.msd.mcc.pojos;

import org.json.JSONObject;

public class CustomerFactory {
	
	public static Customers getCustomer(String json_string){
		
        // parsing file "JSONExample.json" 
        JSONObject jobj = new org.json.JSONObject(json_string); 
          
        // getting firstName and lastName 
        int id = (int) jobj.get("id");
        String name = (String) jobj.get("name"); 
        String email = (String) jobj.get("email"); 
        String password = (String) jobj.get("password"); 
		
		// create customer object
		Customers cust = new Customers();
		cust.setName(name);
		cust.setId(id);
		cust.setEmail(email);
		cust.setPassword(password);
		return cust;
	}
	
	public static String getCustomerAsJSONString(Customers customer) {
        JSONObject jo = new JSONObject(); 
        
        // putting data to JSONObject 
        jo.put("name", customer.getName()); 
        jo.put("email", customer.getEmail());
        jo.put("password", customer.getPassword());
        jo.put("id", customer.getId());
        
        String out = jo.toString();
        return out;
	}

}