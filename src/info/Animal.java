package info;

public class Animal {
    protected int age;
    protected  double weight;

    public void running(){
        System.out.println("Animal is running.");
    }

    public void eating(){
        System.out.println("Animal is eating.");
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}