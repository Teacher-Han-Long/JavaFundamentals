HashTable -  Underlying dataStructure of HashMap
--------------------------------------------------
Insertion order not preserved - based on hashCode of keys

Duplicate keys not allowed
Duplicate values allowed

Hereogeneous elements allowed (keys and values)

null allowed ONCE for keys
null allowed any number of times for values

HashMap implements: Clonable, Serializable, NOT RandomAccess

HashMap : best choice if search operations are most frequent
 
1. HashMap m = new HashMap
	creates an empty HM Object default -> 16
			default fill ratio -> 0.75

2. HashMap m = new HashMap(int initialCapacity)

3. HashMap m = new HashMap(int initialCapacity, float fillRatio)

4. HashMap m = new HashMap(Map m)
	interconversion between Map Objects (any Map Object)
