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

        Sword.name = "Excalibur";
        Sword.damage = 9000;
        Sword.rarity = "Legendary";
        Sword.Weaponname();
        Sword.Weapondamage();
        Sword.Weaponrarity();
        Sword.Adddamage(378);
        System.out.println(Sword.shownameRarity());

        Weapon Bow = new Weapon();

        Bow.name = "Arch Angel";
        Bow.damage = 3000;
        Bow.rarity = "Epic";
        Bow.Weaponname();
        Bow.Weapondamage();
        Bow.Weaponrarity();
        Bow.Adddamage(487);
        System.out.print(Bow.shownameRarity());

        Weapon Spear = new Weapon();

        Spear.name = "Amenonuhoko";
        Spear.damage = 7000;
        Spear.rarity = "Epic";
        Spear.Weaponname();
        Spear.Weapondamage();
        Spear.Weaponrarity();
        Spear.Adddamage(735);
        System.out.print(Spear.shownameRarity());
    }
}

