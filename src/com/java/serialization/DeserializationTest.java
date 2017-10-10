package com.java.serialization;

import java.io.IOException;

public class DeserializationTest {
    public static void main(String[] args) {
        //Add password variable to person before serialize

        String file = "/root/person.ser";

        Person person = null;
        try {
            person = (Person)SerializaionUtil.deserialize(file);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(person);
    }
}
