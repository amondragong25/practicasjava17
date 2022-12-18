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
        
        /* Practice 8-1. Start of code that builds teams */
       
        /* Practice 8-1. End of code that builds teams */
        
        /* Practice 8-1. Delete next three lines */
        
        Team[] theTeams = createTeams();
        Game[] theGame = createGames(theTeams);
        
        Game currGame = theGame[0];
        
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.awayTeam.playerArray[2];
        goal1.theTeam = currGame.awayTeam;
        goal1.theTime = 55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " + 
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName); 
    }
    
    
    /* Practice 8-1. Add new static method createTeams() here */
    public static Team[] createTeams(){
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
        
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        Team[] teams = {team1, team2};
        return teams;
    }
    
    
    /* Practice 8-1. Add new static method createGames() here */
    public static Game[] createGames(Team[] teams){
        Game game1 = new Game();
        game1.homeTeam = teams[0];
        game1.awayTeam = teams[1];
        
        Game[] games = {game1};
        return games;
    }
    
}
