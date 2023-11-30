public class AnimalHierarchy {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Simba", 5, "golden");
        lion.eat();  
        lion.sleep(); 
        lion.giveBirth();  
        System.out.println("Lion's fur color: " + lion.furColor);  

        Bird eagle = new Bird("Sky", 3, 180);
        eagle.eat();  
        eagle.sleep();
        eagle.fly();  
        System.out.println("Eagle's age: " + eagle.age);  
        }
}
