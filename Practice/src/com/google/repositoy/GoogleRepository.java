package com.google.repositoy;

import org.openqa.selenium.By;

import com.google.testing.Google;
import com.testing.util.Globalutil;

public class GoogleRepository 
{

	public static By searchInput = By.id("lst-ib");
	
	//public Globalutil global = Globalutil.getInstance();
	
	public   void inputSearch(String keys)
	{
		Google.global.input(searchInput, keys);
		
	}
	
}
