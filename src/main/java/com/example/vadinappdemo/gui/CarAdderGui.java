package com.example.vadinappdemo.gui;

import com.example.vadinappdemo.manager.CarManager;
import com.example.vadinappdemo.model.Car;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route("add-car")
public class CarAdderGui extends VerticalLayout {


    private CarManager carManager;

    @Autowired
    public CarAdderGui(CarManager carManager) {
        this.carManager = carManager;

        TextField textFieldBrand = new TextField("Brand");
        TextField textFieldModel = new TextField("Model");
        Button buttonAdd = new Button("Add car");
        buttonAdd.addClickListener(buttonClickEvent ->
        {
            Car newCar = new Car(textFieldBrand.getValue(),textFieldModel.getValue());
            carManager.addCar(newCar);
            carManager.getCarList().forEach(System.out::println);



        });

        add(textFieldBrand, textFieldModel,buttonAdd );

    }




}
