package com.techrains.test;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.techrains.Distributor.SalesExecutive.Distributor;
import com.techrains.Distributor.SalesExecutive.SalesExecutive;
import com.techrains.Product.Product;
import com.techrains.Region.Region;
import com.techrains.RequestForStock.RequestForStock1;
import com.techrains.RequestForStock.RequestForStock2;
import com.techrains.login.logout.LoginDetails;
import com.techrains.login.logout.Logout;


public class JunitTestSuite {

	public static Test suite() throws IOException {
		@SuppressWarnings("unused")
		LoginDetails d = new LoginDetails();
		TestSuite suite = new TestSuite(JunitTestSuite.class.getName());
		suite.addTestSuite(Region.class);
		suite.addTestSuite(Distributor.class);
		suite.addTestSuite(SalesExecutive.class);
		suite.addTestSuite(Product.class);
		suite.addTestSuite(RequestForStock1.class);
		suite.addTestSuite(RequestForStock2.class);
		suite.addTestSuite(Logout.class);
		return suite;
	}
}
