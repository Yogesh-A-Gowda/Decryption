message = input("enter the encrypted code bruh, make sure everything is in smallcase only cause i dont want to complicate my code ")
x = message.lower()
for i in range(len(x)):

        if(ord(x[i])>109):
            b = ord(x[i])-13
            print(chr(b),end = " ")
        elif(ord(x[i]) <97 or ord(x[i])>122):
             print(x[i] ,end = " ")
        elif(ord(x[i])<=109):
            c = (26+ord(x[i]))-13
            print(chr(c),end = " ")
        elif X[i] == ",":
            print(',')
