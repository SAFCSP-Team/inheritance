public class AnimalHierarchy {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Simba", 5);
        lion.eat();  
        lion.sound(); 
        System.out.println("Lion's sound is: " + lion.getsound);  

        Bird eagle = new Bird("Sky", 3);
        eagle.eat();  
        eagle.sound()
        System.out.println("Eagle's age: " + eagle.getage);  
    }
}
