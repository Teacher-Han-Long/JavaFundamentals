
													Map<I> 1.2
HashMap(1.2)  IdentityHashMap(1.4)  WeakHashMap(1.2)  SortedMap<I>"  HashTable
         |                                                                                        |                Properties
LinkedHM(1.4)                                                           NavigableMap<I>(1.6)

																						TreeMap(1.2)
																						
HashTable is the child of Dictionary(Abstract Class)
																						
Collection<I> - deals with individual objects
Map<I>	         - not a child interface of Collection 
					 -  if we want to represent a group of objects as
						key=>value pairs	ipAddress => domainName

Key and Value are both objects
Duplicate keys are NOT allowed
Duplicate values ARE allowed

Each key value pair is called an Entry
MAP is considered to be a COLLECTION of ENTRY OBJECTS

add(Object o)  -->  Collection / not related to Map

1. put(Object key, Object value)   -->   Map interface method
	adds an entry. Return type is Object.
	
	To add one key value pair to the Map- if the key is already present, it will 
	replace the old value with the new and the old value is returned
	If the key is unique, null is returned.
	m.put(101, "Bueller");  returns null
	m.put(102, "Frye");	  return null
	m.put(103, "Simone"); returns null
	m.put(101, "Rooney"); returns Bueller
	
	m.put() --> a single key/value pair
	m.putAll(Map m);  --> Adds a group of key->value pairs 
	
	m.get(key);
	m.remove(key) --> total key/value pair will be removed
	m.containsKey(key);
	m.containsValue(value);
	m.isEmtpy();
	m.size();          -->  number of key/value pairs
	
	Object put(Object key, Object value)
	void putAll(Map m)
	Object get(Object key)
		returns the value associated w/specified key
	Object remove(Object key)
		removes the entry associated w/specified key
	boolean containsKey(Object key)
	boolean containsValue(Object value)
	boolean isEmpty()
	int size()
	void clear()
	
	Collection views of Map - only keys, values, or entries
	1. Set keySet();              --> no duplicates
	2. Collection values();	  --> duplicates allowed
	3. Set entrySet();			  --> entry objects
	
	Map :  a group of Entry Objects (key/value pairs - an Entry)
	Entry is an inner interface in Map.   Without existing Map object,
	there is no chance of an Entry. Entry<I> is defined inside of Map<I>
	interface Map {
		
		interface Entry {
		
			// Entry specific methods- 
			//ONLY APPLICABLE ON ENTRY OBJECTS
			Object getKey();
			Object getValue();
			Object setValue(Object new); -> returns old value
		
		}
	
	}
