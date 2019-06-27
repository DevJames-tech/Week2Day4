package examples.aaronhoskins.com.homeworkexample.model.datasource.local.database;

import java.util.ArrayList;

import examples.aaronhoskins.com.homeworkexample.model.ZooAnimal.ZooAnimal;

public class MockZooDatabaseHelper {

    public ArrayList<ZooAnimal> queryForAllAnimals() {
        ArrayList<ZooAnimal> returnList = new ArrayList<>();
        returnList.add(new ZooAnimal("Wolfe", "Mammal", "13 Years", "Meat", "", "Howls"));
        returnList.add(new ZooAnimal("Macaw", "Bird", "12 Years", "Seed", "", "Howls"));
        returnList.add(new ZooAnimal("Shark", "Fish", "11 Years", "Meat", "", "Howls"));
        returnList.add(new ZooAnimal("Frog", "Amphibian", "10 Years", "Meat", "", "Howls"));
        returnList.add(new ZooAnimal("Snake", "Reptile", "14 Years", "Meat", "", "Howls"));
        returnList.add(new ZooAnimal("Whale", "Mammal", "15 Years", "Meat", "", "Howls"));
        returnList.add(new ZooAnimal("Deer", "Mammal", "16 Years", "Meat", "", "Howls"));
        returnList.add(new ZooAnimal("Turtle", "Reptile", "17 Years", "Meat", "", "Howls"));
        returnList.add(new ZooAnimal("Chicken", "Mammal", "18 Years", "Meat", "", "Howls"));

        return returnList;
    }

    public ArrayList<ZooAnimal> queryForCategoryOfAnimals(String category) {
        ArrayList<ZooAnimal> returnList = queryForAllAnimals();
        ArrayList<ZooAnimal> actualReturnList = new ArrayList<>();

        for(ZooAnimal animal : returnList) {
            if(animal.getmCategory().equals(category)){
                actualReturnList.add(animal);
            }
        }
        return actualReturnList;
    }

    public ArrayList<String> getAllCategories() {
        ArrayList<String> returnList = new ArrayList<>();
        returnList.add("Mammal");
        returnList.add("Bird");
        returnList.add("Fish");
        returnList.add("Reptile");
        returnList.add("Amphibian");

        return returnList;
    }
}
