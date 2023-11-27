# Inheritance


**Objectives**

In this project learn to understanding of inheritance in Java and how it can be applied to create a hierarchy of related classes with shared properties and behaviors.

**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|What is an inheritance|[Inheritance Concept](https://github.com/nourabyte/oop-learn/tree/main/02-inheritance) |
|more info about Inheritance |    [What is an Inheritance](https://dev.java/learn/inheritance/what-is-inheritance/)  |
||[Super keyword (Tutorial)](https://www.youtube.com/watch?v=Qb_NUn0TSAU)|


**Problem**

Create a hierarchy of animals using inheritance to represent different species and their characteristics.

**Implementation**
* Create the Animal base class with the common properties and methods.
* Implement derived classes for specific animal species, such as Mammal and Bird with unique properties and behaviors.
* Override the eat() and sleep() methods in each derived class to provide specialized implementations.
  
```Java
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

```

