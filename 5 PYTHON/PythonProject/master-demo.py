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