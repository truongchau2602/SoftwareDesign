public class StudentArchive {
    public String[] students={"Nam","Thanh", "Viet", "Duy"};
    public void printFromLeftToRight(){
        for(int i=0; i< students.length;i++){
            System.out.println("Student:"+ students[i]);
        }
    }
    public void printFromRightToLeft(){
        for(int i= students.length;i==0;i--){
            System.out.println("Student2:"+students[i]);
        }
    }
    private void createTree(){
        Student s1 = new Student("Nam");
        Student s2 = new Student("Thanh");
        Student s3 = new Student("Viet");
        Student s4 = new Student("Duy");
        StudentTree root = new StudentTree();
        root.insert(s1);
        root.left.insert(s2);
        root.right.insert(s3);
        root.left.left.insert(s4);

    }
    public void printTree(){
        Student s1 = new Student("Nam");
        Student s2 = new Student("Thanh");
        Student s3 = new Student("Viet");
        Student s4 = new Student("Duy");
        StudentTree tree = new StudentTree();
        tree.insert(s1);
        tree.addLeft(s2);
        tree.addRight(s3);
        tree.left.addLeft(s4);
        tree.printTree();
    }

}
