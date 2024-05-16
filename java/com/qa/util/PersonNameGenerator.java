package com.qa.util;
 
import com.github.javafaker.Faker;
 
public class PersonNameGenerator {
 
    public static String generateRandomPersonName() {
        Faker faker = new Faker();
        return faker.name().fullName();
    }
}