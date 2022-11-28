package com.ty.car.car_boot.carrepositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.car.car_boot.dto.Car;

public interface Carrepo extends JpaRepository<Car, Integer> {

}
