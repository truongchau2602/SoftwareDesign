package TournamentProb;

public class Game {
    private String name;
    private Player player1 = null;
    private Player player2 =null;
    private int score1;
    private int score2;
    Game(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean containPlayer(Player p){
        if(player1.equals(p)|| player2.equals(p)){
            return true;
        }
        return false;
    }
    public Player getWinner(){
        if(score1>score2){
            return player1;
        }
        if(score1<score2){
            return player2;
        }
        return null;
    }
    public Player getLoser(){
        if(score1>score2){
            return player2;
        }
        if(score1<score2){
            return player1;
        }
        return null;
    }
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }
}