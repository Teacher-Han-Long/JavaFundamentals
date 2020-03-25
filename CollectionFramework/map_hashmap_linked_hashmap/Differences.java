HashMap                                                                 HashTable
------------------------------------------------------------------------------------

Non-synchronized methods										Synchronized
Not thread safe															Thread safe
Performance is high - no waiting								Performance relatively low
null value allowed (key and value)								null - n/a (key or value)
Version 1.2 - Not legacy											1.0 - Legacy  

Same differences as between ArrayList and Vector

How to get a synchronized version of HashMap Object? Same as ArrayList - 
	Collections.synchronized
	
HashMap m = new HashMap();
Map m1 = Collections.synchronizedMap(m);

By default, HashMap is non-sychronized, but we can get synchronized version
of HM by using this.
-m is non-synchronized
-m1 is synchronized