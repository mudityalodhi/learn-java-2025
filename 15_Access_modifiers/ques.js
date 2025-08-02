//? ✅ Q1: private Access Modifier (Beginner)
// Create a class Student with the following:
// Private fields: name and marks
// Constructor to initialize both
// Getter method for name
// No setter for marks, only a method to print if student passed (marks > 33)

// 🧠 Goal: Practice accessing private data safely via methods.

//? ✅ Q2: default vs protected (Intermediate)
// Create two packages: pkg1 and pkg2
// In pkg1, make a class Parent with:
// A default method sayHello()
// A protected method sayProtected()
// In pkg2, make a class Child that extends Parent. Try accessing both methods from Child and also from Main.

// 🧠 Goal: Understand how default is package-level only, but protected works in inheritance across packages.

// ✅ Q3: public Modifier & Singleton with Private Constructor (Advanced)
// Create a class ConfigManager that follows Singleton pattern:
// Constructor must be private
// Method getInstance() should return the same object every time
// Add a public method printConfig() to print "App Running"
// Now create a Main class and call getInstance() twice. Prove both objects are same using ==.

// 🧠 Goal: Practice combining private + public access for controlled object creation.
