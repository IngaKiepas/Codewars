# Write a function which calculates the average of the numbers in a given list.
# Note: Empty arrays should return 0!

def find_average(numbers):
    sum = 0
    for number in numbers:
        sum += number
    if len(numbers) == 0:
        return 0
    else:
        result = sum / len(numbers)
        return result