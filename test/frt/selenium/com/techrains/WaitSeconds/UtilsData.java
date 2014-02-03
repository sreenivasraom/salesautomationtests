package com.techrains.WaitSeconds;


public class UtilsData {
	public static void waitSeconds(long secs) {
		long end = System.currentTimeMillis() + secs * 1000;
		while (System.currentTimeMillis() < end) {
		}
	}
}