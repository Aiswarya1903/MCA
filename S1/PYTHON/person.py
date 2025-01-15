class Person:
    def __init__(self,name,code):
        self.name=name
        self.code=code
        
    def display(self):
        print(self.name)
        print(self.code)
        
class Account(Person):
    def __init__(self,name,code,pay):
        Person.__init__(self,name,code)
        self.pay=pay
        
    def display(self):
         Person.display(self)
         print(self.pay)
        
class Admin(Person):
    def __init__(self,name,code,experience):
        Person.__init__(self,name,code)
        self.experience=experience
    
    def display(self):
        Person.display(self)
        print(self.experience)
        
class Employee(Admin,Account):
    def __init__(self,name,code,pay,experience):
        Admin.__init__(self, name,code,experience)
        Account.__init__(self, name, code, pay)
        
    def display(self):
        print(self.name)
        print(self.code)
        print(self.pay)
        print(self.experience)
    

obj=Employee('aishu',103,60000,5)
obj.display()