package common;

import java.util.Optional;

/**
 * Optional class (introduced in Java 8) is a container object which may or may not contain a non-null value.
 * The main purpose of Optional is to help avoid NullPointerException by providing a way to express the possible absence of a value without using null.
 */

class Address{
    private String city;
    public Address(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }

    @Override
    public String toString() {
        return "Address{" + "city='" + city + '\'' + '}';
    }
}

class Persons{
    private Optional<Address> address;

    public Persons(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}

public class OptionalClassExample {
    public static void main(String[] args) {
        Persons personWithAddress = new Persons(Optional.of(new Address("New York")));
        Persons personWithoutAddress = new Persons(Optional.empty());

        // Retrieve the city name if the address is present, or return "Unknown"
        System.out.println("City: " + getCityName(personWithAddress));
        System.out.println("City: " + getCityName(personWithoutAddress));
//        City: New York
//        City: Unknown

        System.out.println(personWithAddress.getAddress());
        System.out.println(personWithoutAddress.getAddress());
//        Optional[Address{city='New York'}]
//        Optional.empty
    }

    public static String getCityName(Persons person) {
        return person.getAddress()
                .map(Address::getCity) // Get city if address is present
                .orElse("Unknown");    // Default to "Unknown" if address is absent
    }
}
