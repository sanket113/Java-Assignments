class Animal {
    public void makeSound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    
    public void makeSound(){
        System.out.println("Dog sound");
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.makeSound();
        
    }
}
