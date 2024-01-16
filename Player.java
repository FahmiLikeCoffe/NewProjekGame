package game.game;
public class Player {
    String name ;
    int speed, healthPoint, attack, defend;
    
    void run(){
        System.out.println(name +"is running...");
        System.out.println("Speed: "+speed);
   }
    boolean isDead(){
        if(healthPoint <= 50) return true;
        return false;
    }
    
      void Damage(){
         System.out.println(name +" is attacking...");
        System.out.println("Damage: "+attack);
    }
       boolean ATK(){
        if(attack <= 50) return true;
        return false;
        
}
        void Defen(){
         System.out.println(name +" is Defending...");
        System.out.println(name +"Defend: "+defend);
    }
       boolean DFN(){
        if(defend <= 50) return true;
        return false;
}}
