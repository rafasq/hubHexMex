print("welcome")
a = 100
b = 20
# syntax / parser error
# if a > b
#     print("a > b")
if a > b:
    print("a > b")

# a=100; b=10;print(a/b)
# ZeroDivisionError: division by zero
# a=100; b=0;print(a/b)
# print('executes?')
# TypeError: can only concatenate str (not "int") to str
# print("a" + 1)

fruits=['apple','banana','orange']
# IndexError: list index out of range
try:
    # print(fruits[5])
    print(fruits[2])
except:
    print('check index')
else :
    print('fruits are good for health')
finally :
    print('always gets executed')
print('executes?')

print("CUSTOM EXCEPTION")
# custom exception
class SalaryError(Exception):
    # constructor or initializer
    def __init__(self,salary):
        self.salary = salary
# test
try:
    salary = 3000
    if salary > 50000:
        raise SalaryError(salary)
except SalaryError as errorObject:
    print('A new exception occured : ', errorObject.salary)


# CREATE EXCEPTION
class MyCustomException(Exception):
    pass
# RAISE EXCEPTION
raise MyCustomException('A custom message for my custom exception')
try:
    raise MyCustomException('A custom message for my custom exception')
except MyCustomException:
    print('My custom exception was raised')

