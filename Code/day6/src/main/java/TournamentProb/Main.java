package TournamentProb;

public class Main {
    public static void main(String[] args){
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
        Player p3 = new Player("p3");
        Player p4 = new Player("p4");
        Player p5 = new Player("p5");
        Player p6 = new Player("p6");
        Player p7 = new Player("p7");
        Player p8 = new Player("p8");

        Game finale = new Game("finale");
        finale.setPlayer1(p4);
        finale.setPlayer2(p6);
        finale.setScore1(3);
        finale.setScore2(0);

        Game semi1 = new Game("semi 1");
        semi1.setPlayer1(p2);
        semi1.setPlayer2(p4);
        semi1.setScore1(1);
        semi1.setScore2(2);

        Game semi2 = new Game("semi 2");
        semi2.setPlayer1(p6);
        semi2.setPlayer2(p7);
        semi2.setScore1(2);
        semi2.setScore2(0);

        Game quarter1 = new Game("quarter 1");
        quarter1.setPlayer1(p1);
        quarter1.setPlayer2(p2);
        quarter1.setScore1(2);
        quarter1.setScore2(4);

        Game quarter2 = new Game("quarter 2");
        quarter2.setPlayer1(p3);
        quarter2.setPlayer2(p4);
        quarter2.setScore1(1);
        quarter2.setScore2(3);

        Game quarter3 = new Game("quarter 3");
        quarter3.setPlayer1(p5);
        quarter3.setPlayer2(p6);
        quarter3.setScore1(0);
        quarter3.setScore2(5);

        Game quarter4 = new Game("quarter 4");
        quarter4.setPlayer1(p7);
        quarter4.setPlayer2(p8);
        quarter4.setScore1(5);
        quarter4.setScore2(2);

        Tournament tour = new Tournament();
        tour.insert(finale);
        tour.addLeft(semi1);
        tour.addRight(semi2);
        tour.left.addLeft(quarter1);
        tour.left.addRight(quarter2);
        tour.right.addLeft(quarter3);
        tour.right.addRight(quarter4);

        tour.checkValid();

    }
}
