package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {
    List<Car> cars;

    {
        cars=new ArrayList<>();
        cars.add(new Car(1, "Mers", "China"));
        cars.add( new Car(2,"Audi","Kyrgyzstan"));
        cars.add(new Car(3,"Jip","Kazakhstan"));
        cars.add(new Car(4,"BMW","German"));
        cars.add(new Car(5,"Nissan","Uzbekistan"));




    }

    @Override
    public List<Car> getCar(int id) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < id; i++) {
            if (id >= 5) {
                return cars;
            } else {
                carList.add(cars.get(i));

            }
        }

        return carList;
    }

    @Override
    public List<Car> getAllCar() {
        return cars;
    }
}
