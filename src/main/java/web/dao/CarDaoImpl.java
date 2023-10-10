package web.dao;

import org.springframework.stereotype.Repository;
import web.Model.Car;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars = new ArrayList<>();

    {cars.add(new Car("Lada 2101", "white", 1979));
     cars.add(new Car("IJ-Oda 2126", "blue", 2004));
     cars.add(new Car("Lada Largus ", "beige", 2014));
     cars.add(new Car("UAZ", "white", 2018));
     cars.add(new Car("KIA Sorento","red",2021));
    }
    @Override
    public List<Car> getAllCars(int count) {
        return cars.subList(0,count);
    }
}
