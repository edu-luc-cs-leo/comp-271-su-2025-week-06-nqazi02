/**
 * Implementation of a First-In-First-Out (FIFO) queue using DynamicArray as the
 * underlying storage. Implements Comparable, Xifo, and Fifo interfaces.
 */
public class Queue extends DynamicArray implements Comparable<Queue>, Xifo<String>, Fifo<String> {

    /**
     * Compares this queue to another queue based on size.
     * @param other the queue to compare to
     * @return negative if this is smaller, 0 if equal, positive if larger
     */
    public int compareTo(Queue other) {
        return Integer.compare(this.getOccupancy(), other.getOccupancy());
    }

    /**
     * Returns the front element without removing it.
     * @return the front element or null if empty
     */
    public String peek() {
        if (this.getOccupancy() == 0) {
            return null;
        }
        return this.underlying[0];
    }

    /**
     * Removes and returns the front element.
     * @return the removed element or null if empty
     */
    public String pop() {
        return this.remove(0);
    }

    /**
     * Adds an element to the rear of the queue.
     * @param e the element to add
     */
    public void add(String e) {
        super.add(e);
    }

    /**
     * String representation of the queue.
     * @return string showing queue contents
     */
    public String toString() {
        if (this.getOccupancy() == 0) {
            return "Queue: []";
        }
        StringBuilder sb = new StringBuilder("Queue: [");
        for (int i = 0; i < this.getOccupancy(); i++) {
            sb.append(this.underlying[i]);
            if (i < this.getOccupancy() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}