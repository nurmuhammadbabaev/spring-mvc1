package web.dao;


import web.model.Car;

import java.util.List;

public interface Service{
List<Car> getCar(int id);
List<Car> getAllCar();


}