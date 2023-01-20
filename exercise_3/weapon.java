class Weapon {

String name;
int damage;
String rarity;

public void Weapons(){
    System.out.println(name);

    public void adddamage (int additionalDamage){
        int newDamage = this.damage + additionalDamage;

        System.out.println("Damage increased from " + damage + " to " + newDamage);

        this.damage = newDamage;
    }
    public String showNameandRarity(){
        return this.name + "" + this.rarity;

    }

}

}
