Understand Asymptotic Notation

### 🔹 Big O Notation and Its Importance

**Big O notation** is a mathematical tool used to describe the performance or complexity of an algorithm as the size of the input grows. It helps engineers and developers evaluate how an algorithm scales — not in terms of actual time, but in terms of **growth rate**.

This notation provides a **high-level approximation** of:
- **Time complexity**: how long an algorithm takes to execute
- **Space complexity**: how much memory an algorithm uses

Big O allows us to compare algorithms independently of hardware, language, or implementation — which is especially important for large-scale systems like e-commerce platforms where performance and scalability are critical.

---

### 📊 Best, Average, and Worst-Case Scenarios in Search

When analyzing search algorithms, we consider three runtime scenarios:

| Case           | Description                                                               | Example for Linear Search        | Example for Binary Search        |
|----------------|---------------------------------------------------------------------------|----------------------------------|----------------------------------|
| **Best Case**  | The ideal scenario — minimum work is needed                               | Target is the first item → O(1) | Target is exactly at the midpoint → O(1) |
| **Average Case** | The expected runtime over a typical dataset                             | Target is somewhere in middle → O(n/2) → O(n) | Takes ~log₂(n) comparisons → O(log n) |
| **Worst Case** | The most time-consuming scenario possible                                 | Target not found → all elements scanned → O(n) | Target not present → repeated halving → O(log n) |

🔍 These cases help in:
- Choosing the right algorithm depending on data size and frequency of use
- Estimating performance under different load conditions
- Making informed decisions about scalability
