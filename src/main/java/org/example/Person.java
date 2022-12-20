package org.example;

        import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private String designation;
    private Double contact;
    private Double salary;
    private String city;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person -> " +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                ", contact='" + contact + '\'' +
                ", salary='" + salary + '\'' +
                ", city='" + city + '\'';
    }

    public Person(String firstName, String lastName, String designation, String contact, String salary, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        contact = contact;
        salary = salary;
        this.city = city;
    }
}
