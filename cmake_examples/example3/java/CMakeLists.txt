PROJECT(countTo10 Java) # Java is case sensitive (ACHTUNG!!!) 

# This is the only way to get java into the parent project: 
FIND_PACKAGE(Java)

# Notice the change from ADD_EXECUTABLE to ADD_LIBRARY (why?)
ADD_LIBRARY(count_java Count.java) 

IF(NOT EXECUTABLE_OUTPUT_PATH) 

	SET(EXECUTABLE_OUTPUT_PATH ".")

ENDIF(NOT EXECUTABLE_OUTPUT_PATH)
	

CONFIGURE_FILE(${PROJECT_SOURCE_DIR}/ExecuteJava.sh.in ${EXECUTABLE_OUTPUT_PATH}/executeJava.sh)

INCLUDE(CMakeTests.txt)
