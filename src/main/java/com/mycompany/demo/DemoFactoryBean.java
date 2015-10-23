package com.mycompany.demo;

import java.util.Set;



public class DemoFactoryBean {
	
	
	private Set<Demo> demos ;
	
	public DemoFactoryBean() {}
	
	public Demo getDemoOf(Demo.of demoOf){
		Demo demo = null;
		if(demos != null){
			for(Demo demostrate : demos){
				if(demoOf.name().equals(Demo.of.MULTIPLE_THREAD_INSERT.name()) && demostrate instanceof MultipleThreadInsertDemo ){
					demo = demostrate;
					break;
				}else if(demoOf.name().equals(Demo.of.READ_UNCOMITTED.name()) && demostrate instanceof ReadUncommitedDemo ){
					demo = demostrate;
					break;
				}else if(demoOf.name().equals(Demo.of.READ_COMMITED.name()) && demostrate instanceof ReadCommitedDemo ){
					demo = demostrate;
					break;
				}else if(demoOf.name().equals(Demo.of.REPEATABLE_READ.name()) && demostrate instanceof ReadRepeatable ){
					demo = demostrate;
					break;
				}
			}
		}
		return demo;
	}
	
	public Set<Demo> getDemos() {
		return demos;
	}

	public void setDemos(Set<Demo> demos) {
		this.demos = demos;
	}
}


