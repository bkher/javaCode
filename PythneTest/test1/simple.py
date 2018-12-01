'''
Created on 06-Nov-2018

@author: bkher

'''
print "print those grades"

grade=[100,100,90,80,55,37,67,72]

def print_grades(grads_input):
    for n in grads_input:
        print n
print_grades(grade)


def grades_sum(scores):
    sum = 0
    for n in scores:
        sum=sum+n
    return sum
    
print grades_sum(grade)

def grades_average(grades_input):
    total=grades_sum(grade)
    return total/float(len(grades_input))

print grades_average(grade)