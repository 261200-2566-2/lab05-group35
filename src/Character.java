public interface Character {
 default   void  attack(Character Enemy){
        Enemy.getatk(GetAtkDMG());
 }
    void showStats() ;
     void getatk(double atk);
    void EquipWeapon(Weapons weapons) ;
    double  GetAtkDMG() ;

}
