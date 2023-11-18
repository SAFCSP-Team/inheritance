# Inheritance


**Objectives**

In this project learn to understanding of inheritance in Java and how it can be applied to create a hierarchy of related classes with shared properties and behaviors.

**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|Inheritance|  [Concept of Inheritance](https://github.com/nourabyte/oop-learn/tree/main/02-inheritance) |
|Tutorial about Package      |    [What is a package](https://www.youtube.com/watch?v=Bua6LQO2vQ8)  |


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
        lion.eat();  // Output: Simba is eating like a mammal.
        lion.sleep();  // Output: Simba is sleeping.
        lion.giveBirth();  // Output: Simba is giving birth to live young.
        System.out.println("Lion's fur color: " + lion.furColor);  // Output: Lion's fur color: golden

        Bird eagle = new Bird("Sky", 3, 180);
        eagle.eat();  // Output: Sky is pecking its food.
        eagle.sleep();  // Output: Sky is sleeping.
        eagle.fly();  // Output: Sky is flying with a wingspan of 180.
        System.out.println("Eagle's age: " + eagle.age);  // Output: Eagle's age: 3
    }
}

```

