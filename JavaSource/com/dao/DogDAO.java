package com.dao;

import com.model.Dog;

public class DogDAO extends GenericDAO<Dog> {
	 
	private static final long serialVersionUID = 1L;

	public DogDAO() {
        super(Dog.class);
    }
}