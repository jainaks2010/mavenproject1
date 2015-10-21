package com.mycompany.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//@SuiteClasses({ AppTest.class, SpringAnnotationTest.class, TestMyApp.class })
@SuiteClasses({JunitTest2.class,JunitTest1.class,SpringAnnotationTest.class})
public class AllTests {

}
