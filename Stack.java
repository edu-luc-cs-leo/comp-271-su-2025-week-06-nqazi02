/**
 * Implementation of a Last-In-First-Out (LIFO) stack using DynamicArray as the
 * underlying storage. Implements Comparable, Xifo, and Lifo interfaces.
 */
public class Stack extends DynamicArray implements Comparable<Stack>, Xifo<String>, Lifo<String> {

    /**
     * Compares this stack to another stack based on size.
     * @param other the stack to compare to
     * @return negative if this is smaller, 0 if equal, positive if larger
     */
    public int compareTo(Stack other) {
        return Integer.compare(this.getOccupancy(), other.getOccupancy());
    }

    /**
     * Returns the top element without removing it.
     * @return the top element or null if empty
     */
    public String peek() {
        if (this.getOccupancy() == 0) {
            return null;
        }
        return this.underlying[this.getOccupancy() - 1];
    }

    /**
     * Removes and returns the top element.
     * @return the removed element or null if empty
     */
    public String pop() {
        return this.remove(this.getOccupancy() - 1);
    }

    /**
     * Adds an element to the top of the stack.
     * @param e the element to add
     */
    public void push(String e) {
        this.add(e);
    }

    /**
     * String representation of the stack.
     * @return string showing stack contents
     */
    public String toString() {
        if (this.getOccupancy() == 0) {
            return "Stack: []";
        }
        StringBuilder sb = new StringBuilder("Stack: [");
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