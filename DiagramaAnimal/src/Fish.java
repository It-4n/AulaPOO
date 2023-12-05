public class Fish extends Animal implements Pet{

    String fishName;

    public Fish(int NumberOfLegs){

        super(NumberOfLegs = 0);

    }

    @Override
    public String getPetName() {

        return null;

    }

    @Override
    public void setPetName(String name) {

        this.fishName = name;

    }

    @Override
    public void play() {

        System.out.println("The fish is playing.");

    }

    @Override
    public void walk(){

        System.out.println("The fish cannot walk.");

    }

    @Override
    public void eat(){

        System.out.println("The fish is eating.");

    }
}