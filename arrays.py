import array

my_array = array.array('i',[0]*5)

i = 0

while(i<5):
    val = int(input("enter a val: \n"))

    my_array[i] = val

    i+=1

print(my_array)


##traversing arrays in python
