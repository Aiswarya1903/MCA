# Create Rectangle class with attributes length and breadth and methods to find area and perimeter. Compare two Rectangle objects by their area.

class Rectangle:
    def __init__(self,length,breadth):
        self.length=length
        self.breadth=breadth
        
    def area(self):
        a=self.length * self.breadth
        return a
    
    def perimeter(self):
        p=2*(self.length + self.breadth)
        return p
    
    
    
rect1=Rectangle(5,4)
rect2=Rectangle(6,3)
a1 = rect1.area()
a2= rect2.area()

if a1>a2:
    print("rectangle 1 has greater area")
    
else:
    print("recctangle 2 has greater area")