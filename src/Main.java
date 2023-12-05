public class Main {
    public static void main(String[] args) {
        Character SCK = new Warrior("SCKagura", "Warrior");
        Sword sword = new Sword();
        SCK.showStats();
        Daggers daggers = new Daggers();
        SCK.EquipWeapon(daggers);
        SCK.EquipWeapon(sword);
        SCK.showStats();

        Character DUMMY = new Warrior("Dummy", "Warrior");

        SCK.attack(DUMMY);
        DUMMY.showStats();


        Character assassin = new Assasin("Assassin1", "Assassin");
        Sword assassinSword = new Sword();
        assassin.EquipWeapon(assassinSword);
        assassin.showStats();

        Character assassinTarget = new Assasin("AssassinTarget", "Assassin");
        assassin.attack(assassinTarget);
        assassinTarget.showStats();
    }

}
