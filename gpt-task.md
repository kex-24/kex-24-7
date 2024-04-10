# Customize Your Own Virtual Garage

For this programming task, we'll explore the same core programming concepts from the model task, such as designing classes, working with fields, methods, constructors, and encapsulation in Java. Instead of mythical creatures, you're going to create a virtual garage full of customized cars. This is a fantastic way to practice object-oriented programming while building something you can relate to.

## Deadline
Please submit this task before the next scheduled class.

## Instructions for Submission
Refer to the course instructions for the details on how to submit this assignment.

## Preparation

- Ensure you've gone through Module 2: Looking Inside Classes
- Review any relevant materials in the OLI platform

Learning Goals
The objectives for this week include:
- Creating and using Java classes
- Working with instance fields and methods
- Employing constructors for object creation
- Implementing getters and setters for data encapsulation
- Utilizing the `main` method effectively
- Understanding scope and variable shadowing

## Troubleshooting Guide
If you encounter difficulties:
1. Consult the Q&A section of the course forum.
2. Post a new question if yours hasn't been addressed yet.
3. Reach out to a helper during our scheduled lab sessions for real-time assistance.

## Assignment Overview

In your virtual garage, you will model custom cars with various attributes. Each car will be represented as an object in Java. As we move through the tasks, you'll refine your implementation, from directly manipulating object fields to using more sophisticated techniques like encapsulation.

### Exercise 1: Setting Up Your Garage

Start by creating a Java file named `Car.java`. This file will contain the `Car` class, the blueprint for your custom cars.

Define the `Car` class with the following fields (but do not assign values yet):

- `String` model
- `int` maxSpeed
- `String` color
- `boolean` isConvertible

Now, in the main method, create your first custom car object. After that, directly assign values to its fields.

### Exercise 2: Adding More Cars

Let's add two more cars to your garage. Try manually creating new car objects and setting their fields. Reflect on the limitations of doing this as your garage grows in size.

### Exercise 3: Accessorizing with Getters and Setters

To better manage your cars' attributes, convert your fields to `private` and implement getters and setters for each field. Use these methods to set and get field values.

### Exercise 4: Speedy Constructors

Writing a constructor for your Car class will streamline the process of creating new car instances. Write a constructor that allows you to specify a car's attributes when you create a new car object.

### Exercise 5: Fill Your Garage

Using your constructor, populate your garage with at least 3 distinctly configured cars.

### Exercise 6: Display Your Collection

Implement a `printInfo()` method in the Car class that neatly displays a car's attributes. Call this method for each car in your garage.

### Exercise 7: Refueling Your Cars

Finally, add a behavior to your cars. Implement a `refuel()` method that resets your car's fuel level. Simulate a scenario where one of your cars needs refueling, demonstrate the method's effectiveness in the main method.

### Exercise 8: Understanding Variable Shadowing

Review examples of variable shadowing to understand how local and global variables can interact. Specifically, explore how the `this` keyword can be used to distinguish between class fields and parameters with the same name.

## Checklist
- Did you create a `Car` class with specified fields?
- Have you implemented getter and setter methods?
- Did you write a constructor for easy car object creation?
- Are you able to add cars to your garage using the constructor?
- Can you print car information with the `printInfo()` method?
- Have you added and demonstrated a `refuel()` behavior?
- Did you review and understand variable shadowing?

## Found an Issue?

If you discover any inconsistencies or errors in this task, please report them by creating a new issue with a descriptive title. Your contributions help improve the course for everyone.
