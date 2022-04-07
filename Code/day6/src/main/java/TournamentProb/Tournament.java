package TournamentProb;

public class Tournament {
    private Game root = null;
    Tournament left =null;
    Tournament right = null;

    Tournament(){

    }
    public Tournament createTournament(){
        return new Tournament();
    }
    public void insert(Game game){
        if(root == null) {
            root = game;
            return;
        }
    }
    public void addLeft(Game game){
        if(left==null){
            left = new Tournament();
            left.root=game;
        }
    }
    public void addRight(Game game){
        if(right==null){
            right = new Tournament();
            right.root=game;
        }
    }
    public void checkValid(){
        int error=0;
        if(root == null){
            return;
        }
        if(this.left!=null)
        {
            if(this.root.containPlayer(this.left.root.getWinner()))
            {
                this.left.checkValid();
            } else{
                error++;
                System.out.println("Tournament is not valid at game:"+root.getName());
            }
        }

        if(this.right!=null)
        {
            if(this.root.containPlayer(this.right.root.getWinner()))
            {
                this.right.checkValid();
            } else{
                error++;
                System.out.println("Tournament is not valid at game:"+root.getName());
                return;
            }
        }
        System.out.println("Check tournament complete at:"+this.root.getName());
    }
}
