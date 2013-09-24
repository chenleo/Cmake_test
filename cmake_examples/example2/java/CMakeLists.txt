PROJECT(countTo10 Java) # Java is case sensitive (ACHTUNG!!!) 

ENABLE_TESTING()

# Notice the change from ADD_EXECUTABLE to ADD_LIBRARY (why?)
ADD_LIBRARY(count_java Count.java) 

# Notice our problem with java and testing a library: 
ADD_TEST(test0 ExecuteJava.sh Count 0)
ADD_TEST(test-1 ExecuteJava.sh Count -1)
ADD_TEST(test2 ExecuteJava.sh Count 2)
ADD_TEST(testNoArgs ExecuteJava.sh Count)
ADD_TEST(test20 ExecuteJava.sh Count 20)
