package lesson12.homeworkles12;

import java.util.HashSet;
import java.util.Set;

// Множество всех животных

public class AnimalCollections {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        System.out.println("All pets, CATS and DOGS together:");
        printPets(pets);

        removeCats(pets, cats);
        System.out.println("----------------------");
        System.out.println("With CATS removed:");
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catsSet = new HashSet<Cat>();
        for (int i = 0; i < 4; i++)
            catsSet.add(new Cat());
        return catsSet;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogsSet = new HashSet<Dog>();
        for (int i = 0; i < 3; i++)
            dogsSet.add(new Dog());
        return dogsSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> animalsSet = new HashSet<Object>();
        animalsSet.addAll(cats);
        animalsSet.addAll(dogs);
        return animalsSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<?> pets) {
        for (Object pet : pets)
            System.out.println(pet);
    }

    public static class Cat {}

    public static class Dog {}
}
