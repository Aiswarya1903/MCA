#Create a class Publisher (name). 
# Derive a class Book from Publisher with attributes title and author. 
# Derive another  class Python from Book with attributes price and no_of_pages. 
# Write a program that displays information about a Python book. 
# Use base class constructor invocation and method overriding.

class Publisher:
    def __init__(self,name):
        self.name=name
        
    def display(self):
        print(self.name)

class Book(Publisher):
    def __init__(self,name,title,author):
        super().__init__(name)
        self.title=title
        self.author=author
        
    def display(self):
        super().display()
        print(title)
        print(author)
        
class Python(Book):
    def __init__(self,name,title,author,price,no_of_pages):
        super().__init__(name,title,author)
        self.price=price
        self.no_of_pages=no_of_pages
    
    def display(self):
        super().display()
        print(price)
        print(no_of_pages)
        
name,title,author,price,no_of_pages=input("enter name title author price and pages space separated:").split(",")
python=Python(name.strip(),title.strip(),author.strip(),int(price.strip()),int(no_of_pages.strip()))

python.display()

