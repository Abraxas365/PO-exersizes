import java.util.ArrayList;

public class myStack {
    private ArrayList<Integer> stack = new ArrayList<Integer>();
    private ArrayList<Integer> maxStack = new ArrayList<Integer>();
    private int index = -1;
    private int maxIndex = -1;
    
    public void push(int num){
        stack.add(num);
        if(index == -1){
            maxStack.add(num);
            maxIndex++;
        } else if (num >= maxStack.get(maxIndex)){
            maxStack.add(num);
            maxIndex++;
        }
        index++;
        return;
    }
    
    public int pop(){
        int toReturn = stack.get(index);
        stack.remove(index); //will throw exception if index is -1 (empty stack)
        index--;
        if (toReturn == maxStack.get(maxIndex)){
            maxStack.remove(maxIndex);
            maxIndex--;
        }
        return toReturn;
    }
    
    public int max(){
        return maxStack.get(maxIndex);
    }
    
    
}