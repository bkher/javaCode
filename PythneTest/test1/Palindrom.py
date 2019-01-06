'''
Created on 06-Jan-2019

@author: bkher
'''

num = int(input('enter  a 3 digit number :'))
temp =num
reverse =0

if (num>9):
    while(num>0):
        reminder = num % 10
        reverse = (reverse *10) +reminder
        num = num /10
    
    if (reverse==temp):
        print (reverse,'is a palindrom')
    else:
        print (reverse,'is not a palindrom')
else:
    print('enter 2 digit number')        