package Principle.LSP;

public class TakeCare {
    Animal animal;

    public TakeCare(Animal animal) {
        this.animal = animal;
    }

    public void care(){
        animal.run();
    }
}
