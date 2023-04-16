package ua.edu.cbs.lms.hometask_adv_1.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Car> carsCatalog = new LinkedList<>();

        carsCatalog.add(new Car(200, 12000, "Toyota", "Silver"));
        carsCatalog.add(new Car(250, 20000, "Mercedes-Benz", "Black"));
        carsCatalog.add(new Car(180, 8000, "Honda", "Blue"));
        carsCatalog.add(new Car(190, 10000, "Ford", "White"));
        carsCatalog.add(new Car(170, 5000, "Volkswagen", "Red"));
        carsCatalog.add(new Car(210, 15000, "Audi", "Gray"));
        carsCatalog.add(new Car(200, 18000, "BMW", "Green"));
        carsCatalog.add(new Car(185, 9000, "Hyundai", "Yellow"));
        carsCatalog.add(new Car(200, 18000, "Nissan", "Orange"));
        carsCatalog.add(new Car(190, 10000, "Ford", "Purple"));

        System.out.println("After sorting:");
        ListIterator<Car> iterCars = carsCatalog.listIterator();
        while (iterCars.hasNext()){
            System.out.println(iterCars.next());
        }

        Collections.sort(carsCatalog);

        System.out.println("\n\nBefore sorting:");
        iterCars = carsCatalog.listIterator();
        while (iterCars.hasNext()){
            System.out.println(iterCars.next());
        }

        System.out.println("\n\nBefore sorting, in the opposite direction:");
        //iterCars = carsCatalog.listIterator();
        while (iterCars.hasPrevious()){
            System.out.println(iterCars.previous());
        }


    }
}
