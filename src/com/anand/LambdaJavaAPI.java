package com.anand;

import org.json.JSONObject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaJavaAPI implements RequestHandler<MyNumber, Object> {

	@Override
	public String handleRequest(MyNumber o, Context arg1) {
		// TODO Auto-generated method stub
		//JSONObject jp= new JSONObject(arg0.toString());
		System.out.println("Hi ............." + o.getValue1());
		return "Square is  "+2*o.getValue1();
	}

public static void main(String[] args) {
	String str="{\n" + 
			"  \"key1\": \"value1\",\n" + 
			"  \"key2\": \"value2\",\n" + 
			"  \"key3\": \"value3\"\n" + 
			"}";
	System.out.println(new JSONObject(str));
}	
}
