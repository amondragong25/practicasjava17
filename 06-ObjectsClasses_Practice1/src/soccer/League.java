/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer;

/**
 *
 * @author Adriana
 */
public class League {
    
    public static void main(String[] args){
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        
        Player[] thePlayers = {player1, player2, player3};
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        System.out.println("Equipo " + team1.teamName);
        for (Player thePlayer: team1.playerArray){
            //player1.playerName = "Robert Service";
            //System.out.println("Nombre del jugador: " + team1.playerArray[0].playerName);
            System.out.println("Nombre del jugador: " + thePlayer.playerName);
        }
        
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Dervice";
        
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        System.out.println("------------------");
        System.out.println("Equipo " + team2.teamName);
        for (Player player : team2.playerArray){
            System.out.println("Nombre del jugador: " + player.playerName);
        }
        
    }
}
