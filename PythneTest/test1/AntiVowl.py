'''
Created on 06-Jan-2019

@author: bkher
'''

str1= 'Hello How Are You?'
l=len(str1)
text=""
for i in str1:
    for j in 'aeiouAEIOU':
        if i == j:
            i=""
        else:
            i=i
    text= text+i

print text