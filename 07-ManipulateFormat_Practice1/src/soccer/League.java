/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create team1      
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = {player1, player2, player3 };
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        // Create team2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " + 
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);
        
        /* Practice 7-1. Add code for finding a player within team2 here */
        
        for (Player player: team2.playerArray){
            System.out.println("Jugador " + player.playerName);
            
            if (player.playerName.contains("Rob")){
                System.out.println("Encontrado: " + player.playerName);
                
                String[] arrNombre = player.playerName.split(" ");
                System.out.println("Su apellido es " + arrNombre[1]);
            }
            System.out.println("------------------");
        }
        
        // Separar los nombres del Team1
        for (Player player : team1.playerArray){
            String[] arrNombres = player.playerName.split(" ");
            
            for (String name: arrNombres){
                System.out.println("Nombre " + name); 
            }                    
        }
        
        //Instancia un StringBuilder
        StringBuilder familyNameFirst = new StringBuilder();
        for (Player player : team1.playerArray){
            String[] arrNombres = player.playerName.split(" ");
            
            familyNameFirst.append(arrNombres[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(arrNombres[0]);
            
            System.out.println(familyNameFirst); 
            
            familyNameFirst.delete(0, familyNameFirst.length());
            
            System.out.println(familyNameFirst);
        }
        
        
        
    }   
}
