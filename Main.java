package com.sda.git;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Company company = new Company("Palibud", new User("Daniel", "Bialy"));

        company.address(new Address("Poland", "Szczecin", "Szafera1", 128));
        company.address(new Address("Poland", "Szczecin1", "Szafera1", 128));
        company.address(new Address("Poland", "Szczecin2", "Szafera2", 127));
        company.address(new Address("Poland", "Szczecin3", "Szafera3", 126));

        company.address(new Address("Poland", "Szczecin", "Szafera4", 125));
        company.address(new Address("Poland", "Szczecin", "Szafera5", 124));
        company.address(new Address("Poland", "Szczecin", "Szafera6", 123));
        company.address(new Address("Poland", "Szczecin", "Szafera7", 122));
        company.address(new Address("Poland", "Szczecin", "Szafera8", 121));
        company.address(new Address("Poland", "Szczecin", "Szafera9", 120));

        Company company1 = new Company("Lalala", new User("Andrzej", "golota"));
        company1.address(new Address("Poland", "Krakow", "Romera1", 121));
        company1.address(new Address("Poland", "Krakow", "Romera2", 125));
        company1.address(new Address("Poland", "Krakow", "Romera3", 129));
        company1.address(new Address("Poland", "Krakow", "Romera4", 1241));
        company1.address(new Address("Poland", "Krakow", "Romera5", 120));
        company1.address(new Address("Poland", "Krakow", "Romera6", 127));

        Company company2 = new Company("Barak", new User("Anna", "Drzyzga"));
        company2.address(new Address("England", "London", "ColorStreet", 11));
        company2.address(new Address("England", "London", "ColorStreet", 111));
        company2.address(new Address("England", "London", "ColorStreet", 19));
        company2.address(new Address("England", "London", "ColorStreet", 91));
        company2.address(new Address("England", "London", "ColorStreet", 51));
//
//        List<Company> list = Arrays.asList(company, company1, company2);
//        List<String> aList = list.stream()
//                .map(Company::getCompanyName)
//                .collect(Collectors.toList());


        List<Company>lista = Arrays.asList(company, company1, company2);
        lista.stream()
                .forEach(company3 -> System.out.print(company3.getCompanyName() + "  " + company3.getOwnername().getFirstName() + "  " + company3.getOwnername().getLastName() + "\n"));


        List<Company> lista2 = Arrays.asList(company, company1, company2);
        lista2.stream()
                .forEach(company4 -> company4.pokazListe());




//        List<Company>lista3 = Arrays.asList(company, company1, company2);
//
//        lista3.stream()
//                .map(allAdreess -> allAdreess.getDepartments())
//                .flatMap(a -> a.stream())
//                .collect(Collectors.toList())
//                .forEach(System.out::println);









    }



    }

