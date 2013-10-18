package fr.iutvalence.java.mp.CelticChess;

/**
 * This class represents a CelticChess's game
 * 
 * @author delaplvi and dufourlu
 * 
 */
public class CelticChess
{
    /**
     * Board which we will place all pawns (9x9 cases)
     */
    public Board board;

    /**
     * The former player will play (white)
     */
    public Player player1;
    
    /**
     * The later player will play (black)
     */
    public Player player2;

    /**
     * Define the time each player play
     */
    public Chrono chrono;
    
    /**
     * Define all of the settings for the game.
     */
    
    public CelticChess() {
        
        this.chrono = new Chrono();
        this.board = new Board();
        this.player1 = new Player();
        this.player2 = new Player();
    }

    /**
     * reinitialize startGame for each new game, for that 
     * call Chrono from Chrono.java to set up the time. 
     */
    public void startGame() {
      
          /* while
           * player1 (dépend si blanc ou noir pour le roi)
           * si le roi est dans l'angle ( ou n'existe plus )
           * return finpartie
           * else tour joueur2
           */ 
    }

}