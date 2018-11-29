package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class Company
{

    private String CompanyName;
    private User Ownername;
    private List<Address> Departments = new ArrayList<>();




    public Company(String companyName, User ownername) {
        this.CompanyName = companyName;
        this.Ownername = ownername;
    }




    public void pokazListe ()
    {
        for (Address address : Departments)
        {
            System.out.println(address.getCountry() + "  " + address.getCity() + "  " +  address.getStreet()+ " " +  address.getNumberStreet() );
        }
        System.out.printf("\n");
    }




    public void address(Address a)
    {

        Departments.add(a);

    }

    public String getCompanyName() {
        return CompanyName;
    }

    public User getOwnername() {
        return Ownername;
    }


    public List<Address> getDepartments()
    {


        return Departments;
    }
}
