PROJECT(countTo10 CXX) 

ENABLE_TESTING()

ADD_EXECUTABLE(count_cxx count.cxx)

ADD_TEST(test0 ${EXEC_DIR}/count_cxx 0)
ADD_TEST(test-1 count_cxx -1)
ADD_TEST(test2 count_cxx 2)
ADD_TEST(testNoArgs count_cxx)
ADD_TEST(test20 count_cxx 20)
