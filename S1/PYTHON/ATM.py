#Write a program to make an ATM system using Python OOPS concept with the following ATM requirements.
#(i) Account creation
#(ii) Check Account Details
#iii) Check Balance
#(iv) Deposit Amount
#(v) Withdraw Amount
#(vi) Exit with a transaction receipt

class Bank:
    def __init__(self,balance=0):
        self.balance=balance
        
    def Account_creation(self):
        self.name=input("enter name:")
        self.account_no=int(input("enter account_no"))
        
    def Account_details(self):
        print(self.name)
        print(self.account_no)
        
    def Balance(self):
        print(self.balance)
        
    def Deposit(self):
        amount=int(input("enter amount:"))
        if amount<0:
            print("invalid amount")
        else:
            self.balance+=amount
        print(f"deposited {amount}")
        
    def Withdraw(self):
        amount=int(input("enter amount:"))
        if amount>self.balance:
            print("insufficient balance")
        else:
            self.balance-=amount
        print(f"{amount} debitted")
        
user=Bank()
user.Account_creation()
user.Account_details()
user.Balance()
user.Deposit()
user.Withdraw()