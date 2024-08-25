final class Cat {

    private int weight;
    public Cat(){
        
    }
    public Cat(int weight){
        this.weight = weight;
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
        System.out.println("Weight of the cat : " + cat1.getWeight());
        cat1.setWeight(1);
        System.out.println("Weight of the cat : " + cat1.getWeight());
    }
}