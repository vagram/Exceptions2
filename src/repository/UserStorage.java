package repository;

import java.awt.print.PrinterException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserStorage implements Storage {
    private static String[] components;
    private static String temp;
    boolean p;
    private HashMap<String, UserStorage> storage;

    public UserStorage(){
        storage = new HashMap<>();

    }

    public UserStorage(String name, String component, String component1) {
    }

    @Override
    public void addUser(String data){
            try {
                try {
                    components = data.split("\\s+");

                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    String name = components[1] + " " + components[2];
                    storage.put(name, new UserStorage(name, components[3], components[4]));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String PHONENUMBER_REGEX = "\\d{11}";
                if (components[3].matches(PHONENUMBER_REGEX)) {

                } else {
                    throw new Exception();
                }

                if(components[1].matches("Иван") && components[2].matches("Петров")){

                } else {
                    throw new Exception();
                }

                if (components[4].toLowerCase().matches("testmail@mail.ru")){

                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

    }

    @Override
    public void printUser() {

    }

    @Override
    public void printUsers(){
        storage.values().forEach(System.out::println);


    }
    @Override
    public void removeUser(String name){
        storage.remove(name);
    }

    @Override
    public int count() {
        return storage.size();
    }
}
