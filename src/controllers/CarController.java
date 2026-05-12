package controllers;

import models.Car;

public class CarController {

  public void sortByName(Car[] cars) {
    for (int i = 0; i < cars.length - 1 - i; i++) {
      for (int j = 0; j < cars.length - 1; j++)
        if (cars[j].getName().compareTo(cars[j + 1].getName()) > 0) {
          Car aux = cars[j];
          cars[j] = cars[j + 1];
          cars[j + 1] = aux;
        }
    }
  }

}
