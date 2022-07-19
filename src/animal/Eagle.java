package animal;

public class Eagle extends Animals{

    public void fly(){
        System.out.println(" Eagle: The eagle  flies fast");
    }


    @Override
    public void view() {
        System.out.println("fly");
    }
}
