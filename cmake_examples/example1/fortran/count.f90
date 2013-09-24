program count

integer :: upto = 10     ! count to 10 by default
integer :: i             ! iterator
integer :: retval        ! return value stores program status
character(len=32) :: arg ! buffer for command line argument

call getarg(1, arg)      ! get argv[0] (how does this differ from c++?) 
print*,'Inside program ',arg

if (iargc() .gt. 0) then ! use first argument
	call getarg(1, arg)
	read(arg, FMT='(I5)') upto
endif

! perform my count
do i = 1,upto
	print*,i
end do

if (i .gt. 20) then 
	retval = 1
else 
	retval = 0
endif

call exit(retval)

end program count

