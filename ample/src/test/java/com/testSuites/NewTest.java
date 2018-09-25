package com.testSuites;

import org.testng.annotations.Test;

import com.source.pages.LogInPage;

public class NewTest {
  @Test(groups= {"sanity", "Regression"})
  public void TC_001() {
	  System.out.println(1);
  }
  
  @Test(groups= {"sanity"})
  public void TC_002() {
	  System.out.println(2);
  }
  @Test(groups= {"sanity", "Regression"})
  public void TC_003() {
	  System.out.println(3);
  }
}
