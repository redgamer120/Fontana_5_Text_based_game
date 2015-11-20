/*
                if (Hp<0){
                    StartGame();
                }
 */
package fontana_5_text_based_game;
import java.util.Scanner;
import java.util.Random;


public class Fontana_5_text_based_game {
    static String type;
    static String username;
    static String weapon;
    static String Choice1;
    static Random Rhp;
    static Random Ragi;
    static Random Rint;
    static Random Ratk;
    static Random Rcha;
    static Random Rluc;
    static Random Rwis;
    static Random Rdef;
    static int Hp;
    static int Agi;
    static int Int;
    static int Atk;
    static int Cha;
    static int Luc;
    static int Wis;
    static int Def;
    static Random Rehp;
    static Random Reagi;
    static Random Reint;
    static Random Reatk;
    static Random Recha;
    static Random Reluc;
    static Random Rewis;
    static Random Redef;
    static int Ehp;
    static int Eagi;
    static int Eint;
    static int Eatk;
    static int Echa;
    static int Eluc;
    static int Ewis;
    static int Edef;
    
    public static void StartGame() {
        Rhp = new Random ();
        Hp = Rhp.nextInt(101)+1;
        Ragi = new Random ();
        Agi = Ragi.nextInt(26)+1;
        Rint = new Random ();
        Int = Rint.nextInt(26)+1;
        Ratk = new Random ();
        Atk = Ratk.nextInt(26)+1;
        Rcha = new Random ();
        Cha = Rcha.nextInt(26)+1;
        Rluc = new Random ();
        Luc = Rluc.nextInt(26)+1;
        Rwis = new Random ();
        Wis = Rwis.nextInt(26)+1;
        Rdef = new Random ();
        Def = Rdef.nextInt(26)+1;
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
            username = name.nextLine();
        System.out.println("Your Hit Points is " + Hp + ".");
        System.out.println("Your agillity is " + Agi + ".");
        System.out.println("Your inteligence is " + Int + ".");
        System.out.println("Your attack is " + Atk + ".");
        System.out.println("Your charisma is " + Cha + ".");
        System.out.println("Your luck is " + Luc + ".");
        System.out.println("Your wisdom is " + Wis + ".");
        System.out.println("Your defense is " + Def + ".");
        Choesclass();
    }
    public static void Choesclass() {
        Scanner Class = new Scanner(System.in);
        System.out.println("What class would you like to be?");
        System.out.println("Warrior");
        System.out.println("Mage");
        System.out.println("Theif");
        type = Class.nextLine();
        if (type.contains("w")) {
            System.out.println("You find yourself in a weird armory.");
            System.out.println("What weapon(s) do you pick up");
            System.out.println("1 Sword and sheild(averge defense, attack, and agillity)");
            System.out.println("2 Lond sword(high attack, minamal defense, and normal agillity)");
            System.out.println("3 Lance and sheild(high attack, high defence, and low agillity)");
            Scanner Weapon = new Scanner(System.in);
            weapon = Weapon.nextLine();
            if  (weapon.contains("1")) {
                System.out.println("You get an small boost in attack, defense, and speed.");
                Atk += 2;
                System.out.println("Your attack is now " + Atk);
                Agi += 2;
                System.out.println("Your agillity is now " + Agi);
                Def += 2;
                System.out.println("Your defense is now " + Def);
            }
            if (weapon.contains("2")){
                System.out.println("You get a attack boost, and lowered defence.");
                Atk += 5;
                System.out.println("Your attack is now " + Atk);
                Def -= 2;
                System.out.println("Your defense is now " + Def);
            }
            if (weapon.contains("3")){
                System.out.println("You get a attack boost, a defence boost, and lowered agillity.");
                Atk += 5;
                System.out.println("Your attack is now " + Atk);
                Def += 5;
                System.out.println("Your defense is now " + Def);
                Agi -= 2;
                System.out.println("Your agillity is now " + Agi);
            }
        }
        if (type.contains("m")){
            System.out.println("You find yourself at and entrace to tall tower and at the top are many magical weapons.");
            System.out.println("What weapon to you pick.");
            System.out.println("#1 Staff(averages attack, wisdom, and intelegence)");
            System.out.println("#2 Magical Book(average attack, intelegence boost, and lower agility)");
            System.out.println("#3 Voodo Doll(attack boost, lower wisdom and intelegence)");
            Scanner Weapon = new Scanner(System.in);
            weapon = Weapon.nextLine();
            if  (weapon.contains("1")) {
                System.out.println("You get an small boost in attack, wisdom, and int.");
                Atk += 2;
                System.out.println("Your attack is now " + Atk);
                Wis += 2;
                System.out.println("Your agillity is now " + Wis);
                Int += 2;
                System.out.println("Your defense is now " + Int);
            }
            if  (weapon.contains("2")) {
                System.out.println("You get an small boost in attack, a boost in intelegence, and lowered agility.");
                Atk += 2;
                System.out.println("Your attack is now " + Atk);
                Int += 5;
                System.out.println("Your agillity is now " + Int);
                Agi -= 2;
                System.out.println("Your defense is now " + Agi);
            }
            if  (weapon.contains("3")) {
                System.out.println("You get a boost in attack, and lowered wisdom, and intelegence.");
                Atk += 2;
                System.out.println("Your attack is now " + Atk);
                Wis += 2;
                System.out.println("Your agillity is now " + Wis);
                Int += 2;
                System.out.println("Your defense is now " + Int);
            }
        }
        if (type.contains("t")){
            System.out.println("You find yourself in a hidden tree house full of stealthly weapons.");
            System.out.println("What weapon to you pick.");
            System.out.println("#1 Staff(averages attack, luck, and charisma)");
            System.out.println("#2 Daggers(average attack, charisma boost, and lower agility)");
            System.out.println("#3 Throwing Knives(attack boost, luck boost and lowered charisma)");
            Scanner Weapon = new Scanner(System.in);
            weapon = Weapon.nextLine();
            if  (weapon.contains("1")) {
                System.out.println("You get an small boost in attack, luck, and charisma.");
                Atk += 2;
                System.out.println("Your attack is now " + Atk);
                Cha += 2;
                System.out.println("Your charisma is now " + Cha);
                Luc += 2;
                System.out.println("Your luck is now " + Luc);
            }
            if  (weapon.contains("2")) {
                System.out.println("You get an small boost in attack, a boost in charisma, and lowered agility.");
                Atk += 2;
                System.out.println("Your attack is now " + Atk);
                Agi -= 3;
                System.out.println("Your agillity is now " + Agi);
                Cha += 4;
                System.out.println("Your charisma is now " + Cha);
            }
            if  (weapon.contains("3")) {
                System.out.println("You get an small boost in attack, a boost in luck, and lowered charisma.");
                Atk += 2;
                System.out.println("Your attack is now " + Atk);
                Luc += 5;
                System.out.println("Your luck is now " + Luc);
                Cha -= 3;
                System.out.println("Your defense is now " + Cha);
            }
        }
        StartBattle();
    }
    public static void StartBattle() {
        System.out.println("You suddenly find yourself on the floor of a great forest that you have never seen before.");
        System.out.println("You don't know a thing about the surronding area so you decide to look around for anything that looks familiar to you.");
        System.out.println(""
                + "");
        System.out.println("You suddenly hear a sharp crack underfoot were you see a human skull that you thought was a rock.");
        System.out.println("You suddenly hear an animal behind you and when you turn you see a bear, and you have no choice but to fight it.");
        Rehp = new Random ();
        Ehp = Rehp.nextInt(16)+5;
        Reagi = new Random ();
        Eagi = Reagi.nextInt(16)+5;
        Reint = new Random ();
        Eint = Reint.nextInt(16)+5;
        Reatk = new Random ();
        Eatk = Reatk.nextInt(16)+5;
        Recha = new Random ();
        Echa = Recha.nextInt(16)+5;
        Reluc = new Random ();
        Eluc = Reluc.nextInt(16)+5;
        Rewis = new Random ();
        Ewis = Rewis.nextInt(16)+5;
        Redef = new Random ();
        Edef = Redef.nextInt(16)+5;
        System.out.println("The bear suddenly stands on it's hind legs giving it stat boosts.");
        System.out.println(" ");
        System.out.println("The bear's Hit Points is " + Ehp + ".");
        System.out.println("The bear's agillity is " + Eagi + ".");
        System.out.println("The bear's inteligence is " + Eint + ".");
        System.out.println("The bear's attack is " + Eatk + ".");
        System.out.println("The bear's charisma is " + Echa + ".");
        System.out.println("The bear's luck is " + Eluc + ".");
        System.out.println("The bear's wisdom is " + Ewis + ".");
        System.out.println("The bear's defense is " + Edef + ".");
        System.out.println("What do you do.");
        System.out.println("1 Dodge and try for a counter.(Agillity dependent)");
        System.out.println("2 Block and counter.(Deffence and agillity dependent)");
        System.out.println("3 Bomb rush the bear until hurt.(Attack and hit point depentent)");
        Scanner choice = new Scanner(System.in);
        Choice1 = choice.nextLine();
        if (Choice1.contains("1")){
            System.out.println("You decide to try to dodge the attack and counter the bear.");
            if (Agi>7){
                System.out.println("You succefully doged the bear's attack and countered the bear with your own attack power.");
                Ehp = Ehp-Atk;
                System.out.println("The enemy's health is now "+ Ehp);
                System.out.println("You continue the process until the bear is dead.");
                Storyline();
            }
            if (Agi<7){
                System.out.println("You failed the doge and took damage.");
                Hp = Hp-Eatk;
                System.out.println("Your health is now "+ Hp);
                if (Hp<0){
                    StartGame();
                }
            }
        }
        if (Choice1.contains("2")){
            System.out.println("You decide to block and try to counter the bear.");
            if (Def>Eatk){
                System.out.println("You succefully block the bear's attack and you try to counter the attack.");
                if (Agi>Eagi){
                    System.out.println("You succefully doged the bear's attack and countered the bear with your own attack power.");
                    System.out.println("You continue this process until the bear is dead.");
                    Storyline();
                }
            }
            if (Def<Eatk){
                System.out.println("You block fails and you take dammage.");
                Hp = Hp-Eatk;
                System.out.println("Your health is now " + Hp);
                                if (Hp<0){
                    StartGame();
                }
                System.out.println("You attack until the bear is defeated.");
                Storyline();
        }
        }
        if (Choice1.contains("3")){
            System.out.println("You decide to not care about your health and attack at full force.");
            if (Atk>Ehp){
                System.out.println("Your attack is much greater than that of the bear's health and it is killed swiftly.");
                Storyline();
            }
            if (Hp>Eatk){
                System.out.println("Your health is much greater than that of the bear's attack and it is killed because your overwhelmed.");
                Storyline();
            }
            if (Hp<Eatk){
                System.out.println("Your attack is much less than that of the bear's health and you are killed swiftly.");
                StartGame();
            }
            
        }
    }
    private static void Storyline(){
        System.out.println("After beating the bear you find an abandon bas camp.");
        System.out.println("What should you do.");
        System.out.println("#1 Check for supplies.");
        System.out.println("#2 Forward to the sounds of fighting.");
        Scanner choice = new Scanner(System.in);
        Choice1 = choice.nextLine();
        if (Choice1.contains("1")){
            System.out.println("While checting your supplies you notice that you can use everting better than you thought befor.");
            Agi = Agi + 1;
            Atk = Atk + 1;
            Hp = Hp + 5;
            Def = Def +1;
            Cha = Cha +1;
            Luc = Luc + 1;
            Int = Int+1;
            Wis =Wis+1;
            System.out.println("Your Hit Points is " + Hp + ".");
            System.out.println("Your agillity is " + Agi + ".");
            System.out.println("Your inteligence is " + Int + ".");
            System.out.println("Your attack is " + Atk + ".");
            System.out.println("Your charisma is " + Cha + ".");
            System.out.println("Your luck is " + Luc + ".");
            System.out.println("Your wisdom is " + Wis + ".");
            System.out.println("Your defense is " + Def + ".");
        }
        if (Choice1.contains("2")){
            System.out.println("You decide to head for the nearest fighting to continue your quest to make a difference in the world.");
            System.out.println("You stumble onto a war in the happening and you decide to help the humans fighting the dmons.");
            System.out.println("After taking out "+Atk+" enemies you are finaly periced by "+Eatk+" demon claws from out of no where.");
            System.out.println(" ");
            System.out.println("At least you died knowing that you were able to do what "+Hp +" humans would have been able to do.");
        }
    }
}
