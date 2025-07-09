# Week 06 Reflection

## Implementation Analysis

### What I Did Well:
1. **Interface Implementation**: Correctly implemented all required interfaces (Xifo, Lifo/Fifo, Comparable)
2. **DynamicArray Utilization**: Effectively used DynamicArray as the underlying storage
3. **LIFO/FIFO Behavior**: Properly implemented stack and queue behaviors
4. **Edge Case Handling**: Added checks for empty collections in peek() and pop()

### Areas for Improvement:
1. **Initial Design**: First attempt tried to implement both in one class before realizing separate classes were needed
2. **Error Handling**: Could add more detailed error messages for edge cases
3. **Performance**: Initially considered optimizing Queue's pop() before realizing DynamicArray handles shifting

### Key Learnings:
1. **Interface Implementation**: Better understood how to implement multiple interfaces
2. **Code Reuse**: Saw how DynamicArray could power both Stack and Queue
3. **Comparable**: Reinforced proper implementation of compareTo()

### Improvement Plan:
1. **Design First**: Will create UML diagrams before coding for complex relationships
2. **Test Early**: Will write test cases before implementation
3. **Document More**: Will add more detailed comments during implementation

## Testing Verification

After testing with DynamicArrayTest, all tests passed successfully. The implementations:
- Correctly handle empty collections
- Maintain proper ordering (LIFO for Stack, FIFO for Queue)
- Implement all required interfaces
- Follow the Programmer's Pact