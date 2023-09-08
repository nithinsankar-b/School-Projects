from colored import fg
import random
import copy

print("Minesweeper")

#Printing the board
def board():
    print("  0 1 2 3 4 5 6 7")
    for i in range(8):
        print(i,end=" ")
        for j in range(8):
            if(b2[i][j]==1):
                color=fg('blue')
                print(color+str(b2[i][j]),end=" ")
            elif(b2[i][j]==2):
                color=fg('green')
                print(color+str(b2[i][j]),end=" ")
            elif(b2[i][j]==3):
                color=fg('yellow')
                print(color+str(b2[i][j]),end=" ")
            elif(b2[i][j]==4 or b2[i][j]==5 or b2[i][j]==6 or b2[i][j]==7 or b2[i][j]==8):
                color=fg('red')
                print(color+str(b2[i][j]),end=" ")
            elif(b2[i][j]=='F'):
                color=fg('red')
                print(color+u"\U00002690",end=" ")
            elif(b2[i][j]=='o'):
                color=fg('black')
                #print(color+str(b2[i][j]),end=" ")
                print(color+u"\U0001F4A3",end=" ")
            else:
                color=fg('white')
                print(color+str(b2[i][j]),end=" ")
        color=fg('white')
        print(color)
    print("Flags:",cnt,"/",n1)

#Initialization
b1=[]
cnt=0
for i in range(8):
    x=[]
    for j in range(8):
        x.append("_") 
    b1.append(x)
b2=copy.deepcopy(b1)

n1=int(input("Enter the number of bombs: "))

n2=n1
while(n2!=0):
    x=random.randint(0,7)
    y=random.randint(0,7)
    if(b1[x][y]=="_"):
        b1[x][y]="o"
        n2-=1
    else:
        continue
        
f=0        
while True:
    if(f==0):
        board()
        r=int(input("Enter the row: "))
        c=int(input("Enter the column: "))
        flag=0
        if(b1[r][c]=="o"):
            for i in range(8):
                for j in range(8):
                    if(b1[i][j]=="_"):
                        b1[i][j]="o"
                        flag=1
                        break
                if(flag==1):
                    break
            b1[r][c]='_'
        for i in range(8):
            for j in range(8):
                count=0
                if(b1[i][j]=='_'):
                    if(i!=0):
                        if(b1[i-1][j]=="o"):
                            count+=1
                    if(i!=7):
                        if(b1[i+1][j]=="o"):
                            count+=1
                    if(j!=0):
                        if(b1[i][j-1]=="o"):
                            count+=1
                    if(j!=7):
                        if(b1[i][j+1]=="o"):
                            count+=1
                    if(i!=0 and j!=0):
                        if(b1[i-1][j-1]=="o"):
                            count+=1
                    if(i!=7 and j!=0):
                        if(b1[i+1][j-1]=="o"):
                           count+=1
                    if(i!=7 and j!=7):
                        if(b1[i+1][j+1]=="o"):
                            count+=1
                    if(i!=0 and j!=7):
                        if(b1[i-1][j+1]=="o"):
                            count+=1
                    b1[i][j]=count
        b2[r][c]=b1[r][c]
        for k in range(r+1,8):
            if(b1[k][c]!="o"):
                b2[k][c]=b1[k][c]
            else:
                break
        for k in range(r-1,-1,-1):
            if(b1[k][c]!="o"):
                b2[k][c]=b1[k][c]
            else:
                break
        for k in range(c+1,8):
            if(b1[r][k]!="o"):
                b2[r][k]=b1[r][k]
            else:
                break
        for k in range(c-1,-1,-1):
            if(b1[r][k]!="o"):
                b2[r][k]=b1[r][k]
            else:
                break
        if(r!=7 and c!=7):
            if(b1[r+1][c+1]==0):
                b2[r+1][c+1]=b1[r+1][c+1]
        if(r!=0 and c!=7):
            if(b1[r-1][c+1]==0):
                b2[r-1][c+1]=b1[r-1][c+1]
        if(r!=7 and c!=0):
            if(b1[r+1][c-1]==0):
                b2[r+1][c-1]=b1[r+1][c-1]
        if(r!=0 and c!=0):
            if(b1[r-1][c-1]==0):
                b2[r-1][c-1]=b1[r-1][c-1]
        f+=1
        
        while(True):
                fl=0
                for i in range(8):
                    for j in range(8):
                        if(b2[i][j]==0):
                           if(i!=7):
                               if(b2[i+1][j]=='_'):
                                   b2[i+1][j]=b1[i+1][j]
                                   fl+=1
                           if(i!=0):
                               if(b2[i-1][j]=='_'):
                                   b2[i-1][j]=b1[i-1][j]
                                   fl+=1
                           if(j!=7):
                               if(b2[i][j+1]=='_'):
                                   b2[i][j+1]=b1[i][j+1]
                                   fl+=1
                           if(j!=0):
                               if(b2[i][j-1]=='_'):
                                   b2[i][j-1]=b1[i][j-1]
                                   fl+=1
                           if(i!=7 and j!=7):
                               if(b2[i+1][j+1]=='_'):
                                   b2[i+1][j+1]=b1[i+1][j+1]
                                   fl+=1
                           if(i!=0 and j!=0):
                               if(b2[i-1][j-1]=='_'):
                                   b2[i-1][j-1]=b1[i-1][j-1]
                                   fl+=1
                           if(i!=0 and j!=7):
                               if(b2[i-1][j+1]=='_'):
                                   b2[i-1][j+1]=b1[i-1][j+1]
                                   fl+=1
                           if(i!=7 and j!=0):
                               if(b2[i+1][j-1]=='_'):
                                   b2[i+1][j-1]=b1[i+1][j-1]
                                   fl+=1
                if(fl==0):
                    break
        
    else:
        board()
        
        while(True):
            a=input("Do you want to add a flag(f), remove a flag(r) or continue(c)? ")
            if(a=='f'):
                r1=int(input("Enter Row: "))
                c1=int(input("Enter Column: "))
                if(b2[r1][c1]=='_'):
                    b2[r1][c1]='F'
                    cnt+=1
                    board()
            elif(a=='r'):
                r1=int(input("Enter Row: "))
                c1=int(input("Enter Column: "))
                if(b2[r1][c1]=='F'):
                    cnt-=1
                    b2[r1][c1]='_'
            elif(a=='c'):
                break
            elif(a=='q'):
                exit()
               
                
        count2=0
        for i in range(8):
            for j in range(8):
                if(b2[i][j]=='_'):
                    count2+=1
        if(count2==0):
            break
            
        r=int(input("Enter the row: "))
        c=int(input("Enter the column: "))
        if(b1[r][c]==0):
            for k in range(r+1,8):
                if(b1[k][c]==0):
                    b2[k][c]=b1[k][c]
                else:
                    break
            for k in range(r-1,-1,-1):
                if(b1[k][c]==0):
                    b2[k][c]=b1[k][c]
                else:
                    break
            for k in range(c+1,8):
                if(b1[r][k]==0):
                    b2[r][k]=b1[r][k]
                else:
                    break
            for k in range(c-1,-1,-1):
                if(b1[r][k]==0):
                    b2[r][k]=b1[r][k]
                else:
                    break
                    
            if(r!=7 and c!=7):
                if(b1[r+1][c+1]==0):
                    b2[r+1][c+1]=b1[r+1][c+1]
            if(r!=0 and c!=7):
                if(b1[r-1][c+1]==0):
                    b2[r-1][c+1]=b1[r-1][c+1]
            if(r!=7 and c!=0):
                if(b1[r+1][c-1]==0):
                    b2[r+1][c-1]=b1[r+1][c-1]
            if(r!=0 and c!=0):
                if(b1[r-1][c-1]==0):
                    b2[r-1][c-1]=b1[r-1][c-1]
            
                
        b2[r][c]=b1[r][c]
        
        while(True):
                fl=0
                for i in range(8):
                    for j in range(8):
                        if(b2[i][j]==0):
                           if(i!=7):
                               if(b2[i+1][j]=='_'):
                                   b2[i+1][j]=b1[i+1][j]
                                   fl+=1
                           if(i!=0):
                               if(b2[i-1][j]=='_'):
                                   b2[i-1][j]=b1[i-1][j]
                                   fl+=1
                           if(j!=7):
                               if(b2[i][j+1]=='_'):
                                   b2[i][j+1]=b1[i][j+1]
                                   fl+=1
                           if(j!=0):
                               if(b2[i][j-1]=='_'):
                                   b2[i][j-1]=b1[i][j-1]
                                   fl+=1
                           if(i!=7 and j!=7):
                               if(b2[i+1][j+1]=='_'):
                                   b2[i+1][j+1]=b1[i+1][j+1]
                                   fl+=1
                           if(i!=0 and j!=0):
                               if(b2[i-1][j-1]=='_'):
                                   b2[i-1][j-1]=b1[i-1][j-1]
                                   fl+=1
                           if(i!=0 and j!=7):
                               if(b2[i-1][j+1]=='_'):
                                   b2[i-1][j+1]=b1[i-1][j+1]
                                   fl+=1
                           if(i!=7 and j!=0):
                               if(b2[i+1][j-1]=='_'):
                                   b2[i+1][j-1]=b1[i+1][j-1]
                                   fl+=1
                if(fl==0):
                    break
        if(b1[r][c]=="o"):
            board()
            print("You hit the bomb. Game over. You lose")
            exit()
        
        count2=0
        for i in range(8):
            for j in range(8):
                if(b2[i][j]=='_'):
                    count2+=1
        if(count2==0):
            break

flag=0
for i in range(8):
    for j in range(8):
        if(b2[i][j]=='F'):
            if(b1[i][j]!="o"):
                flag=1
                break
if flag==0:
    print("You win!")
else:
    print("You lose!")
    for i in range(8):
        for j in range(8):
            if(b2[i][j]=='F'):
                if(b1[i][j]!="o"):
                    print("Wrong flag at",i,j)
            


