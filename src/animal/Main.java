package animal;

public class Main {
    public static void main(String[] args){


        Animals[] animals = {new Shark(),
                             new Turtle(),
                             new Eagle()};
        for (Animals a : animals){

            if (a instanceof Shark) {
                ((Shark) a).attack();


            }else if (a instanceof Turtle) {
                ((Turtle) a).swim();

            } else if (a instanceof Eagle){
                ((Eagle) a).fly();

                System.out.println("----------------");

                for (Animals a1 : animals) {
                    System.out.println(a1.getClass().getName());
                }


            }
        }
        }
        }










