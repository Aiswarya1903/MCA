class Rectangle:
    def __init__(self,length,breadth):
        self.length=length
        self.breadth=breadth
        
    def area(self):
        a=self.length*self.breadth
        return a
        
    def perimeter(self):
        p=2*(self.length+self.breadth)
        return p
        
    def __gt__(self,other):
        return self.area()>other.area()
    
    
len1,bre1=map(int,input("enter length and breadth:").split())
a1=Rectangle(len1,bre1)

len2,bre2=map(int,input("enter the length and breadth:").split())
a2=Rectangle(len2,bre2)


if a1 > a2:
    print("rect 1 is greater")
    
else:
    print("rect 2 is greater")