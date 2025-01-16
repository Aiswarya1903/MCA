#sample lab question

class location:
    def __init__(self,row,column):
        self.row=row
        self.column=column
        self.matrix=self.read_values()
        
    def read_values(self):
        matrix=[]
        for i in range(self.row):
            rows=[]
            for j in range(self.column):
                val=int(input(f"enter values at [{i}][{j}]: "))
                rows.append(val)
            matrix.append(rows)
        return matrix
    
    def max_value(self):
        max=self.matrix[0][0]
        for i in range(self.row):
            for j in range(self.column):
                if self.matrix[i][j] > max:
                    max=self.matrix[i][j]
                    loc=(i,j)
                    
        print(f"the largest digit is {max}")
        print(f"the index is {loc}")
        
a,b=map(int,input("enter rows and columns:").split())
obj=location(a,b)
obj.max_value()
        
