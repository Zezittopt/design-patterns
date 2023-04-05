package com.kreitek.pets.infraestructure.bd;

import com.kreitek.pets.domain.Cat;
import com.kreitek.pets.domain.Dog;

import java.util.ArrayList;
import java.util.List;

public class DbService {
    private static volatile DbService instance = null;

    // TODO Logger declaration
    private ConsoleLogger logger = new ConsoleLogger();
    private List<Cat> cats = new ArrayList<>();
    private List<Dog> dogs = new ArrayList<>();

    private DbService() {
        if (instance != null) {
            throw new RuntimeException("Usage getInstance() method to create");
        }
    }

    public static DbService getInstance() {
        if (instance == null) {
            synchronized(DbService.class) {
                if (instance == null) {
                    instance = new DbService();
                }
            }
        }
        return instance;
    }

    public void addNewDog(Dog dog) {
        try {
            dogs.add(dog);
            logger.debug("DbService. Dog added");
        } catch (Exception e) {
            logger.debug("DbService. Error adding dog: " + e.getMessage());
        }
    }
    public void addNewCat(Cat cat) {
        
        try {
            cats.add(cat);
            logger.debug("DbService. Cat added");
        } catch (Exception e) {
            logger.debug("DbService. Error adding cat: " + e.getMessage());
        }
    }

    public List<Cat> getCats() {
        // TODO logger.debug("BdService.Get " + cats.size() + " cats);
        
        try {
            return new ArrayList<>(cats);
            logger.debug("BdService.Get " + cats.size() + " cats");
        } catch (Exception e) {
            logger.debug("DbService. Error: " + e.getMessage());
        }
    }

    public List<Dog> getDogs() {
        // TODO logger.debug("BdService.Get " + cats.size() + " dogs);
        
        try {
            return new ArrayList<>(dogs);
            logger.debug("BdService.Get " + dogs.size() + " dogs");
        } catch (Exception e) {
            logger.debug("DbService. Error: " + e.getMessage());
        }
    }
}
