package app.Stack;

/**
 * GenericStack
 */
import java.util.ArrayList;
public class GenericStack<T> {
  private ArrayList<T> stack;

  public GenericStack() {
    this.stack = new ArrayList<>();
  }

  public int getSize() {
    return this.stack.size();
  }

  public T peek() {
    return this.stack.get(getSize() - 1);
  }

  public void push(T item) {
    this.stack.add(item);
  }

  public T pop() {
    T item = this.stack.get(getSize() - 1);
    this.stack.remove(getSize() - 1);
    return item;
  }

  public boolean isEmpty() {
    // return getSize() == 0;
    return this.stack.isEmpty();
  }

  @Override
  public String toString() {
    return "stack: " + this.stack.toString();
  }
}
