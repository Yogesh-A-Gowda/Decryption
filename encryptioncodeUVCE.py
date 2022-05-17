
class encryption:
    
   message = input("enter the encrypted code bruh, make sure everything is in smallcase only cause i dont want to complicate my code ")
   x = message.lower()
   for i in range(len(x)):
        
        a = ord(x[i])
        if(a>109):
            b = a-13
            print(chr(b),end = " ")
        elif(a<=109):
            c = (26+a)-13
            print(chr(c),end = " ")
        else :
            print(x[i])
            


    
   
            
