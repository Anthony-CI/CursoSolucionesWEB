package com.example.demo.Repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Publisher;

@Repository
public class publisherRepository {
	public Publisher save(Publisher publisher) {
		System.out.println("Publisher save to DB");
		return publisher;
	}
}
