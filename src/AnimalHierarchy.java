class Animal{
    protected String name;
    protected int age;
   
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getsound(){
        return "kkkkk";
    }
    public String getEat(){
        return "munch munch";
       
    }
       
       
   
    public void eat(){
        System.out.println("munch munch");
    }

    public void sound(){
        System.out.println( "kkkkk");

       
    }
}





class Bird extends Animal{


public Bird(String name, int age){
    super(name, age);
   }
    public String getsound(){
        return "rrrrr";
    }
    public String getEat(){
        return "yum yum";
       
    }

    public int getage(){
        return this.age;
    }
       
       
    public void eat(){
        System.out.println(this.getEat());

    }

    public void sound(){
     System.out.println(this.getsound());
       
    }
}






class Mamal extends Animal{


public Mamal(String name, int age){
    super(name, age);
   }
    public String getsound(){
        return "rooo";
    }
    public String getEat(){
        return "aaaaaa";
       
    }

    public int getage(){
        return this.age;
    }
       
       
    public void eat(){
        System.out.println(this.getEat());

    }

    public void sound(){
     System.out.println(this.getsound());
       
    }
}



public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal lion = new Animal("Simba", 5);
        lion.eat();  
        lion.sound();
         System.out.println("Lion's sound is: " + lion.getsound()); 
         
         Bird eagle = new Bird("Sky", 3);
         eagle.eat();  
         eagle.sound();
         System.out.println("Eagle's age: " + eagle.getage());  
    }}