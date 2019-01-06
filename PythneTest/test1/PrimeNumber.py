'''
Created on 06-Jan-2019

@author: bkher
'''
# x= 13

x = int(input('Enter a number: '))

if x>1:
    for i in range(2,x):
        if (x%i==0):
            print (x, "is not prime number")
            break
        else:
            print (x, "is prime number")
        
    
else:
    print (x,'is not a prime number')