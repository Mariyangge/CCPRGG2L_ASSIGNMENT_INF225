public class App {
    public static void main(String[] args) throws Exception {
        
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Hecarim";
        knight.sayMyName();
        knight.Attack();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Lux";
        mage.sayMyName();
        mage.Attack();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Akali";
        thief.sayMyName();
        thief.Attack();

        Character healer = new Character();

        healer.strength = 0;
        healer.agility = 5;
        healer.intelligence = 20;
        healer.name = "Sona";
        healer.sayMyName();
        healer.Attack();



        Weapon Sword = new Weapon();

        Sword.name = "Long Sword";
        Sword.damage = 15;
        Sword.rarity = "common";
        Sword.Weapons();
        Sword.adddamage();
        System.out.print(Sword.showNameandRarity());
        


    }
}
    
