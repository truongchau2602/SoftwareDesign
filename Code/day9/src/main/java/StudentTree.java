public class StudentTree {
    Student root=null;
    StudentTree left= null;
    StudentTree right=null;

    public void insert(Student student){
        if(root == null) {
            root = student;
        }
    }
    public void addLeft(Student s){
        if(left==null){
            left = new StudentTree();
            left.root=s;
        }
    }
    public void addRight(Student s){
        if(right==null){
            right = new StudentTree();
            right.root=s;
        }
    }

    public void printTree(){
        if(this.left!=null){
            this.left.printTree();
        }
        if(this.right!=null){
            this.right.printTree();
        }
        if(root!=null){
            System.out.println(root.getName());
        }

    }

}
