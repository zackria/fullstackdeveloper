/**
** Shallow copy - The shallow copy only
** creates a new reference and points to the same object.
** Example - For Shallow copy, we can do this by -
** Rectangle obj2 = obj1;
**
**
** Deep Copy - In a deep copy, we create a new object
** and copy the old object value to the new object. Example -
** Rectangle obj3 = new Rectangle();
** Obj3.length = obj1.length;
** Obj3.breadth = obj1.breadth;
**
**/
class Rectangle{
     int length = 5;
     int breadth = 3;
}
