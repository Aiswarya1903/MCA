#sample lab question
'''
1.read number of states from user.create a dictionary with state as keys and length of state as values.
2.sort the dictionary by length.
3.write the dictionary into a csv file and read it'''

import csv

list1=input("enter space separated words").split()
dict1={word:len(word) for word in list1}

def dict_sort(dict1):
    dict2=dict(sorted(dict1.items(),key=lambda items:items[1]))
    return dict2

def write_csv(dict2):
    with open("states.csv",'w') as file:
        for state,length in dict2.items():
            file.write(",".join([state,str(length)]))
            file.write("\n")
            
def read_csv():
    with open("states.csv",'r') as file:
        lines=file.readlines()
        lines=[line.strip() for line in lines]
        for line in lines:
            print(line)

sorted=dict_sort(dict1)
write_csv(sorted)
read_csv()


