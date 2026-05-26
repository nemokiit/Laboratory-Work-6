# Java Programming: Laboratory Work 6

This repository contains the solutions for the sixth laboratory work in Java programming. The lab focuses on Generics, the Java Collections Framework (Lists, Maps), and Iterators.

## Assignment Details
1. **TopWords:** Reads a text file (`aboba.txt`), counts the frequency of each word using a `HashMap`, sorts the map entries using a custom `Comparator`, and prints the top 10 most frequent words.
2. **Generic Stack:** Implements a custom Generic `Stack<T>` data structure backed by an Object array. It includes `push()`, `pop()`, and `peek()` operations, handling overflow and empty state exceptions.
3. **StoreSales (Variant 6):** A sales tracking program that uses a `TreeMap<String, Integer>` to store products and their sales quantities. `TreeMap` inherently keeps the products sorted alphabetically. The program calculates total items sold and identifies the best-selling product.

## How to Run

1. Clone this repository and navigate to the project directory.
2. Compile all source files:
   ```bash
   javac *.java
   ```
3. Run the programs individually:
   To run the sales tracker:
  ```
  java StoreSales
  ```

  To run the TopWords analyzer (ensure you create a file named aboba.txt with at least 10 words in the same directory first):
  ```
  java TopWords
  ```
