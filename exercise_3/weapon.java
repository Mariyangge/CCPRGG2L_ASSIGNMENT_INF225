public class Weapon {
String name;
int damage;
String rarity;

public void Weaponname(){
    System.out.println("Your Weapon is " + name);}

public void Weapondamage(){
    System.out.println("Damage: " + damage);}

public void Weaponrarity(){
    System.out.println("Rarity: " + rarity);}

public void Adddamage(int plusdamage){
    int incdamage = damage + plusdamage;
    System.out.println("Damage +" + incdamage);

    this.damage = incdamage;}

    public String shownameRarity(){
        return this.name + " " + this.rarity;}


}
    
