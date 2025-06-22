Understand Recursive Algorithms

### 🔁 What is Recursion?

**Recursion** is a programming technique in which a method calls itself to solve smaller subproblems of a larger task. Each recursive call breaks the original problem down into simpler instances, until it reaches a **base case** that can be solved directly.

A recursive function typically has two parts:
1. **Base Case** – the condition under which the recursion ends.
2. **Recursive Case** – where the function calls itself with a modified input.

---

### 🧠 Why Use Recursion?

Recursion simplifies problems that exhibit **repetitive substructure** or can be broken into **smaller identical tasks**, such as:

- Calculating factorials
- Computing Fibonacci numbers
- Traversing trees
- Solving divide-and-conquer problems (like mergesort, binary search)
- Modeling mathematical growth (e.g., financial forecasting)

---

### 💡 Real-World Use: Financial Forecasting

In financial forecasting, future value can be calculated recursively:
- Multiply the current value by the growth factor
- Recur over the remaining years
- Base case: when `years == 0`, return the original value

This mirrors how growth compounds over time and demonstrates recursion in a simple yet powerful way.
