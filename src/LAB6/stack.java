package LAB6;

import java.util.LinkedList;

public class stack
{
    LinkedList q = new LinkedList();
    void push(int val) {            // Push operation
        int size = q.size();
        q.add(val);
        // Pop (or Dequeue) all previous elements and put them after current element
        for (int i = 0; i < size; i++) {
            // this will add front element into rear of queue
            int x = (int) q.remove();
            q.add(x);
        }
    }
    int pop() {                  // Removes the top element
        if (q.isEmpty())
        {
            System.out.println("No elements");
            return -1;
        }
        int x = (int) q.remove();
        return x;
    }
    int top() {                     // Returns top of stack
        if (q.isEmpty())
            return -1;
        return (int) q.peek();
    }
    public static void main(String[] args)
    {
        stack s = new stack();
        s.push(10);
        s.push(20);
        System.out.println("Top element :" + s.top());
        s.pop();
        s.push(30);
        s.pop();
        System.out.println("Top element :" + s.top());
    }
}