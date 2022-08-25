class Parent:
    def parent_func(self):
        print("This is parent class")


class child1(Parent):
    def child1_func(self):
        print("This is Child1 class")


class child2(Parent):
    def child2_func(self):
        print("This is Child2 class")


obj = child1()
obj1 = child2()

obj.parent_func()
obj.child1_func()
obj1.parent_func()
obj1.child2_func()