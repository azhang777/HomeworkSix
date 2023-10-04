# NOTES:
- The `Math` class does not have any instance (object) variables. Because all the methods of the `Math` class are static, we can use those methods without having to create a `Math` object.

- Static methods can be called without any object using them. A static method means that the behavior is not dependent on an instance variable of the object.

- Static methods cannot use non-static variables.

- Non-static methods can use both static and non-static (instance) variables.

- Static variables are something that is shared between all instances (objects) of a class.

- Static variables are initialized when a class is loaded, not when an object is created.

- Static final variables are constants shared in a class.

- We can have final methods (cannot be overridden) and final classes (cannot be extended).

- There is a wrapper class for every primitive type (turns primitive into objects).

- Wrapper classes have static methods like turning Strings into Double/Integer.

- Format String with certain syntax such as %,d (puts commas and formats the integer), %.f (format the floating point with a precision of 2 decimal spots).

- `String.format("The rank is %,d out of %,.2f", one, two)` is how we can do multiple arguments when formatting a string.

- Java API has the built-in ability to allow us to manipulate dates and times. `java.util.Calendar` is the most prominent utility package for this job.
