package animal;

public class Shark extends Animals{


 public void attack(){
     System.out.println(" Shark : attacks for fisch");
 }

    @Override
    public void view() {
        System.out.println("attack");
    }

}
