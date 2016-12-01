public class Main {
    public static void main(String[] args) {
        Kennel kennel = new Kennel();
        kennel.addPet(new Dog("RRRRR"));
        kennel.addPet(new Cat("JJJJJ"));
        kennel.allSpeak();
    }
}
