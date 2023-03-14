public class Car {
    String name;
    Myself me;

    Car(String modelName, Myself ownerName){
        this.name = modelName;
        this.me = ownerName;
    }
    
    void showOwner(){
        System.out.println("The car " + this.name + " is owned by " + this.me);

    }
    
}
