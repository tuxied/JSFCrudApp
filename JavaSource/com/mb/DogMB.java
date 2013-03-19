package com.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.facade.DogFacade;
import com.model.Dog;

@ViewScoped
@ManagedBean
public class DogMB extends AbstractMB implements Serializable {
	private static final long serialVersionUID = 1L;

	private Dog dog;
	private List<Dog> dogs;
	private DogFacade dogFacade;

	public DogFacade getDogFacade() {
		if (dogFacade == null) {
			dogFacade = new DogFacade();
		}

		return dogFacade;
	}

	public Dog getDog() {
		if (dog == null) {
			dog = new Dog();
		}

		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void createDog() {
		try {
			getDogFacade().createDog(dog);
			closeDialog();
			displayInfoMessageToUser("Created With Sucess");
			loadDogs();
			resetDog();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("Ops, we could not create. Try again later");
			e.printStackTrace();
		}
	}
	
	public void updateDog() {
		try {
			getDogFacade().updateDog(dog);
			closeDialog();
			displayInfoMessageToUser("Updated With Sucess");
			loadDogs();
			resetDog();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("Ops, we could not create. Try again later");
			e.printStackTrace();
		}
	}
	
	public void deleteDog() {
		try {
			getDogFacade().deleteDog(dog);
			closeDialog();
			displayInfoMessageToUser("Deleted With Sucess");
			loadDogs();
			resetDog();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("Ops, we could not create. Try again later");
			e.printStackTrace();
		}
	}

	public List<Dog> getAllDogs() {
		if (dogs == null) {
			loadDogs();
		}

		return dogs;
	}

	private void loadDogs() {
		dogs = getDogFacade().listAll();
	}

	public void resetDog() {
		dog = new Dog();
	}
}