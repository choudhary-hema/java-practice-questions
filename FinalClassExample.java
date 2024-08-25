
/** 
 * 
 * If a class is defined as final it cannot be extended
 * If a metyhod is declared as final it cannot be overridden
 * If a variable is defined as final, it cannot be re-assigned
 * 
 **/
final class Cat {

    private int weight;
    private final int eyes = 2;
    public Cat(){
        
    }

    public Cat(int weight){
        this.weight = weight;
        //eyes = 5; // FinalClassExample.java:19: error: cannot assign a value to final variable eyes
    }

    public int getWeight(){
        return this.weight;
    } 

    public void setWeight(int weight){
        this.weight = weight;
    }
    
}

public class FinalClassExample {
    public static void main (String a[]){
        Cat cat1 = new Cat(5);
        System.out.println("Weight of the cat :  " + cat1.getWeight());
        cat1.setWeight(1);
        System.out.println("Weight of the cat :  " + cat1.getWeight());
    }
}

/**
 * 
 * FinalClassExample.java:44: error: cannot inherit from final Cat class BlackCat extends Cat {
 * 
 **/ 
//class BlackCat extends Cat {}
