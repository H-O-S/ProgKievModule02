/**
 * Java OOP. Home Work 01.
 *
 * @author Oleg Khrulov
 * @version dated 09.04.2019
 */

/*
        Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
        Наделить его свойствами и методами. Создать несколько экземпляров объектов
        этого класса. Использовать эти объекты.
*/

package HW01.Task01;

public class Cat {
    private String name;
    private String coatColor;
    private String eyeColor;
    private String catBreed;
    private Gender gender;
    private int yearOfBirth;
    private double weight;
    private boolean catHungry;
    private boolean catSleeps;
    private boolean catPlayed;

    public Cat() {
        this.catHungry = true;
        this.catSleeps = false;
        this.catPlayed = false;
    }

    public Cat(String name,
               Gender gender,
               double weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.catHungry = true;
        this.catSleeps = false;
        this.catPlayed = false;
    }

    public Cat(String name,
               String coatColor,
               String eyeColor,
               String catBreed,
               Gender gender,
               int yearOfBirth,
               double weight) {
        this.name = name;
        this.coatColor = coatColor;
        this.eyeColor = eyeColor;
        this.catBreed = catBreed;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.catHungry = true;
        this.catSleeps = false;
        this.catPlayed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void meow(){
        System.out.println("Meow-meow-meow!!");
    }

    public void murMeow(){
        System.out.println("Murrr-Meow!!");
    }

    public void mur(){
        System.out.println("Mur-r-r-r-r!!");
    }

    public boolean catPlaying(){
        murMeow();
        for (int i = 0; i < 6; i++){
            if (i%2 == 0){
                murMeow();
            }else {
                mur();
            }
            if (i == 5){
                meow();
            }
        }

        if (Math.random() > 0.5){
            catPlayed = true;
            catHungry = true;
            catSleeps = false;
        }

        return catPlayed;
    }

    public boolean eat(){
        meow();
        for (int i = 0; i < 4; i++){
            mur();
        }
        if (Math.random() > 0.5){
            catHungry = false;
            catSleeps = false;
            catPlayed = false;
            murMeow();
        }else {
            meow();
        }

        return catHungry;
    }

    public void sleep(){
        for (int i = 0; i < 8; i++){
            mur();
        }
        catHungry = true;
        catPlayed =false;
        catSleeps = true;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", coatColor='" + coatColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", catBreed='" + catBreed + '\'' +
                ", gender=" + gender +
                ", yearOfBirth=" + yearOfBirth +
                ", weight=" + weight +
                ", catHungry=" + catHungry +
                ", catSleeps=" + catSleeps +
                ", catPlayed=" + catPlayed +
                '}';
    }
}
