package TournamentBinaryTree;

public class Leaf {
    Player p1,p2;
    int point1, point2;
    Leaf(Player p1, int point1, int point2, Player p2){
        this.p1=p1;
        this.point1= point1;
        this.point2=point2;
        this.p2=p2;
    }
    Player getP1(){
        return p1;
    }
    Player getP2(){
        return p2;
    }
    int getPoint1(){
        return point1;
    }
    int getPoint2(){
        return point2;
    }

}
