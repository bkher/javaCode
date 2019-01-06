'''
Created on 06-Jan-2019

@author: bkher
'''


num = input('enter number: ')
temp = num
fact =1
if(num>1):
    while(num>0):
        fact = fact * num
        num =num-1
    print ('factorial of', temp, 'is', fact)
    
else:
    print ('enter valid number')