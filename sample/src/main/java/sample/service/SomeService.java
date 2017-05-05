package sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import sample.repo.SomeRepository;

//@Service
public abstract class SomeService {

	private SomeRepository repository;
	
	//@Autowired
	//private ApplicationContext applicationContext;

	public SomeService() {
		System.out.println("New Service instance...");
	}

	// public void setRepository(SomeRepository repository) {
	// System.out.println("someRepo injected...");
	// this.repository = repository;
	// }

	public void doService() {
		//SomeRepository repository=applicationContext.getBean("repo1",SomeRepository.class);
		SomeRepository repository=getRepo();
		System.out.println("service..........");
	}
	
	
	public abstract SomeRepository getRepo();
	

}
