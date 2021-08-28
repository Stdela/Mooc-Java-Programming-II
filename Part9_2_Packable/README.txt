Packables
Moving houses requires packing all your belongings into boxes. Let's imitate that with a program. The program will have boxes, and items to pack into those boxes.

Box
Make a class called Box. Items implementing the Packable interface can be packed into a box. The Box constructor takes the maximum capacity of the box in kilograms as a parameter. 
The combined weight of all items in a box cannot be more than the maximum capacity of the box.

Box weight
If you made an class variable double weight in the Box class, replace it with a method which calculates the weight of the box.

A Box is packable too!
Implementing the Packable Interface requires a class to have the method double weight(). We just added this method to the Box class. This means we can make the Box packable as well!
Boxes are objects, which can contain objects implementing the packable Interface. Boxes implement this Interface as well. So a box can contain other boxes!
Try this out. Make some boxes containing some items, and add some smaller boxes to a bigger box. 
