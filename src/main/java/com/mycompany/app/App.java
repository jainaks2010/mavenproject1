package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.demo.Demo;
import com.mycompany.demo.DemoFactoryBean;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String[] paths = { 
    	"applicationContext.xml"				
    	};
    	
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(paths);
        final DemoFactoryBean demoFactoryBean = applicationContext.getBean(DemoFactoryBean.class);
        Demo demo = demoFactoryBean.getDemoOf(Demo.of.READ_COMMITED);
        demo.demonstrate();
    }
}
