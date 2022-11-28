package com.ty.car.car_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.car.car_boot.dao.Cardao;
import com.ty.car.car_boot.dto.Car;

@RestController
public class Carcontroller {
	
	@Autowired
	Cardao cardao;
	
	@GetMapping("save")
	public Car saveCar(@RequestBody Car car)
	{
		return cardao.saveCar(car);
	}
	
	@PutMapping("get/{id}")
	public Car getCar(@PathVariable int id)
	{
		return cardao.getbyid(id);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestParam int id)
	{
		return cardao.deletebyid(id);
	}
	{
		
	}

}
