package animal;

public class Turtle extends Animals{

    public void swim(){
        System.out.println(" Turtle: The turtle swims very slowly");
    }

    @Override
    public void view() {
        System.out.println("swim");
    }
}
