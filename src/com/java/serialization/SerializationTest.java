package com.java.serialization;

import java.io.IOException;

public class SerializationTest {

    public static void main(String[] args) {

        String file = "/root/person.ser";
        Person person = new Person();
        person.setId(1001);
        person.setName("Jane");
        person.setSalary(500000);

        //let serialize this object

        try {
            SerializaionUtil.serialize(person,file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //let deserialize
        Object deserializedObject = null;
        try {
            deserializedObject = SerializaionUtil.deserialize(file);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Before Serialize : "+person);
        System.out.println("After Deserialize : "+deserializedObject != null?(Person)deserializedObject:"Deserialization fail");


    }
}
