# Data Structures & Algorithms in Java

A. Big-O Notation: describes how the Runtime or Space of an algorithm grows as the input size increases
- Measuring Aspect: Runtime & Space
- Types:
    - O(n) (Linear Complexity): algorithm's runtime grows linearly with the size of the input
      - Examples:
        - Runtime:
          - ```
            function(arr) {
              for each element in arr {
                print(element)
              } 
            }
            ```
        - Space:
          - ```
            function(arr) {
              for each element in arr {
                newArr.add(element)
              }
    
              return newArr
            }
            ```
      - O(1) (Constant Complexity): algorithm runs in constant time, no matter how big the input is
        - Examples:
          - Runtime:
            - ```
              function(arr) {
                print(arr.size)
              }
              ```
          - Space:
            - ```
              function(arr) {
                for each element in arr {
                  print(element)
                } 
              }
              ```
      - O(n^2) (Quadratic Complexity): algorithm's runtime grows quadratically as the input size increases, typically due to two nested loops
        - Examples:
          - Runtime:
            - ```
              function(arr) {
                 for (int i = 0; i < arr.length; i++) {
                   for (int j = 0; j < arr.length; j++) {
                     println(element);
                   }
                 }
              }
              ```
      - O(log(n)) (Logarithmic Complexity): algorithm's runtime grows logarithmically, typically halving the input size with each step
- Constants: should be dropped in a Big-O notation
  - Example:
    - ```
      function(arr) {
        for (int i = 0; i < arr.length; i++) {
          print(i)
        }
      
        for (int i = 0; i < arr.length; i++) {
          print(i)
        }
      }
      ```
    - The runtime complexity of the algorithm above is O(2n), because `for` loop run twice
    - We drop the constants `2`, so the final Big-O notation is O(n)
- Dominant & Non-Dominant Factors: we could drop non-dominant factors in a Big-O notation
  - Order (Dominant to Non-Dominant): O(n^2) > O(n) > O(log(n)) > O(1)
  - Example:
    - ```
      function(arr) {
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length; j++) {
            print(j)
          }
        }

        for (int i = 0; i < arr.length; i++) {
          print(j)
        }
      }
      ```
    - The runtime complexity of the algorithm above is O(n^2 + n)
    - We drop the `n` because it's non-dominant, so the final Big-O notation is O(n^2)

B. Data Structures  
1. Linked List:
    - collection of data elements whose order is not given by their physical placement in memory
    - data elements point to the next element instead
    - Visualization:
        - <img src="../main/stock/linked-list-viz.jpg" alt="Linked List Visualization" height="192">
