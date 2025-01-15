#Accept a list of words and return length of longest word

list1=input("enter words comma separated:").split(",")

list1.sort(key=len)
print(list1[-1], len(list1[-1]))


'''
length=[]
for i in list1:
    a=len(i)
    length.append(a)
print(max(length))
'''


        