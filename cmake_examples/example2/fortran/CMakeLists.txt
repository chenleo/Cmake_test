PROJECT(countTo10 Fortran) # Fortran is case sensitive (ACHTUNG!!!) 

ENABLE_TESTING()

ADD_EXECUTABLE(count_fortran count.f90) 

ADD_TEST(test0 ${EXEC_DIR}/count_fortran 0)
ADD_TEST(test-1 count_fortran -1)
ADD_TEST(test2 count_fortran 2)
ADD_TEST(testNoArgs count_fortran)
ADD_TEST(test20 count_fortran 20)
