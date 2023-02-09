public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex",3,20);
        System.out.println(dog);
        dog.animalSpecies();
        dog.dogsOrgans();
        dog.foodEaten();
    }
}