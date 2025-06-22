 Analysis

### ⏱️ Time Complexity of Recursive Forecasting

The recursive algorithm calculates the future value by making one recursive call per year:

```java
forecastRecursive(value, rate, years - 1)
```

This results in **`O(n)` time complexity**, where `n` is the number of years. Each recursive call performs one multiplication and proceeds until it hits the base case (`years == 0`).

**Space Complexity** is also **`O(n)`** due to the function call stack — each recursive call consumes memory until the recursion unwinds.

---

### ⚠️ Drawbacks of Recursive Approach

- **Stack Overflow Risk**: For large `n` (e.g., forecasting over hundreds of years), too many recursive calls can exceed the Java call stack limit and cause a `StackOverflowError`.
- **Inefficient for Repeated Use**: If the function is called repeatedly in real-time forecasting or simulation, the call stack overhead can affect performance.

---

### ✅ Optimizing the Recursive Solution

To avoid excessive computation and improve efficiency:

1. **Use Iteration Instead**:
   - Replace recursion with a simple `for` loop.
   - Iterative methods avoid call stack overhead and are more efficient in practice.
   - Time and space complexity becomes **`O(n)` time and O(1) space**.

2. **Memoization** *(not needed here but useful for Fibonacci-style problems)*:
   - Store already computed values in a cache to avoid recomputation.
   - Useful when recursion involves overlapping subproblems (not the case here).

---

### 🔍 Conclusion

While recursion provides a clean and intuitive solution for modeling financial growth, it is better suited for small to medium input sizes. For production-grade financial forecasting tools, **iterative or closed-form approaches (like compound interest formulas)** are preferred for efficiency and reliability.
