package concept_implementations;

interface Drivable {
    public abstract void startEngine();
    public abstract void stopEngine();

}

class Car implements Drivable{
    public void startEngine(){
        System.out.println("Engine Started");
    }
    public void stopEngine(){
        System.out.println("Engine Stopped");
    }

    public static void main(String[] args) {
        Car d=new Car();
        d.startEngine();
        d.stopEngine();
    }
}
