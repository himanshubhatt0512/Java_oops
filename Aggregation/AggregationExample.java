class Address{
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Person {
    String personName;
    Address address;

    public Person(String personName, Address address) {
        this.personName = personName;
        this.address = address;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}


public class AggregationExample {
    public static void main(String[] args) {
        Address a1 = new Address("Queens", "New york City", "USA");
        Address a2 = new Address("Malibu", "California", "USA");
        Person p1 = new Person("Peter", a1);
        Person p2 = new Person("Tony", a2);

        System.out.println(p2.getPersonName() + " lives in "+ a2.city + ", " + a2.state);
        System.out.println(p1.getPersonName() + " lives in "+ a1.city + ", " + a1.state);
    }
}   
