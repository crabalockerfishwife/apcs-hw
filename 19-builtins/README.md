<html>
<body>	
<h>
<b>1. What is the difference between the HashMap and HashSet (or the TreeMap and TreeSet) from
a use point of view?</b>
	</h>
	<p> 
	A Treemap has two type parameters: K (the type of keys maintained by the map), and V (the type of mapped values), while a 
Treeset has one: E (the type of elements maintained by the set). Treemap implements NavigableMap(K,V) while Treeset implements NavigableSet(E) based on a TreeMap.
	</p>
	<p>
	The key difference between the two, however, seems to be that, in the TreeMap, all Map.Entry pairs returned by methods in the class represent <i>snapshots</i> of mappings at the time they were produced, and do <i>not</i> support the Entry.setValue method.
	</p>
	<p>
	via 
		<a href="http://docs.oracle.com/javase/6/docs/api/java/util/TreeMap.html">this</a>
		<a href="http://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html">and this</a>
	</p>
		
<h><b>2. Internally, how is a HashMap implemented? Internally, how is a TreeMap implemented?<b/></h>

	<p>
	A HashMap is a hash table based implementation of the Map interface, and its implementation is affected by its initial capacity and load factor.
	</p>
	<p>	
	 A TreeMap is a Red-Black tree based NavigableMap implementation which is sorted accoridng to the natural ordering of its keys or a Comparator. 
	</p>
	<p>
	via 
		<a href="http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html">this</a>
		<a href="http://docs.oracle.com/javase/6/docs/api/java/util/TreeMap.html">and this</a>
	</p>

<h><b>3. Write code to try to do a speed comparison between HashMaps and TreeMaps. Summarize what you find in the README file.</h></b>


<h><b>4. Java has a built in Heap data structure but it's not named Heap. What is it?</h></b>

<h><b>5. Implement the running median algorithm/data structure we defined in class using the built in heap.</h></b>

</body>
</html>
