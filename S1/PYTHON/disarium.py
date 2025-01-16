#check whether a number is disarium or not(sum of the power according to their position is equal to thhe number)

num=int(input("enter number:"))
num1=str(num)
l=num1.__len__()
n=num
s=0
for i in range(l,0,-1):
    rem=n%10
    n=n//10
    rem=rem**i
    s=s+rem
if(s==num):
    print("Disarium")
else:
    print("Not Disarium")