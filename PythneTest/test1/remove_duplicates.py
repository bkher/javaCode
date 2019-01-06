'''
Created on 06-Jan-2019

@author: bkher
'''

str3 ='aabbc'
str4 =""
count =0
for i in str3:
    for j in 'abcdefghi':
        if i == j:
            count +=1
            if count > 1:
                i=" "
        else:
            str4 + i

print str4