#  Exercise 2: Implementing the Factory Method Pattern

##  Objective

To build a document management system that can create different types of documents (Word, PDF, Excel) using the *Factory Method Design Pattern*.

---

##  What is the Factory Method Pattern?

- It is a *creational design pattern*.
- It allows a class to *delegate the creation of objects* to subclasses.
- Instead of creating objects directly using new, we use a *factory method* to create them.
- This makes the code *more flexible, **easier to maintain, and **open to extension*.

---

##  How It Works in This Exercise

### 1. *Document Interface*
- A common type is defined for all documents, such as Document.
- This helps us treat all documents in a similar way.

### 2. *Concrete Document Classes*
- We create specific classes for each document type:
  - WordDocument
  - PdfDocument
  - ExcelDocument

Each of these classes implements the Document interface.

### 3. *Abstract Factory Class*
- An abstract class DocumentFactory is created with a method createDocument().
- This class doesn't know which document to create. It leaves that decision to subclasses.

### 4. *Concrete Factory Classes*
- For each document type, we create a factory class:
  - WordDocumentFactory
  - PdfDocumentFactory
  - ExcelDocumentFactory
- Each of these overrides the createDocument() method to return the correct document type.

### 5. *Main Class (Test)*
- In the main program, we use these factories to create documents without knowing their exact class.
- This shows how *factory methods make object creation more flexible* and loosely coupled.

---

##  Advantages of Using Factory Method Pattern

- *Encapsulation*: Object creation logic is separated from the main logic.
- *Scalability*: Easy to add new document types without changing existing code.
- *Maintainability*: Changes to object creation are isolated in factory classes.

---

## Conclusion

Using the Factory Method Pattern helps us create different document types dynamically and efficiently. It provides a clean, extensible structure and keeps the code organized by separating object creation from usage logic.