package com.solvd;

import com.solvd.body.Minivan;
import com.solvd.body.Sedan;
import java.util.HashMap;

public class Info {


    public Info() {

    }

    public void showInfo() {
        Sedan sedan = new Sedan("Mazda", "John", 15);
        Sedan sedan1 = new Sedan("Renault", "Jack", 30);
        Sedan sedan2 = new Sedan("Opel", "Alex", 4);

        HashMap<Sedan, String> map = new HashMap<>();
        map.put(sedan, "John");
        map.put(sedan2, "Alex");
        map.remove("sedan1");

        for (String CarBody : map.values()) {
            System.out.println(CarBody);
        }

        Minivan minivan = new Minivan("Volkswagen", "Adam", 19);
        Minivan minivan1 = new Minivan("Fiat", "Alisa", 10);

        HashMap<Minivan, Integer> map1 = new HashMap<>();
        map1.put(minivan, 19);
        map1.put(minivan1, 10);

        for (Integer CarBody : map1.values()){
            System.out.println(CarBody);
        }

    }
}
