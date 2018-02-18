#!/usr/bin/python

import sys
import random


def repeatedAllBirthdays(number):
    birthdays = {}
    count = 0
    run = True
    while run:
        ranNum = random.randint(0, int(number) - 1)
        count += 1
        if len(birthdays) >= int(number) :
            run = False
        else:
            birthdays[ranNum] = 1
    return count

def avg():
    sum = 0
    for x in range(0, 9999):
        sum += repeatedAllBirthdays(sys.argv[1])
    print (sum/10000)

avg()
