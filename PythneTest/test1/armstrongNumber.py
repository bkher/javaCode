'''
Created on 06-Jan-2019

@author: bkher
'''


num = int(input('enter the numer'))
temp =num
sum =0
if (num>9):
    while(num>0):
        reminder = num %10
        num = num/10
        sum =sum + reminder*reminder*reminder
    
    if(sum == temp)  :
        print (temp,'is armstrong number')
    else:
        print (temp,'is not armstring number')  

else:
    print ('enter valid number')