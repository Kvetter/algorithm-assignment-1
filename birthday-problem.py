#!/usr/bin/python

import sys
import random


def repeatedBirthday(number):
    birthdays = {}
    count = 0
    run = True
    while run:
        ranNum = random.randint(0, int(number) - 1)
        count += 1
        if ranNum in birthdays:
            run = False
        else:
            birthdays[ranNum] = 1

    return count

def avg():
    sum = 0
    for x in range(0, 9999):
        sum += repeatedBirthday(sys.argv[1])
    print (sum/10000)

avg()
