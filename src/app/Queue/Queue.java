package app.Queue;

/**
 * Queue
 */
public class Queue {
  private int[] queue;
  private int front, rear, total, size;

  public Queue() {
    this.size = 50;
    this.rear = 0;
    this.front = 0;
    this.total = 0;
    this.queue = new int[this.size];
  }

  public Queue(int size) {
    this.rear = 0;
    this.front = 0;
    this.total = 0;
    this.size = size;
    this.queue = new int[this.size];
  }

  public boolean isFull() {
    return (this.size == this.total);
  }

  public void enqueue(int item) {
    if(isFull())
      return;
    this.total++;
    this.queue[this.rear] = item; 
    this.rear = (this.rear + 1) % this.size; // circular increment
  }

  public int dequeue() {
    int item = this.queue[this.front];
    this.total--;
    this.front = (this.front + 1) % this.size; // circular increment
    return item;
  }

  public void showQueue() {
    int needle = this.front;
    if(total == 0)
      return;
    for(int i = 0; i < total; i++) {
      System.out.println(" " + this.queue[needle]);
      needle = (needle + 1) % this.size;
    }
  }
}