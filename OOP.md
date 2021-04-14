Object Oriented Programming Concept Questions

As you should know by now, there are 4 principles (pillars) of Object Oriented Programming.

Please write a 1-3 paragraphs explaining these 4 concepts further.  Please provide a sufficient enough explanation about these pillars, as well as some examples to illustrate the practical use cases of these principles.  Please be aware, that any copy / pasting from websites can be easily detected.  Don't do that, but rather, explain the concepts in your own words, while providing code examples of each concept.  

********************
1. Encapsulation.
Encapsulation restricts direct access to components of an object. It means that fields can be hidden from other classes and can be accessed only through the methods of the class that holds those hidden components. It can be achieved by making fields private and then writing getters and setters methods to reach (get or set) those fields. 
In the following example (from my Hangman game) all fields and methods that are private are encapsulated and there's no direct access to them. Other classes can reach them only using methods that are public from the class Player:
   public class Player {
   private int HIGHEST_SCORE = 0;
   private double AVERAGE_SCORE = 0;
   
   private static final Player player = new Player();
   private Player(){};
   public static Player getInstance(){return player;};

    public int getHighestScore(){
        if(scoreHistory.size() == 0){
            return this.HIGHEST_SCORE = 0;
        }else{
            return this.HIGHEST_SCORE = Collections.max(scoreHistory);
        }
    }
    public void setAverageScore(){
        if(scoreHistory.size() == 0){
            this.AVERAGE_SCORE = 0;
        }else{
            this.AVERAGE_SCORE = (double)(scoreHistory.stream().reduce(0,(accum, num) -> accum + num))/scoreHistory.size();
        }
    }

    public double getAverageScore() {
        return AVERAGE_SCORE;
    }
}





********************
2. Inheritance.
Inheritance is the process where children classes can inherit methods and fields from the parent class. Parent class is also called Super class and child class is a subclass. Inheritance goes hand in hand with re-usability or even DRY, because it allows to not repeat fields and methods that already exist in another class, but inherit them. 
In the example below Keyboard inherits from Piano and Piano inherits from Instrument. Keyboard can use methods that it inherits from both Piano and Instrument. Keyboard can playDoReMi (inherited from Instrument), doStaccato (inherited from Piano), produceStringSound.
   
class Instrument{
   void playDoReMi(){System.out.println("playing do ~ re ~ mi");}

}
class Piano extends Instrument{
    void doStaccato(){System.out.println("perfoming with staccato: do! re! mi!")}
}
class Keyboard extends Piano{
    void produceStringsSound(){System.out.println("violin sound ~ ~ ~")}
}
class MusicApp(){
public static void main(String args[]){
    Keyboard keyboard = new Keyboard();
    keyboard.play();
    keyboard.doStaccato();
    keyboard.produceStringSound();
 }
}
OUTPUT:
playing do ~ re ~ mi
perfoming with staccato: do! re! mi!
violin sound ~ ~ ~


********************
3. Abstraction.
Abstraction is hiding implementation and showing only functionality. Abstraction can be achieved by creating Interface or Abstract class. Interface is 100% abstract, where Abstract class can have concrete (non-abstract) fields and methods. Abstract class and Interface cannot be instantiated, they can only be extended (Abstract class) or implemented (Interface). Abstract class has to have a keyword "abstract" in its declaration; and Interface has to have "interface". Classes that implement interface or extend abstract class have to provide implementations to all abstract methods inherited. 
In the example below Instrument is an abstract class. It has couple fields and a constructor. It cannot be instantiated, because it's an abstraction. However, Violin class can be instantiated and because it extends Instrument it has to have all methods from Instrument class: constructor (adding its own field, "size", to it) and overridden play() method. When instantiating Violin it has a brand and price that it inherited from abstract class Instrument.

public abstract class Instrument{
private String brand;
private double cost;

   public Instrument(String brand, double cost){
   this.brand = brand;
   this.cost = cost;
   
abstract void play();

}
public class Violin extends Instrument{
private String size;
    public Violin(String brand, double cost, String size){
        super(brand, cost); //Violin inherited brand and cost and constructor from the Instrument class.
        this.size = size;
    }
    @Override
    void play(){
        System.out.println("Violin playing ~ ~ ~");//Violin inherited play method and changed it.
    }
}
class MusicApp(){
public static void main(String args[]){
Violin violin = new Violin("Stradivarius", 16000000.00, "355");
violin.play();

}
}
OUTPUT:
Violin playing ~ ~ ~

INTERFACE EXAMPLE:
The difference here, that interface is 100 percent abstract and usually has only abstract methods in it. In interface Instrument there is only one method - play(). Violin implements instrument, so it has to implement its method, play(). Violin overrides it. Due to Instrument doesn't have any fields nor constructor, we have to create them inside Violin class.

public interface Instrument{

abstract void play();

}

public class Violin implements Instrument{
private String brand;
private double cost;
private String size;

public Violin(String brand, double cost, String size){
this.brand = brand;
this.cost = cost;
this.size = size;
}
@Override
void play(){
System.out.println("Violin playing ~ ~ ~"); //violin only inherited play() method and override it.
}
}
class MusicApp(){
public static void main(String args[]){
Violin violin = new Violin("Stradivarius", 16000000.00, "355");
violin.play();

}
}
OUTPUT:
Violin playing ~ ~ ~




********************
4. Polymorphism.
Polymorphism is ability to take many forms. If we take the last example where Violin is an Instrument, so it means Violin is polymorphic. Or if we have class Avalon that extends abstract class Toyota and implements interface Car, so it means that Avalon is Toyota and Avalon is a Car. Avalon is polymorphic. Polymorphism is connected to abstraction and inheritance. It occurs with @Override, when the subclass has the same method as parent, but different in some way. Another form of polymorphism is when we use method overloading: same method, but accepts different number of arguments.

Method Override: 
   
public class Mother(){
    void eat(){
        System.out.println("Mother is eating a salad.")
   }
}
public class Daughter extends Mother(){
    @Override
    void eat(){
        System.out.println("Daughter is eating pizza.") //polymorphism - same method but changed in some way
}
}

Method Overloading (overloading constructor):
public class Bird(){
    String name;
    int age;
    boolean canFly;

1. constructor without any arguments.
    class Bird(){}
2. constructor with all arguments.
    class Bird(String name, int age, boolean canFly){
        this.name = name;
        this.age = age;
        this.canFly = canFly;
}
3. constructor with just one argument
    class Bird(int age){
        this.name = penguin;
        this.age = age;
        this.canFly = false;
}
}







