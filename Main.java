import java.util.Stack;

public class Main{
//abstract data type and can be implements with arrays or linked lists
//Last in first out. Last item inserted is the first taken out.
//graph algorithms rely heavily on stacks

/*
pop() remove last item, 
push() push new item onto stack, 
peek() get value of last item without removal
*/
//modern programming languages are stack oriented/complied down to stack oriented bytecode


/*define most basic operations as taking their arguments
from stack and placing return values back on the stack
*/
            
    public static void main(String[] args) {
        //generic data structure
        Stack<String> names = new Stack<>();
        names.add("Matthew");//will work but usually push is used
        names.push("Matte");
        names.push("word");
        names.push("another");
        names.push("matthiu");
        names.push("name");

        while(!names.isEmpty()){
            System.out.println(names.pop());
        }

    }

}