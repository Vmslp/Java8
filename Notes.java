public class Notes {
// ArrayList AND LinkedList
	
	// ArrayList  can store elements in contigeous memory location.
	// Arraylist is for retrieval operations.  
	
	// LinkedList can store elements based on Nodes 
    // LinkedList is for insertion and deletion operations 
	
	
	
	
//internal working of HASHMAP
	
	//first when we create a object like map<Integer,String> list = new HashMap<Integer,String>
	//then internally 16 digit bucket will be created each bucket will be act like a linkedList which contains nodes
	// node -> key , value, hash , next
	// based upon the object it will be stored based on hashCode, and placed on Index value.
	
	
	
	//SELECT MAX(SALARY)
	//FROM Employee 
	//WHERE SALARY < (SELECT MAX(SALARY) 
	//                FROM Employee);   
	
	
	
//HASHMAP  &  HASHTABLE
	//Both HashMap and HashTable can store the value in key-value pair.
	
	//HashMap
	//- HashMap allows one null key and multiple null values.
	//- HashMap is not synchronized, it is not thread-safe. 
	//- Multiple threads can access it simultaneously.

	
	//Hashtable
	//- Hashtable does not allow any null key or value.
	//- Hashtable is synchronized,it is thread-safe, 
	//- Multiple threads cannot access it simultaneously
	
	
	// ConcurrentHashMap
	//- it is thread SAFE
	//- multiple threads can access it simultaniously
	
	
	
//STRINGBUFFER & STRINGBUILDER
	//StringBuffer
    //-StringBuffer is synchronized it is thread-safe. 
	//- It means two threads can not call the methods of StringBuffer simultaneously.
	
	//StringBuilder
    //- StringBuilder is non-synchronized it is not thread-safe. 
	//- It means two threads can call the methods of StringBuilder simultaneously.	
	
	
	
//Path Variable and RequestParam	
	//@RequestParam and @PathVariable can both be used to extract values from the request URL
	
	//@RequestParams extract values from the query string
	// http://localhost:8080/spring-mvc-basics/foos?id=abc
	//	----
	//	ID: abc
	
	//@PathVariables extract values from the URI path
	// http://localhost:8080/spring-mvc-basics/foos/abc
	//	----
	//	ID: abc
	
//	COMPARABLE INTERFACES:
//		Purpose: Defines the natural ordering of objects.
//		Usage: Suitable when you want a single way to compare objects.
//		Provides a single sorting sequence.
//
//  COMPARATOR INTERFACES:
//		Purpose: Defines custom ordering logic.
//		Usage: Suitable when you need multiple ways to compare objects
//		Provides multiple sorting sequences. 	
	
	
//ResponseEntity and ResponseBody	
	
	// @ResponseBody - annotation in Spring Boot is used for binding a return value from a method 
	//  to a web response body.
	
	// @ResponseEntity - annotation represents the whole of the response including the message body,
	//   response header, and the status code. 
	

	
	
	
//@controller and @component
	//@controller - It is also a stereotype for the presentation layer (spring-MVC).
	// to mark a class as a web request handler.
	
	//@component - @Component is a class-level annotation. It is used to denote a class as a Component
	// where beans can be managed by a spring container.
	   
	
	
	
	
//How to Create a Spring Bean
	//Creating Bean Inside an XML Configuration File (beans.xml)
	//Using @Component Annotation
	//Using @Bean Annotation
	
//Bean scopes:
//	Singleton: Only one instance will be created and the same object 
//	               will be shared for each request made for that bean.
//	Prototype: A new instance will be created every time a request is made for that bean.
//	Request: A new instance will be created  every time an HTTP request is made for that bean.
//	Session: Scopes a single bean definition to the lifecycle of an HTTP Session.

	
	
	
//@Autowire
    //Autowiring in the Spring framework can inject dependencies automatically
	// byName , byType , constructor.
	

	

// FUNCTIONAL-INTERFACE
	
//CONSUMER
// It accepts only one argument, but it returns nathing.

//PREDICATE
// It accepts argument and  generates a boolean value.
	
//FUNCTION
// It accepts argument and returns a value after the required processing.

//SUPPLIER
// It does not accepts any argument,but it is returning output.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
