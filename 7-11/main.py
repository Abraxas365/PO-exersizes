a = 1
b = 2
sum = 2

while(b < 4000000):
    tmp = a + b
    if(tmp < 4000000):
        if(tmp % 2 == 0):
            sum = sum + tmp
    a = b
    b = tmp
    
    


print(sum)