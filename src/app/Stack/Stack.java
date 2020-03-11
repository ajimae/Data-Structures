package app.Stack;

/**
 * Stack
 */
public class Stack {
  private int[] stack;
  private int top;
  private int size;

  public Stack() {
    this.top = - 1;
    this.size = 50;
    this.stack = new int[50];
  }

  public Stack(int size) {
    this.top = -1;
    this.size = size;
    this.stack = new int[this.size];
  }

  public boolean isFull() {
    return top == (this.stack.length - 1);
  }

  public boolean push(int item) {
    if(isFull())
      return false;
    this.stack[++top] = item;
    return true;
  }

  public int pop() {
    return this.stack[top--];
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public int getIndex(int item) {
    for(int i = 0; i < this.stack.length; i++)
      if(this.stack[i] == item)
        return i;
      return -1;
  }
}