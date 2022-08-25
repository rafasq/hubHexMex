class parent:
    def par_fun(self):
        print("This is parent class")
class child1(parent):
    def func1(self):
        print('This is child1 class')
class child2(parent):
    def func2(self):
        print("This is child2 class")
class child12(child1,child2):
    def func12(self):
        print("This is child12 class")

obj = child12()
obj.func12()
obj.func2()
obj.func1()
obj.par_fun()