# variable scopes
# 1. local scope
def f():
    # exists only withing fun
    v=False

#     NameError: name 'v' is not defined
# print(v)

for i in range(1,11):
    print(i)
# loop block does not create local scope
print(i)

is_python_amazing = True
if is_python_amazing:
    message="Python is super cool!"

print(message)
print(type(message))

result=10/5;
print(result)
print(type(result))

print(2**3)
print(7%2)
print(divmod(10,3))

# slicing
v1="World is Good"
print(v1[:5])
print(v1[9:])
print(v1[:-3])
print(v1[-3:])
# reversing
vr1= v1[::-1]
print(vr1)

# intersect
s1 = {'red','green','blue'}
s2 = {"orange",'apple', 'green'}
s3 = s1.intersection(s2)
print(s3)
print("difference")
print(s1.difference(s2))
print(s2.difference(s1))
print('union')
print(s1.union(s2))

l1 = ['red','green','blue']
l2 = ["orange",'apple', 'green']
setFromList = set(l1)
print(setFromList)

l3 = list(set(l1) & set(l2))
print(l3)

n = -10
# ternary operator
result = 'positive' if n > 0 else 'negative'
print(result)

print(len('welcome'))

message = "Today is  {day} and we are learning Python".format(day="Thursday")
print(message)

message = "Today is  {day} and we are learning {language}".format(day="Thursday", language ='Python')
print(message)

message = "Today is  {0} and we are learning {1}".format("Friday",'PyCharm')
print(message)

message = "{1} was learnt on {0}".format("Friday",'PyCharm')
print(message)

num = 20;
if num > 10:
    print("{} is greater than 10".format(num))

if num%2 == 0:
    print("Even")
    if num > 10:
        print("{} is greater than 10".format(num))
else:
    print("Odd")

color = "yellow"
if color == 'green':
    print("leaves")
elif color == 'red':
    print("roses")
elif color == 'blue':
    print('sky')
else:
    print ('a new color')

foodItems = ['pizza', 'coke', 'apples']
for foodItem in foodItems:
    print(foodItem, len(foodItem))

# break / continue

message = "welcome to mexico! have a great ... time!"
for alphabet in message:
    # print(alphabet)
    if alphabet == '.' or alphabet =='!':
        break
        # print(alphabet)
    else:
        print(alphabet, end='')

# print(); print("exited the loop")
print("\nexited the loop\n")

message = "welcome to mexico!!! have a great ... time!"
for alphabet in message:
    # print(alphabet)
    if alphabet == '.' or alphabet =='!':
        continue
    else:
        print(alphabet, end='')
        # print(alphabet)
print("\texited the loop")

print("Saul's computer")
print('Saul\'s computer')

#  match ... case
color = 'black'
print(color)
match color:
    case 'red':
        print('roses are red')
    case 'green':
        print('chillies are green')
    case 'yellow':
        print('sun flower\'s are yellow')
    case _:
        print("sorry, we don't have this color item....")

# math module
import math
result = math.floor(1.7)
print(result)
import os
print(os.name)
import platform
print(platform.uname())
import random
print(random.random())
import re
pattern = re.compile("o")
print(pattern.match("orange"))
print(pattern.match("orange",2))
print(pattern.match("orangeo",6))
