package com.ty.car.car_boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.car.car_boot.carrepositery.Carrepo;
import com.ty.car.car_boot.dto.Car;

@Repository
public class Cardao {
	@Autowired
	Carrepo carrepo;
	
	public Car saveCar(Car car) {
		return carrepo.save(car);
	}
	
	public Car getbyid(int id)
	{
		return carrepo.findById(id).get();
	}
	
	public String deletebyid(int id)
	{
		carrepo.deleteById(id);
		return "deleted";
	}
	
}
