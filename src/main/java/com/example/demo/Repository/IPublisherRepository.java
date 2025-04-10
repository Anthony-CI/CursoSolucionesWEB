package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Publisher;

public interface IPublisherRepository extends JpaRepository<Publisher,Integer> {
	//public Publisher save(Publisher publisher);
}
