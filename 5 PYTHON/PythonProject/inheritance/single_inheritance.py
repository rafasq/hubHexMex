class Parent:
    i = 10
    def parent_function(self):
        print("This is Parent class")

class Child(Parent):
    # i = 20
    def child_function(self):
        print("This is Child class")

temp1=Parent()
temp2=Child()
temp1.parent_function()
temp2.parent_function()
temp2.child_function()
print(temp1.i)
print(temp2.i)