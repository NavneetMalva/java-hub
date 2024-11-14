package designpattern.creationaldesign.builderdesign;

public class Shop {
    public static void main(String[] args) {
        // without design pattern, we have to provide all the parameter, we can't leave it as blank.
        // also we have to maintain the same order.
        Phone ph = new Phone("Andoid",8,"Snapdragon",6.5,5400);
        System.out.println(ph);

        // Builder Pattern - Creational Design Pattern
        Phone phone = new PhoneBuilder().setOs("Android").setRam(6).setBattery(6500).getPhone();
        System.out.println(phone);

        /**
         * Phone{os='Andoid', ram=8, processor='Snapdragon', screenSize=6.5, battery=5400}
         * Phone{os='Android', ram=6, processor='null', screenSize=0.0, battery=6500}
         */
    }
}
