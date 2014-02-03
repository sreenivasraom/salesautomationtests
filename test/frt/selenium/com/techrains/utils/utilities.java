package com.techrains.utils;

import java.util.Set;

import com.techrains.login.logout.LoginDetails;

public class utilities {
	@SuppressWarnings("unchecked")
	public static String popupwindowhandler()
	{
		String firstWinHandle;
		String secondWinHandle= null;
		Set handles = LoginDetails.driver.getWindowHandles();
		firstWinHandle = LoginDetails.driver.getWindowHandle();
		handles.remove(firstWinHandle);
		String winHandle=(String) handles.iterator().next();
		if (winHandle!=firstWinHandle){
		 secondWinHandle = winHandle; //Storing handle of second window handle
		 }		
		return secondWinHandle;
	}
}
