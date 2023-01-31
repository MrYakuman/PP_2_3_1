package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Tesla", 385));
        cars.add(new Car(2, "Ford", 101));
        cars.add(new Car(3, "BMW", 22));
        cars.add(new Car(4, "KIA", 31));
        cars.add(new Car(5, "Opel", 505));
    }

    @Override
    public List<Car> showCars() {
        return cars.stream().toList();
    }

    @Override
    public List<Car> showCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
