# module : classes, functions and variables as a file
# def avg(n1,n2) :
#     return (n1+n2)/2
#
# def sum(n1,n2) :
#     return n1+n2
#
# class Test:
#     var = 10
#     def method(self,x):
#         print(x)
# # create object
# object = Test()
# object.method(50)
#
# user = input("enter user")
# print(user)
#
# message = "welcome"; print(message.find('l'))

s="relax"
print(s.find('l'))
list =['apple','mango']

for f in list:
    print(f)

# self.v = 10 -------------------------
class Test:
    v = 10
    def method1(self,v):
        print(self.v)
o=Test()
o.method1(20)

# ball -------------------
product = {
    "name" : "pen",
    "type" : "ball"
}
print(product["type"])

# hex.com --------------
msg="mail@hex.com"
list=msg.split("@")
print(list[1])

# 7 ----------------------
import math
v = math.floor(7.4)
print(v)

# welcome sam -------------------
v="welcome sam"
print(v[:])

# create functions using def keyword ------

# 1 2 -------------------------
for v in range(1,5):
    if v>2:
        break
    print(v)

# allows duplicates / cannot assign value to index
tup=(1,2,1)
print(tup)

# 7 ---------------
v=' abc def '
str=v.strip();
print(len(str))



