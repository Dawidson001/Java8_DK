package com.sda.git;

public class Address
{
   private String country;
   private String city;
   private String street;
   private int numberStreet;

    public Address(String country, String city, String street, int numberStreet) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.numberStreet = numberStreet;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberStreet() {
        return numberStreet;
    }


}
