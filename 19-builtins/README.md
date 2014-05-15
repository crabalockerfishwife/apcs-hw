1. What is the difference between the HashMap and HashSet (or the TreeMap and TreeSet) from
a use point of view?

	A Treemap has two type parameters: K (the type of keys maintained by the map), and V (the type of mapped values), while a 
Treeset has one: E (the type of elements maintained by the set). Treemap implements NavigableMap<K,V> while Treeset implements NavigableSet<E> based on a TreeMap.
	The key difference between the two, however, seems to be that, in the TreeMap, all Map.Entry pairs returned by methods in the class represent <i>snapshots</i> of mappings at the time they were produced, and do <i>not</i> support the Entry.setValue method.
	via 
		http://docs.oracle.com/javase/6/docs/api/java/util/TreeMap.html
		http://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html
		
2. Internally, how is a HashMap implemented? Internally, how is a TreeMap implemented?

	A HashMap is internally implemented 

	via 
		http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
		http://docs.oracle.com/javase/6/docs/api/java/util/TreeMap.html


3.


4
5
