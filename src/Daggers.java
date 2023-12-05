public class Daggers implements Weapons{
    double addatk = 5 ;
    double adddef = 0 ;
    public double addAtk() {
     
        return addatk  ;

    }
    public double addDef() {
    
        return adddef ; 

    }
    public void PrintStats(){
        System.out.println("Sword Stats");
        System.out.println("add ATK :" + addatk) ;
        System.out.println("add Def : "+adddef);

    }   
}
