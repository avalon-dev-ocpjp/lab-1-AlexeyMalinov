package ru.avalon.java.ocpjp.labs.tasks.objects;

public class CitizenImpl implements Citizen {

    private Country country;
    private String name;
    private String lastName;

    public CitizenImpl(Country country, String name, String lastName) {
        this.country = country;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Lastname: " + lastName + ", Country: " + country.toString();
    }

}
