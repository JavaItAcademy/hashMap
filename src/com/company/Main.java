package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int j = 1;
        ArrayList<Fruit> flawedFruits = new ArrayList<>();
        HashMap<Fruit, Boolean> fruits = new HashMap<>();
        for(int i = 0; i < 3; i++) {
            fruits.put(new Apple(j++), rnd.nextBoolean());
        }
        for(int i = 0; i < 3; i++) {
            fruits.put(new Peach(j++), rnd.nextBoolean());
        }
        for(int i = 0; i < 3; i++) {
            fruits.put(new Pear(j++), rnd.nextBoolean());
        }

        // Вывод всех значений
        for (Map.Entry<Fruit, Boolean> pairs : fruits.entrySet()) {
            System.out.println(pairs.getKey() + " - " + pairs.getValue());
            if (pairs.getKey() instanceof Peach && pairs.getValue()) {
                flawedFruits.add(pairs.getKey());
            }
        }

        System.out.println(flawedFruits);

        //Key Value
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("Astan", "Astan is 16 years old");
//        hashMap.put("Altynbek", "Altynbek is 16 years old");
//        hashMap.put("Shabdan", "Shabdan is 17 years old");
//        hashMap.put("Aselia", "Aselia is 16 years old");
//        hashMap.put("Askhat", "Askhat is 24 years old");
//
//        System.out.println(hashMap.get("Astan"));
//        System.out.println();
//
//        for (String key : hashMap.keySet()) {
//            System.out.println(key + " - " + hashMap.get(key));
//        }
//        System.out.println("***********************");
//        for (Map.Entry<String, String> pairs : hashMap.entrySet()) {
//            System.out.println(pairs.getKey() + " - " + pairs.getValue());
//        }
//        System.out.println("***********************");
//        System.out.println();
//
//        HashMap<String, String> hashMap2 = new HashMap<>();
//        hashMap2.put("Astan", "Astan is 16 years old");
//        hashMap2.put("Altynbek", "Altynbek is 16 years old");
//        hashMap2.put("Shabdan", "Shabdan is 17 years old");
//        hashMap2.put("Aselia", "Aselia is 16 years old");
//        hashMap2.put("Askhat", "Askhat is 24 years old");
//
//        System.out.println(hashMap.equals(hashMap2));
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        int randomNum;
//        for(int i = 0; i < 1000; i++) {
//            randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
//            if (countMap.containsKey(randomNum)){
//                countMap.put(randomNum, countMap.get(randomNum)+ 1);
//            }
//            else {
//                countMap.put(randomNum, 1);
//            }
//        }
//        System.out.println();
//        System.out.println("*******************************");
//        System.out.println();
//        int maxKey = 0;
//        for (Map.Entry<Integer, Integer> pairs : countMap.entrySet()) {
//            System.out.println(pairs.getKey() + " - " + pairs.getValue());
//            if (pairs.getValue() > countMap.get(maxKey)){
//                maxKey = pairs.getKey();
//            }
//        }
//
//        System.out.println("Max : " + maxKey + ", occured: " + countMap.get(maxKey) );

    }
}

abstract class Fruit {
    int id;

    public Fruit(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return id == fruit.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class Apple extends Fruit {
    public Apple(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                '}';
    }
}

class Pear extends Fruit {
    public Pear(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "id=" + id +
                '}';
    }
}

class Peach extends Fruit {
    public Peach(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Peach{" +
                "id=" + id +
                '}';
    }
}

