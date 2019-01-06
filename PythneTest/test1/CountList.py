'''
Created on 06-Jan-2019

@author: bkher
'''
from html5lib.ihatexml import letter

str2 ='aabbcc'
count =0
for i in str2:
    for j in 'abcdefghijklmnopqrstuvwxyz':
        if i == j:
            count +=1
    
    print count        
    

        
