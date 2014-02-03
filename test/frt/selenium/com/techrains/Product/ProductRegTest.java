package com.techrains.Product;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.techrains.login.logout.LoginDetails;
import com.techrains.login.logout.Logout;
import com.techrains.test.JunitTestSuite;

public class ProductRegTest {
	public static Test suite() throws IOException {
		@SuppressWarnings("unused")
		LoginDetails d = new LoginDetails();
		TestSuite suite = new TestSuite(JunitTestSuite.class.getName());
		suite.addTestSuite(Product.class);
		suite.addTestSuite(Logout.class);
		return suite;
	}
}
