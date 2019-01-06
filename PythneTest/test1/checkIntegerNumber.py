'''
Created on 06-Jan-2019

@author: bkher
'''

num = input('Enter number: ')

absoluteCount= abs(num)
typeCont =type(num)
roundCount = round(num)

if typeCont and absoluteCount - roundCount == 0:
    print (num, 'is int')
else:
    print (num,'is not int')
