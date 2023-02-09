public class Animal {
    private  String name;

    public Animal(String name) {
        this.name = name;
    }

    public void animalSpecies(){
        System.out.println("""
         1.Cat
         2.Tiger
         3.Elephant
         4.Bear
         5.Ant
                """);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
