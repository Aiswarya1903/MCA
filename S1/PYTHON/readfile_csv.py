#1. Write a Python program to read a file line by line and store it into a list..

import csv

with open("sample.txt",'r') as file1:
    csv_reader=file1.readlines()

    csv_reader=[i.strip() for i in csv_reader]
    for i in csv_reader:
        print(i)
        