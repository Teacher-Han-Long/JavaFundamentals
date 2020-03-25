
Never hardcode anything that changes frequently, into the Java program
Configure it into a properties file

What has to happen to reflect new changes in the program?
1. Compile
2. Rebuild
3. Redeploy
4. Restart Server
maybe 2-3 hours- big impact on the client
THE MOST VALUABLE CONCEPT IN COLLECTION
W/OUT PROPERTIES FILE, NO JAVA PROJECT
Anything that changes regularly should be kept in a properties file
--------------------Read the data from properties file into java program-
asc.properties - (need not be .properties - .txt, etc OK
usname: Bob
pwd: tiger123

Use Properties Object to hold properties coming from Propeties file.
Load the Properties Object, and from there we can read and use it in the 
Java program when needed.
================================================

How to create a Properties Object?

HashMap m = new HashMap();
-In normal Maps, key and value can be any type

Properties p = new Properties();
-both key and value must be Strings

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

Methods:
-------------

1. String getProperty(String pName)

2. String setProperty(String pName, pValue)
	-like put (if key is there, replaces old with new, returns old

3. Enumeration propertyNames()
                                        ========================
4. void load(InputStream is)
	-to load properties from properties file into java porperties object
	
5. void store(OutputStream os, String comment)
	-to store properties from java properties object into properties file