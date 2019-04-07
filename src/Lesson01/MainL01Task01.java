package Lesson01;

public class MainL01Task01 {
    public static void main(String[] args) {

        Car carOne = new Car();
        carOne.setColor("Green");
        carOne.setWeight(2000);
        carOne.setYear(1980);


        Car carTwo = new Car();
        carTwo.setColor("Red");
        carTwo.setWeight(1500);
        carTwo.setYear(2010);


        System.out.println(carOne);
        System.out.println(carTwo);

    }
}
