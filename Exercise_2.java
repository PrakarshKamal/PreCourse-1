// Time complexity: O(1)
// Space complexity: O(1) or O(n) depending on push
// Any problem you faced while coding this : 

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
        } 
    } 
    
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode n = new StackNode(data);

        if (root == null) {
            root = n;
        }
        else {
            StackNode tmp = root;
            root = n;
            n.next = tmp;
        }
    } 
  
    public int pop() 
    {   
    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            StackNode tmp = root;
            root = root.next;
            return tmp.data;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            return root.data;
        }
    } 
  
    //Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
