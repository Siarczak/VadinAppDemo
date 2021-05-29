package com.example.vadinappdemo.gui;

import com.example.vadinappdemo.manager.CarManager;
import com.example.vadinappdemo.model.Car;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("show-car")
public class CarShowGui extends VerticalLayout {

    CarManager carManager;

    CarShowGui(CarManager carManager)
    {
        this.carManager = carManager;
        Grid<Car> grid = new Grid<>(Car.class);
        grid.setItems(carManager.getCarList());
        add(grid);
    }
}
