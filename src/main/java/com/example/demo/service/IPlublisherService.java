package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Publisher;

public interface IPlublisherService {
	//public Publisher saveAndValid( Publisher publisher);
	
	Publisher save(Publisher publisher) throws Exception;
	Publisher update(Publisher publisher, Integer id) throws Exception;
	List<Publisher> findAll() throws Exception;
	Publisher findById(Integer id)throws Exception;
	void delate(Integer id)throws Exception;
}
