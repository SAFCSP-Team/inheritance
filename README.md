# Inheritance


**Objectives**

In this project, we will learn to understand `inheritance` in Java and how it can be applied to create a hierarchy of related classes with shared properties and behaviors.

**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|What is an inheritance|[Inheritance Concept](https://github.com/nourabyte/oop-learn/tree/main/02-inheritance) |
|more info about Inheritance |    [What is an Inheritance](https://dev.java/learn/inheritance/what-is-inheritance/)  |
|Super Keyword in Java|[Super keyword (Tutorial)](https://www.youtube.com/watch?v=Qb_NUn0TSAU)|
|detailed knowledge about Inheritance|[Java Inheritance Explained (full tutorial)](https://www.youtube.com/watch?v=nixQyPIAnOQ)|


**Problem**

Create a hierarchy of animals using inheritance to represent different species and their characteristics.

**Implementation**
* Create a **base class** named `Animal` that initializes name, age, and eat and sound methods.
* Implement **derived classes** for specific animal species, such as Mammals and Birds with unique properties and behaviors.
* Override the eat() and sound() methods in each derived class to provide specialized implementations.
  
```Java
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

```

