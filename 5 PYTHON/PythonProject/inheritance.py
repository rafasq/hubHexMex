# Single Level
class Par:
    
    def parFun(self):
        print("Par Fun")

class Chi(Par):
    
    def chiFun(self):
        print("Chi Fun")

obj = Chi()
obj.parFun()
obj.chiFun()
    
#multiple
class Dad:
    sports = "hockey"
    def engineering(self):
        print("designs great buildings")
class Mom:
    music = "guitar"
    def fashion_designing(self):
        print("makes great dresses")

class Child(Dad,Mom):
    def developer(self):
        print("writes amazing code")
    def parents(self):
        print(self.sports)
        print(self.music)

batman = Child();
print(batman.sports)
print(batman.music)
batman.engineering();
batman.fashion_designing();
batman.developer();
print("************")
batman.parents();

# multilevel
class Grand:
    sports = "golf"
    def engineering(self):
        print("designs great buildings")
class Parent(Grand):
    music = "drums"
    def fashion_designing(self):
        print("makes great dresses")

class Child(Parent):
    def developer(self):
        print("writes amazing code")
print("************")
batman = Child();
print(batman.sports)
print(batman.music)
batman.engineering();
batman.fashion_designing();
batman.developer();
print("************")

# hierarchical inheritance
class Parent():
    music = "drums"
    def fashion_designing(self):
        print("makes great dresses")

class Son(Parent):
    sports = "boxing"
    def developer(self):
        print("writes amazing code")

class Daughter(Parent):
    art = "handicrafts"
    def director(self):
        print("directs amazing movies")

print("************")
batman = Son();
print(batman.music)
print(batman.sports)
batman.fashion_designing();
batman.developer();
taylor = Daughter();
print(taylor.music)
print(taylor.art)
batman.fashion_designing();
taylor.director()
print("************")

#hybrid inheritance
class Base:
    def baseM(self):
        print("baseM")
class Der1(Base):
    def der1M(self):
        print("der1M")
class Der2(Base):
    def der2M(self):
        print("der2M")
class Der3(Der1,Der2):
    def der3M(self):
        print("der3M")

obj = Der3()
obj.baseM()
obj.der1M()
obj.der2M()
obj.der3M()

# polymorphism
print(len("Mexico"))
print(len([2,3,7,8]))
result = len('Mexico')
print(result)
# arithmetic
print(1+1)
print("1" + "1")
print("there are " + str(3) + ' roses in the garden')

# class polymorphism / 2 methods with same name but different classes
class PythonTrg:
    def __init__(self,trgId, trgName):
        self.trgId = trgId
        self.trgName = trgName
    def trgDetails(self):
        print("Python Training id ", self.trgId, " Training Name : " + self.trgName)

class JavaTrg:
    def __init__(self,trgId, trgName):
        self.trgId = trgId
        self.trgName = trgName
    def trgDetails(self):
        print("Java Training id ", self.trgId, " Training Name : " + self.trgName)
pythonTrg = PythonTrg(1,"py gaming")
javaTrg = JavaTrg(2,"java gaming")
pythonTrg.trgDetails()
javaTrg.trgDetails()

print('*******************')
class JavaTrg:
    #constructors are like methods, but they are called when creating an object
    def __init__(self,trgId, trgName):
        self.trgId = trgId
        self.trgName = trgName
    def trgDetails(self):
        print("Java Training id ", self.trgId, " Training Name : " + self.trgName)
    # def trgDetails(self,trgVenue):
    #     print("Java Training id ", self.trgId, " Training Name : " + self.trgName)
# parameterized constructor - JavaTrg(2,"java gaming")
javaTrg = JavaTrg(2,"java gaming")
javaTrg.trgDetails()
# javaTrg = JavaTrg(2,"java gaming","mexico")
# javaTrg.trgDetails()

# method overriding
class Customer:
    def det(self):
        print("cus det")
class Order(Customer):
    def det(self):
        print("ord det")
#default constructor of Customer class / Customer()
c = Customer()
c.det()
o = Order()
o.det()

# empty class in python
class A:
    pass
class B:
    pass
class C(A,B):
    pass