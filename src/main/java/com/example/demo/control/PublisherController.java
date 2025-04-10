package com.example.demo.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Publisher;
import com.example.demo.service.publisherService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/publishers")
//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor	

public class PublisherController {
	//@Autowired /*peticion de una unica instancia*/
	private final publisherService service;
	
	/*
	public PublisherController(publisherService service) {
		this.service = service;
	}
    */



	@GetMapping
	public Publisher savePublisher() {
		//service = new publisherService();
		return service.saveAndValid(new Publisher());
	}
	/*
	@GetMapping
	public Publisher showPublisher() {
		Publisher publisher = new Publisher();
		publisher.setIdPublisher(1);
		publisher.setName("Upn");
		return publisher;
	}
	*/
}																																																																																														