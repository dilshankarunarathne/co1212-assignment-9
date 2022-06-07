# CO1212 - Assignment 9

Implement a java program using queue to check if an expression is balanced or not.

## My algorithm
- Queue queue
- Integer count

* For each character in the expression:
  * If it's a bracket -> 
    * Enqueue to the queue
    * Increment the count
  * Otherwise -> do nothing
* For each element in the queue:
  * String half
  * Halfway through the traverse:
    * Dequeue elements and add it to the front of half
  * For the rest of the traverse:
    * Check whether each element (should be a closing bracket) of the queue matches the corresponding opening bracket from the character at i<sup>th</sup> place in half

