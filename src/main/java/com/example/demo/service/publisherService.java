package com.example.demo.service;

import org.hibernate.annotations.DialectOverride.OverridesAnnotation;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.IPublisherRepository;
import com.example.demo.Repository.publisherRepository;
import com.example.demo.model.Publisher;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class publisherService implements IPlublisherService{

    private final Repository.IPublisherRepository IPublisherRepository;
	
	//@Autowired //crear una solo peticion
	private IPublisherRepository repo;


	
	@Override
	public Publisher save(Publisher pusblisher) throws Exception{
		return repo.save(pusblisher);
	}
	
	
	
	
	/*public publisherService(publisherRepository repo) {
		
		this.repo = repo;
	}
*/
/*
    @Override
	public Publisher saveAndValid(Publisher publisher) {
		//repo = new publisherRepository();
		if(publisher.getIdPublisher() > 0) {
			return repo.save(publisher);
		}else {
			return new Publisher();
		}
		
	}
	*/
}
