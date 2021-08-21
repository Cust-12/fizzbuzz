# -*- coding: utf-8 -*-
"""
@author: roryc
"""

for i in range(1,101) :             #prints numbers from 1 to 100
    if i % 3 == 0 and i % 5 == 0:   #if the number is divisible by 3 and 5
        print('fizzbuzz')           #print out fizzbuzz
    elif i % 3 == 0:                #if the number is divisible by 3
        print('fizz')               #print out fizz
    elif i % 5 == 0:                #if the number is divisible by 5
        print('buzz')               #print out buzz
    else:                           #else just print out the number
        print(i)
