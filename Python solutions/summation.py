# Write a program that finds the summation of every number from 1 to num. The number will always
# be a positive integer grater than 0. Your function only needs to return the result.


def summation(num):
    result = 0
    for i in range(0, num+1):
        result += i
    return result