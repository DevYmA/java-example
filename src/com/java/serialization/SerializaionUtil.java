package com.java.serialization;

import java.io.*;
import java.util.Objects;

public class SerializaionUtil {

    public static void serialize(Person ob, String filePath)throws FileNotFoundException,IOException{
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ob);
        fos.close();
    }

    public  static Object deserialize(String filePath)throws ClassNotFoundException,IOException{
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        return ois.readObject();
    }

}
