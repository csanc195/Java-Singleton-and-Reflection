# Java-Singleton-and-Reflection
Simple program that serves as proof of concept of the singleton design pattern and how it can be circled around by using Reflection
The following program shows the simple implementation of the singleton design pattern in java. It then contines to test its functionality
and verify that it holds to its promise( That only one instance of it will be available at all times and no more). 
<h3>The singleton design pattern</h3>
The <a href="https://en.wikipedia.org/wiki/Singleton_pattern"> singleton</a>  design pattern is a pattern which allows to restrict the amount of instances a certain class may have at runtime, more specifically, a singleton class
will have only one initialized instance at all times. This is ensured by some strategies such as a private constructor, a recursively delcared instance to the class and 
a public method which exposes the instance to the rest of the code. 
<h3>The Java reflection API</h3>
After the singleton is put to test, the program continues to show how to circle around the restrictions that the singleton produce and 
shows how to instantiate a new singleton object even there is one instantiated alreay by using the Java <a href="https://docs.oracle.com/javase/tutorial/reflect/">reflection</a> API


