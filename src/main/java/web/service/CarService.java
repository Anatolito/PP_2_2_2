package web.service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars(int count);
}
