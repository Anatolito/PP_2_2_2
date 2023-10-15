package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Lada 2101", "white", 1979));
        cars.add(new Car("IJ-Oda 2126", "blue", 2004));
        cars.add(new Car("Lada Largus ", "beige", 2014));
        cars.add(new Car("UAZ", "white", 2018));
        cars.add(new Car("KIA Sorento", "red", 2021));
    }

    @Override
    public List<Car> getAllCars(int count) {
        if (count > 5) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}

