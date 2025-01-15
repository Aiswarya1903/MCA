file1=open("sample.txt",'r')
list1=file1.readlines()
list1=[i.strip() for i in list1] #list compre right-<

file1.close()
for i in range(0, len(list1), 2):
    print(list1[i])
    
file2=open("odd.txt","w")
for i in range(0,len(list1),2):
    file2.write(list1[i]+"\n")
    #or file2.write("\n")