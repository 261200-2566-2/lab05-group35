


public class Main {
        public static void main(String[] args) {
            Character SCK = new Warrior("SCKagura", "Warrior") ;
            Sword Sword = new Sword() ;
            SCK.showStats(); 
            Daggers daggers = new Daggers() ;
            SCK.EquipWeapon(daggers);
            SCK.EquipWeapon(Sword);
            SCK.showStats();
        Character DUMMY = new Warrior("Dummy", "Warrior") ;

        SCK.attack(DUMMY) ;
        DUMMY.showStats(); 
        }

}
