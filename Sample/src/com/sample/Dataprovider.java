package com.sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test (dataProvider="data")
	public void setData(String username, String passwoard){
		System.out.println("pro username"+ username);
		System.out.println("pro passwoard"+ passwoard);
	
	}
	@DataProvider(name="data")
	public Object[][] getData(){
		Object[][] data=new Object[4][2];
		data[0][0]="qaplanet1";
		data[0][1]="qaplanet";
		
		data[1][0]="qaplanet12";
		data[1][1]="qaplanet";
		
		data[2][0]="qaplanet13";
		data[2][1]="qaplanet";
		return data;
		
	}
}
