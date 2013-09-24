PROJECT (example3 NONE)

# Setup output paths so jar and bins go into ./bin
# Note this is inheritable so it applies to subdirs
SET(LIBRARY_OUTPUT_PATH 
	${PROJECT_BINARY_DIR}/bin
	CACHE PATH
	"Single directory for all libraries.")

SET(EXECUTABLE_OUTPUT_PATH 
	${PROJECT_BINARY_DIR}/bin
	CACHE PATH
	"Single directory for all executables.")

# keep these hidden if users call ccmake
MARK_AS_ADVANCED ( LIBRARY_OUTPUT_PATH EXECUTABLE_OUTPUT_PATH )

#ADD_SUBDIRECTORY(cxx)
#ADD_SUBDIRECTORY(fortran)
#ADD_SUBDIRECTORY(java)

SUBDIRS(
	cxx
	fortran
	java
)

# Search these folders for cross project dependencies
INCLUDE_DIRECTORIES(
	cxx
	fortran
	java
)

# Need this on to get child tests enabled
ENABLE_TESTING()
