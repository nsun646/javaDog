public class Main {
    enum BreedType {
        BEAGLE, WOLFDOG, DALMATIAN
    }
    public static void main(String[] args) {
        Dog myDog = new Dog("Wolf", "Green", "Black", 130);
        Dog myDog1 = new Dog("Snoppy", "Black", "White", 40);
        Dog myDog2 = new Dog("Spot", "Hazel", "Black and White", 90);

        System.out.println("Name: " + myDog.getName());
        System.out.println("Eye Color: " + myDog.getEyeColor());
        System.out.println("Fur Color: " + myDog.getFurColor());
        System.out.println("Weight: " + myDog.getWeight() + "lb");
        System.out.println("Breed: " + BreedType.WOLFDOG);
        myDog.run();


        System.out.println("Name: " + myDog1.getName());
        System.out.println("Eye Color: " + myDog1.getEyeColor());
        System.out.println("Fur Color: " + myDog1.getFurColor());
        System.out.println("Weight: " + myDog1.getWeight() + "lb");
        System.out.println("Breed: " + BreedType.BEAGLE);
        myDog1.jump();


        System.out.println("Name: " + myDog2.getName());
        System.out.println("Eye Color: " + myDog2.getEyeColor());
        System.out.println("Fur Color: " + myDog2.getFurColor());
        System.out.println("Weight: " + myDog2.getWeight() + "lb");
        System.out.println("Breed: " + BreedType.DALMATIAN);
        myDog2.bark();
    }
}