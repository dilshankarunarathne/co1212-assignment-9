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
  * Halfway through the traverse:
    * 