Before the introduction of the Collection framework in JDK 1.2, java used to rely o a variety of classes like Vector, Stack, Hashtable and arrays to store and manipulate group of objects.

Drawbacks were : 
1.Inconsistency : Each class  had a different way of managing collections, leading to confusion and a steep learning curve
2.Lack of Inter-Operability:  These classes were not designed to work together seamlessly 
3.No common interface: There was no common interface for al these classes, which meant you couldn't write generic algorithms that could operate on different types of collections.

After Java 1.2 new fixes brought :
1. Unified architecture: A consistent set of interfaces for all collections.
2. Inter-Operability: Collections can be easily interchanged and manipulated in a uniform way.
3. Reusability: Generic algorithms can be written that work with any collections
4. Efficiency: Framework provides efficient algorithms for basic operations like searching, sorting and manipulation.

Collection: The root interface for all the other collection types.
Contains mainly: 1.List(ordered,contains duplicates), 2.Set(no order, no duplicates), 3.Queue(FIFO), 4.Deque(Insertion and deletion from both the ends), 5.Map(Key,Value)