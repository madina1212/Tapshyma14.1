public class Dog extends Animal{
    private  int age;
    private int salmagy;

    public Dog(String name, int age, int salmagy) {
        super(name);
        this.age = age;
        this.salmagy = salmagy;
    }

    public  void dogsOrgans(){
        System.out.println("""
                        1.Opco
                        2.belly
                        3.internaiIntestine
                        4.mouth
                           """);
    }
    public void  foodEaten(){
        System.out.println("""
        ит эң көп, этти жутуу үчүн түзүлөт; 
        Башкача айтканда, табигый чөйрөдө ит арпа же
        буудайды жегенге ыктабайт,
        бирок ал диетага алманы же помидорду,
        ал тургай, кээ бир тамырларды да кошо алат.                
                        """);

    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", salmagy=" + salmagy +
                '}';
    }
}
