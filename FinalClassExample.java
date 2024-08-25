final class Cat {

    // Private field to store the weight of the cat
    private int weight;

    // Default constructor for the Cat class
    public Cat(){
        
    }

    // Constructor that takes an integer parameter for weight
    public Cat(int weight){
        this.weight = weight;
    }

    // Method to get the weight of the cat
    public int getWeight(){
        return this.weight;
    } 

    // Method to set the weight of the cat
    public void setWeight(int weight){
        this.weight = weight;
    }
}

public class FinalClassExample {
    public static void main (String a[]){
        // Create a new Cat object with an initial weight of 5
        Cat cat1 = new Cat(5);
        // Print the weight of the cat
        System.out.println("Weight of the cat :  " + cat1.getWeight());
        // Set the weight of the cat to 1
        cat1.setWeight(1);
        // Print the updated weight of the cat
        System.out.println("Weight of the cat :  " + cat1.getWeight());
    }
}
