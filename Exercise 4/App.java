public class App {
    public static void main(String[] args) throws Exception {
    
        Person friend = new Person("Alexander", 20);

        Myself me = new Myself("Maria Bea Nicole", 21);

        me.addFriend(friend);

        Pet dog = new Pet("Sinag", friend);

        dog.showOwnerName();

        Car jeep = new Car("Wrangler", me);

        jeep.showOwner();

    }
}
