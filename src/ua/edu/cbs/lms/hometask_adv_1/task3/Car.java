package ua.edu.cbs.lms.hometask_adv_1.task3;

public class Car implements Comparable<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Car o) {    // public int compareTo(Car o) {
        int temp = this.speed - o.speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            temp = this.price - o.price;
            if (temp == 0) {
                temp = this.model.compareTo(o.model);
                if (temp == 0) {
                    return this.color.compareTo(o.color);
                }
            }

        }

        return temp;

    }
}
