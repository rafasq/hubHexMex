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