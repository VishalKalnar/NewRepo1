package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	@Before(order=1)       // in case of @Before madhe  order chi value nusar ascending order ne excute hote
	//@Before("@sanity ")
	public void beforeHooks1() 
	{System.out.println("Before hook1 is executing");}
	
//	@Before(order=2)
//	public void beforeHooks2() 
//	{System.out.println("Before hook2 is executing");}
	
	
	
	
	//@After (order=1)     // in case of @After madhe  order chi value nusar Descending order ne excute hote
	@After("@functional or @sanity")
	public void afterHooks1() 
	{
		System.out.println("After hook1 is executing");
	}
	
//	@After(order=2)
//	public void afterHooks2() 
//	{
//		System.out.println("After hook2 is executing");
//	}
	
	
	
	@BeforeStep               // in case of @BeforeSteps order chi value nusar ascending order ne excute hote
//	@BeforeStep("@regression or @sanity")
	public void beforeStep1() // jar order mention nahi keli tar bidefault order 10000 consider hote
	{System.out.println("Before Step1 is executing");}
	
//	@BeforeStep(order=2)
//	public void beforeStep2() 
//	{System.out.println("Before Step2 is executing");}
	
	
	@AfterStep                 // in case of @AfterStep order chi value nusar Descending order ne excute hote
	public void afterStep1()   // jar order mention nahi keli tar bidefault order 10000 consider hote
	{System.out.println("After Step1 is executing");}
	
//	@AfterStep(order=2)
//	public void afterStep2() 
//	{System.out.println("After Step2 is executing");}
	
	
	
	@BeforeAll(order=1)  // in case of @BeforeAll order chi value nusar Ascending order ne excute hote
	public static void beforeAllHook() {
		System.out.println("Before all1 is executing");
	}
//	@BeforeAll(order=2)
//	public static void beforeAllHooks() {
//		System.out.println("Before all2 is executing");
//	}
	
	
	
	@AfterAll(order=1)  // in case of @AfterAll order chi value nusar Descending order ne excute hote
	public static void afterAllHook1() {
		System.out.println("after all1 is executing");
	}
	
//	@AfterAll(order=2)
//	public static void afterAllHook2() {
//		System.out.println("after all2 is executing");
//	}
	
	
	
	
}
