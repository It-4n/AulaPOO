public class Cat extends Animal implements Pet{

    String catName;

    public Cat(int numberOfLegs){

        super(numberOfLegs = 4);

    }

    @Override
    public String getPetName() {

        return null;

    }

    @Override
    public void setPetName(String name) {

        this.catName = name;

    }

    @Override
    public void play(){

        System.out.println("The cat is playing.");

    }

    @Override
    public void eat(){

        System.out.println("The cat is eating.");

    }

}