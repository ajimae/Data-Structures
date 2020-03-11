package app.Queue;

import java.util.ArrayList;

/**
 * Queue
 */
public class GenericQueue<T> {
  private ArrayList<T> queue;

  public GenericQueue() {
    this.queue = new ArrayList<>();
  }

  public int getSize() {
    return this.queue.size();
  }

  public void enqueue(T item) {
    this.queue.add(item);
  }

  public T dequeue() {
    T item = queue.get(0);
    queue.remove(0);
    return item;
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }
}