public class Grove {
    public Tree[] arTree = new Tree[12];
    public String grove_name;

    public Grove(String g){
        grove_name = g;
    }
    public int plantTree(Tree t){
        for(int i = 0; i < arTree.length; i++){
            if(arTree[i] == null){
                arTree[i] = t;
                return i;
            }
        }
        return -1;
    }
    public Tree removeTree(int i){
        if(arTree[i] != null){
            Tree temp = arTree[i];
            arTree[i] = null;
            return temp;
        }
        else{
            return null;
        }
    }
    public String toString(){
        int count = 0;
        for(Tree i : arTree){
            if(i != null){
                count++;
            }
        }
        return "" + count;
    }
}
