public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sound() {
        System.out.println(name + " is making a sound");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

   
    public void eat() {
        System.out.println(name + " the mammal is eating");
    }


    public void sound() {
        System.out.println(name + " the mammal is making a sound");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

   
    public void eat() {
        System.out.println(name + " the bird is eating");
    }

    public void sound() {
        System.out.println(name + " the bird is making a sound");
    }
}


class AnimalHierarchy {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Simba", 5);
        lion.eat();  
        lion.sound(); 

        Bird eagle = new Bird("Sky", 3);  
        eagle.eat();  
        eagle.sound();
        System.out.println("Eagle's age: " + eagle.getAge()); 
    }
}

