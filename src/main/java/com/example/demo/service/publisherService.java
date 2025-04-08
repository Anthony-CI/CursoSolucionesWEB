package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.publisherRepository;
import com.example.demo.model.Publisher;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class publisherService implements IPlublisherService{
	
	//@Autowired //crear una solo peticion
	private publisherRepository repo;
	
	
	
	/*public publisherService(publisherRepository repo) {
		
		this.repo = repo;
	}
*/

    @Override
	public Publisher saveAndValid(Publisher publisher) {
		//repo = new publisherRepository();
		if(publisher.getIdPublisher() > 0) {
			return repo.save(publisher);
		}else {
			return new Publisher();
		}
		
	}
}
