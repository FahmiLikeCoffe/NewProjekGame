package game.game;
public class GameGame {
    public static void main(String[] args) {
        Player hero = new Player();
        Player Villain = new Player();
        Player AntiHero = new Player();
        
        hero.name = "NiggaMan ";
        hero.speed = 80;
        hero.healthPoint = 120;
        hero.attack = 20;
        hero.defend = 40;
        
        Villain.name = "Muhammad sumbul ";
        Villain.speed = 150;
        Villain.healthPoint = 999;
        Villain.attack = 90;
        Villain.defend = 80;
      
        
        hero.run();
        if(hero.isDead()){
            System.out.println("LOSER");
        }else{ System.out.println("FIRST LUCKY");
        }
        hero.Damage();
        if(hero.ATK()){
            System.out.println("LOSER");
        }else{ System.out.println("FIRST LUCKY");
        }
        hero.Defen();
        if(hero.DFN()){
            System.out.println("LOSER");
        }else{ System.out.println("FIRST LUCKY");
        }
     
         Villain.run();
        if(Villain.isDead()){
            System.out.println("LOSER");
        }else{ System.out.println("FIRST LUCKY");
        }
        Villain.Damage();
        if(Villain.ATK()){
            System.out.println("LOSER");
        }else{ System.out.println("FIRST LUCKY");
        }
        Villain.Defen();
        if(Villain.DFN()){
            System.out.println("LOSER");
        }else{ System.out.println("FIRST LUCKY");
        }
        
        
    }
    
}
