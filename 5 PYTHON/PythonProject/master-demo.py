# variable scopes

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

import sys
print(sys.version)

# FUNCTIONS
def fun() :
    print("Fun with python functions.....")
fun()
print('**********')
def fun(lang) :
    """Fun function which accepts lang as param"""
    print("Fun with " + lang + " functions.....")
fun("Java")
fun("JavaScript")
fun("Python")

# keyword arguments
def fun(lang1, lang2, lang3) :
    print("Lang 1 : " + lang1)
    print("Lang 2 : " + lang2)
    print("Lang 3 : " + lang3)
fun(lang2="java", lang1='sql', lang3='python')

# non-keyword arguments
def fun(*argv) :
    print(argv)
    for arg in argv:
        print(arg)
fun("java", 'sql', 'python')

def fun(learner, *subjects) :
    print(learner)
    for subject in subjects:
        print(subject)
fun("James Bond", "java", 'sql', 'python')

# keyword arguments
print("keyword arguments")
def fun(**kwargs) :
    print(kwargs)
    for key,value in kwargs.items():
        print("%s = %s" % (key,value))
fun(lang2="java", lang1='sql', lang3='python')

#modules : contains classes, functions and vairables.
import Cal
print(Cal.avg(10,20))
print(Cal.sum(10,20))

# import names directly
from Cal import avg, sum
# print calls avg
print(avg(10,20))
print(sum(10,20))

# class / object
class Test:
    var = 10
# create object
object = Test()
print(object.var)

# cons
class Session:
    def __init__(self, sub, top):
        self.sub = sub;
        self.top = top;
s1 = Session("Python","classes / objects")
print(s1.sub)
print(s1.top)

class Session:
    def __init__(self, sub, top):
        self.subj = sub;
        self.topi = top;
s1 = Session("Python 1"," 1 classes / objects")
print(s1.subj)
print(s1.topi)

# methods
class Session:
    def __init__(self, sub, top):
        self.subj = sub;
        self.topi = top;
    def disp(self):
        print(" Subject is " + self.subj + " topic is " + self.topi)
s1 = Session("Python "," classes / objects")
print(s1.subj)
print(s1.topi)
s1.disp();

print("self renamed")
class Session:
    def __init__(Agripino, sub, top):
        Agripino.subj = sub;
        Agripino.topi = top;
    def disp(pikachu):
        print(" Subject is " + pikachu.subj + " topic is " + pikachu.topi)
s1 = Session("Python "," classes / objects")
print(s1.subj)
print(s1.topi)
s1.disp();

def avg1(n1,n2) :
    result = (n1+n2)/2
    print(result)
    return result

resultFromAvg1 = avg1(10,30)
print(resultFromAvg1)


# Access Specifiers
class Employee:
    # constructor
    def __init__(self,name, age):
        # public data members
        self.name = name
        self.age = age

        # public member function
    def display(self):
    #     access public data members
        print(self.name + " " + str(self.age))

#        create object
emp = Employee("sam",20)
# access public data members
print(emp.name)
print(emp.age)
# access public member function
emp.display()


# protected
class Employee:
    # constructor
    def __init__(self,name, age):
        # protected data members
        self._name = name
        self._age = age

        # protected member function
    def _display(self):
        print("Base : " + self._name + " " + str(self._age))

class FullTimeEmployee(Employee):
    def __init__(self,name, age):
        Employee.__init__(self,name,age)

    def displayD(self):
    #     access protected data members
        print("From Base : " + self._name + " " + str(self._age))
    # access protected member function
        self._display()

#        create object
emp = FullTimeEmployee("samuel",200)
# access public data members
emp.displayD()


# private access specifier
class Employee:
    # constructor
    def __init__(self,name, age):
        # public data members
        self.__name = name
        self.__age = age

        # public member function
    def __display(self):
    #     access public data members
        print(self.__name + " " + str(self.__age))

    def accessPrivate(self):
    #     access protected data members
        print("Private : " + self.__name + " " + str(self.__age))
    # access protected member function
        self.__display()
#        create object
emp = Employee("sams",250)
# access public data members
# print(emp.__name)
# print(emp.  __age)
# access public member function
# emp.__display()
emp.accessPrivate();