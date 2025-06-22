#  Singleton Pattern – Explanation 

##  Logger.java – Singleton Class

* Logger.java is a class that follows the *Singleton Design Pattern*.
* The purpose is to ensure that *only one object* of Logger exists in the whole program.
* It has:

  * A *private static variable* to hold the single instance.
  * A *private constructor* so that no one can create objects from outside.
  * A **public method getInstance()** that returns the same single object every time.
* This is useful when we want to have a single shared object, like for logging messages.

---

##  Main.java – Testing Singleton

* Main.java is used to test the Logger class.
* It gets two references using Logger.getInstance().
* Then it logs two messages using those references.
* Finally, it checks whether both references point to the *same object*.
* If they are the same, it confirms that the Singleton pattern is working correctly.

---

## Conclusion

* This example shows how to *create and use a singleton object* in Java.
* It helps in *avoiding multiple unnecessary objects* and ensures *consistent behavior* across the program.