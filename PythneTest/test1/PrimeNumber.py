'''
Created on 06-Jan-2019

@author: bkher
'''
# x= 13

x = int(input('Enter a number: '))
status =1

if x>1:
    for i in range(2,x):
        if (x%i==0):
            status =0
            break
    if (status !=0):
        print (x,'is a prime number' )
    else:
        print (x,'is not a prime number')    
            
else:
    print (x,'is not a prime number')