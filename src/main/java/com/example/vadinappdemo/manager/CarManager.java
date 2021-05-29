package com.example.vadinappdemo.manager;

import com.example.vadinappdemo.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager {

    private List<Car> carList;

    public CarManager()
    {
        carList = new ArrayList<>();
        carList.add(new Car("Skoda", "Octavia IV"));
        carList.add(new Car("Nissan", "Almera"));

    }

    public void addCar(Car car)
    {
        carList.add(car);

    }


    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
