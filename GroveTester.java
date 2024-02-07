public class GroveTester {
    public static void main(String args[]){
       Grove Grove_1 = new Grove("Grove_1");
       System.out.println(Grove_1);
       Tree t = new Tree(1,37, "Spruce");
       for(int i = 0; i < 7; i++){
            Grove_1.plantTree(t);
       }
       System.out.println(Grove_1);
       Grove_1.removeTree(3);
       Grove_1.removeTree(5);
       System.out.println(Grove_1);
       Tree m = new Tree(2, 13, "Maple");
       Grove_1.plantTree(m);
       System.out.println(Grove_1);
    }
}
