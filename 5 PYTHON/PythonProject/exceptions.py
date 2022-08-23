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