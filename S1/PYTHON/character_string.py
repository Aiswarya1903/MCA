#Write a program to get a string as input and print the characters in the string in different lines. 
# Number of lines required to print the characters must get from user. 
# The number of characters in each line must be same.

import math

line=input("enter a string")
no=int(input("enter the required number:"))
line_len=len(line)
char=math.ceil(line_len/no)

for i in range(no):
    start=i*char
    end=start+char
    print(line[start:end])
