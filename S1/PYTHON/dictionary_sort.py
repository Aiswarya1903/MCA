'''question:1.read number of states from user.create a dictionary with state as keys and length of state as values.
2.sort the dictionary by length.
3.write the dictionary into a csv file and read it'''

n=int(input("enter the number of states:"))
states=[]
for i in range(n):
    state=input("enter state:")
    states.append(state)

#for each state in states it takes the state as key and length as value
dict1 = {state: len(state) for state in states}
print(dict1)
states.sort()
dict2 = {state: len(state) for state in states}
print(dict2)

values=list(dict1.values())
values.sort()

dict_sorted={}

for val in values:
    for state,length in dict1.items():
        if val==length:
            dict_sorted[state]=length
print(dict_sorted)


