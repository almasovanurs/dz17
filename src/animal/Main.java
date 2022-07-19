package animal;

public class Main {
    public static void main(String[] args){

        Animals[] animals = {new Shark(),
                             new Turtle(),
                              new Eagle()};
        for (Animals a : animals) {
            if (a instanceof Shark) {
                a.view();

                for (Animals a2 : animals) {
                    if (a2 instanceof Eagle) {
                        a2.view();

                        for (Animals a3 : animals) {
                            if (a3 instanceof Turtle) {
                                a3.view();

                                System.out.println("----------------");

                                for (Animals a1 : animals) {
                    System.out.println(a1.getClass().getName());
                }

            }
        }}}}}}}