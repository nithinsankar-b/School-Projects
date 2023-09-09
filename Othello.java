import java.util.*;
class Othello
{
public static void main()throws Exception
{
Scanner sc=new Scanner(System.in);
int x,y,i,j,f1,k,l,f3=0,f2,c1,c2,a,m,n,t1=0,f4=0,t;
char[][] board = new char[][]
{
{'_','_','_','_','_','_','_','_',},
{'_','_','_','_','_','_','_','_',},
{'_','_','_','_','_','_','_','_',},
{'_','_','_','W','B','_','_','_',},
{'_','_','_','B','W','_','_','_',},
{'_','_','_','_','_','_','_','_',},
{'_','_','_','_','_','_','_','_',},
{'_','_','_','_','_','_','_','_',},
};
System.out.println("OTHELLO- A minute to learn, a lifetime to master...");
Thread.sleep(1000);
System.out.println();
System.out.println("  0 1 2 3 4 5 6 7");
for(i=0;i<=7;i++)
{
System.out.print(i+" ");
for(j=0;j<=7;j++)
System.out.print(board[i][j]+" ");
System.out.println();
}
for(a=5,t=5;a<=64;a++,t++)
{
if(t%2==1)
{
f1=0;
for(i=0;i<=7;i++)
{
for(j=0;j<=7;j++)
{
if(board[i][j]=='_')
{
if(i==0&&j==0)
{
if(board[i][j+1]=='W')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i+1][j]=='W')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i+1][j+1]=='W')
{
for(m=i+2,n=j+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='B')
f1=1;
}
}
}
else if(i==0&&j==7)
{
if(board[i][j-1]=='W')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i+1][j]=='W')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i+1][j-1]=='W')
{
for(m=i+2,n=j-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='B')
f1=1;
}
}
}
else if(i==7&&j==7)
{
if(board[i][j-1]=='W')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i-1][j]=='W')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i-1][j-1]=='W')
{
for(m=i-2,n=j-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='B')
f1=1;
}
}
}
else if(i==7&&j==0)
{
if(board[i][j+1]=='W')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i-1][j]=='W')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i-1][j+1]=='W')
{
for(m=i-2,n=j+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='B')
f1=1;
}
}
}
else if(i==0)
{
if(board[i][j+1]=='W')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i][j-1]=='W')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i+1][j]=='W')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i+1][j-1]=='W')
{
for(m=i+2,n=j-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='B')
f1=1;
}
}
if(board[i+1][j+1]=='W')
{
for(m=i+2,n=j+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='B')
f1=1;
}
}
}
else if(i==7)
{
if(board[i][j+1]=='W')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i][j-1]=='W')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i-1][j]=='W')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i-1][j-1]=='W')
{
for(m=i-2,n=j-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='B')
f1=1;
}
}
if(board[i-1][j+1]=='W')
{
for(m=i-2,n=j+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='B')
f1=1;
}
}
}
else if(j==0)
{
if(board[i+1][j]=='W')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i-1][j]=='W')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i][j+1]=='W')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i-1][j+1]=='W')
{
for(m=i-2,n=j+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='B')
f1=1;
}
}
if(board[i+1][j+1]=='W')
{
for(m=i+2,n=j+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='B')
f1=1;
}
}
}
else if(j==7)
{
if(board[i+1][j]=='W')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i-1][j]=='W')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i][j-1]=='W')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i-1][j-1]=='W')
{
for(m=i-2,n=j-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='B')
f1=1;
}
}
if(board[i+1][j-1]=='W')
{
for(m=i+2,n=j-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='B')
f1=1;
}
}
}
else if(i>0&&i<7&&j>0&&j<7)
{
if(board[i+1][j]=='W')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i-1][j]=='W')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='B')
f1=1;
}
}
if(board[i][j+1]=='W')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i][j-1]=='W')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='B')
f1=1;
}
}
if(board[i-1][j+1]=='W')
{
for(m=i-2,n=j+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='B')
f1=1;
}
}
if(board[i+1][j+1]=='W')
{
for(m=i+2,n=j+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='B')
f1=1;
}
}
if(board[i-1][j-1]=='W')
{
for(m=i-2,n=j-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='B')
f1=1;
}
}
if(board[i+1][j-1]=='W')
{
for(m=i+2,n=j-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='B')
f1=1;
}
}
}
}
}
}
if(f1==1)
{
while(true)
{
System.out.println("Black's turn");
System.out.println("Enter X coordinate");
x= sc.nextInt();
System.out.println("Enter Y coordinate");
y=sc.nextInt();
if(board[x][y]=='W'||board[x][y]=='B')
{
System.out.println("There is already a coin present there. Try again");
continue;
}
board[x][y]='B';
f3=0;
if(x==0&&y==0)
{
if(board[x][y+1]=='W')
{
for(n=y+2;n<=7;n++)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x+1][y]=='W')
{
for(m=x+2;m<=7;m++)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x+1][y+1]=='W')
{
for(m=x+2,n=y+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
}
else if(x==0&&y==7)
{
if(board[x][y-1]=='W')
{
for(n=y-2;n>=0;n--)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x+1][y]=='W')
{
for(m=x+2;m<=7;m++)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x+1][y-1]=='W')
{
for(m=x+2,n=y-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
}
else if(x==7&&y==7)
{
if(board[x][y-1]=='W')
{
for(n=y-2;n>=0;n--)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x-1][y]=='W')
{
for(m=x-2;m>=0;m--)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x-1][y-1]=='W')
{
for(m=x-2,n=y-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
}
else if(x==7&&y==0)
{
if(board[x][y+1]=='W')
{
for(n=y+2;n<=7;n++)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x-1][y]=='W')
{
for(m=x-2;m>=0;m--)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x-1][y+1]=='W')
{
for(m=x-2,n=y+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
}
else if(x==0)
{
if(board[x][y+1]=='W')
{
for(n=y+2;n<=7;n++)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x][y-1]=='W')
{
for(n=y-2;n>=0;n--)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x+1][y]=='W')
{
for(m=x+2;m<=7;m++)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x+1][y-1]=='W')
{
for(m=x+2,n=y-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
if(board[x+1][y+1]=='W')
{
for(m=x+2,n=y+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
}
else if(x==7)
{
if(board[x][y+1]=='W')
{
for(n=y+2;n<=7;n++)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x][y-1]=='W')
{
for(n=y-2;n>=0;n--)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x-1][y]=='W')
{
for(m=x-2;m>=0;m--)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x-1][y-1]=='W')
{
for(m=x-2,n=y-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
if(board[x-1][y+1]=='W')
{
for(m=x-2,n=y+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
}
else if(y==0)
{
if(board[x+1][y]=='W')
{
for(m=x+2;m<=7;m++)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x-1][y]=='W')
{
for(m=x-2;m>=0;m--)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x][y+1]=='W')
{
for(n=y+2;n<=7;n++)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x-1][y+1]=='W')
{
for(m=x-2,n=y+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
if(board[x+1][y+1]=='W')
{
for(m=x+2,n=y+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
}
else if(y==7)
{
if(board[x+1][y]=='W')
{
for(m=x+2;m<=7;m++)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x-1][y]=='W')
{
for(m=x-2;m>=0;m--)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x][y-1]=='W')
{
for(n=y-2;n>=0;n--)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x-1][y-1]=='W')
{
for(m=x-2,n=y-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
if(board[x+1][y-1]=='W')
{
for(m=x+2,n=y-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
}
else if(x>0&&x<7&&y>0&&y<7)
{
if(board[x+1][y]=='W')
{
for(m=x+2;m<=7;m++)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x-1][y]=='W')
{
for(m=x-2;m>=0;m--)
{
if(board[m][y]=='_')
break;
if(board[m][y]=='B')
f3=1;
}
}
if(board[x][y+1]=='W')
{
for(n=y+2;n<=7;n++)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x][y-1]=='W')
{
for(n=y-2;n>=0;n--)
{
if(board[x][n]=='_')
break;
if(board[x][n]=='B')
f3=1;
}
}
if(board[x-1][y+1]=='W')
{
for(m=x-2,n=y+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
if(board[x+1][y+1]=='W')
{
for(m=x+2,n=y+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
if(board[x-1][y-1]=='W')
{
for(m=x-2,n=y-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
if(board[x+1][y-1]=='W')
{
for(m=x+2,n=y-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='_')
break;
if(board[m][n]=='B')
f3=1;
}
}
}
if(f3==1)
{
for(i=x+1;i<=7;i++)
{
f2=0;
if(board[i][y]=='_')
break;
if(board[i][y]=='B')
{
for(j=x+1;j<i;j++)
board[j][y]='B';
f2=1;
}
if(f2==1)
break;
}
for(i=x-1;i>=0;i--)
{
if(board[i][y]=='_')
break;
f2=0;
if(board[i][y]=='B')
{
for(j=x-1;j>i;j--)
board[j][y]='B';
f2=1;
}
if(f2==1)
break;
}
for(i=y+1;i<=7;i++)
{
f2=0;
if(board[x][i]=='_')
break;
if(board[x][i]=='B')
{
for(j=y+1;j<i;j++)
board[x][j]='B';
f2=1;
}
if(f2==1)
break;
}
for(i=y-1;i>=0;i--)
{
f2=0;
if(board[x][i]=='_')
break;
if(board[x][i]=='B')
{
for(j=y-1;j>i;j--)
board[x][j]='B';
f2=1;
}
if(f2==1)
break;
}
for(i=x+1,j=y+1;i<=7&&j<=7;i++,j++)
{
f2=0;
if(board[i][j]=='_')
break;
if(board[i][j]=='B')
{
for(k=x+1,l=y+1;k<i&&l<j;k++,l++)
board[k][l]='B';
f2=1;
}
if(f2==1)
break;
}
for(i=x-1,j=y-1;i>=0&&j>=0;i--,j--)
{
f2=0;
if(board[i][j]=='_')
break;
if(board[i][j]=='B')
{
for(k=x-1,l=y-1;k>i&&l>j;k--,l--)
board[k][l]='B';
f2=1;
}
if(f2==1)
break;
}
for(i=x-1,j=y+1;i>=0&&j<=7;i--,j++)
{
f2=0;
if(board[i][j]=='_')
break;
if(board[i][j]=='B')
{
for(k=x-1,l=y+1;k>i&&l<j;k--,l++)
board[k][l]='B';
f2=1;
}
if(f2==1)
break;
}
for(i=x+1,j=y-1;i<=7&&j>=0;i++,j--)
{
f2=0;
if(board[i][j]=='_')
break;
if(board[i][j]=='B')
{
for(k=x+1,l=y-1;k<i&&l>j;k++,l--)
board[k][l]='B';
f2=1;
if(f2==1)
break;
}
} 
System.out.println("  0 1 2 3 4 5 6 7");
for(i=0;i<=7;i++)
{
System.out.print(i+" ");
for(j=0;j<=7;j++)
System.out.print(board[i][j]+" ");
System.out.println();
}
c1=0;
c2=0;
for(i=0;i<=7;i++)
{
for(j=0;j<=7;j++)
{
if(board[i][j]=='W')
c1++;
else if(board[i][j]=='B')
c2++;
}
}
System.out.println("Black's Coins: "+c2+"\tWhite's coins: "+c1);
System.out.println("----------------------------------------");
t1=0;
Thread.sleep(3000);
break;
}
else
{
board[x][y]='_';
System.out.println("Invalid move. Try Again");
}
}
}
else
{
System.out.println("Black has no moves. Chance passes.");
System.out.println("----------------------------------------");
t1++;
a--;
if(t1==2)
{
System.out.println("No player has moves. Game Ends");
c1=0;
c2=0;
for(i=0;i<=7;i++)
{
for(j=0;j<=7;j++)
{
if(board[i][j]=='W')
c1++;
else if(board[i][j]=='B')
c2++;
}
}
if(c1>c2)
{
System.out.println("White wins!");
f4=1;
}
else if(c2>c1)
{
System.out.println("Black wins!");
f4=1;
}
else
{
System.out.println("It's a draw!");
}
}
}
}
else
{
System.out.println("White's turn(Computer)");
Thread.sleep(1000);
f1=0;
for(i=0;i<=7;i++)
{
for(j=0;j<=7;j++)
{
if(board[i][j]=='_')
{
if(i==0&&j==0)
{
if(board[i][j+1]=='B')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i+1][j]=='B')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i+1][j+1]=='B')
{
for(m=i+2,n=j+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='W')
f1=1;
}
}
}
else if(i==0&&j==7)
{
if(board[i][j-1]=='B')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i+1][j]=='B')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i+1][j-1]=='B')
{
for(m=i+2,n=j-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='W')
f1=1;
}
}
}
else if(i==7&&j==7)
{
if(board[i][j-1]=='B')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i-1][j]=='B')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i-1][j-1]=='B')
{
for(m=i-2,n=j-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='W')
f1=1;
}
}
}
else if(i==7&&j==0)
{
if(board[i][j+1]=='B')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i-1][j]=='B')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i-1][j+1]=='B')
{
for(m=i-2,n=j+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='W')
f1=1;
}
}
}
else if(i==0)
{
if(board[i][j+1]=='B')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i][j-1]=='B')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i+1][j]=='B')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i+1][j-1]=='B')
{
for(m=i+2,n=j-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='W')
f1=1;
}
}
if(board[i+1][j+1]=='B')
{
for(m=i+2,n=j+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='W')
f1=1;
}
}
}
else if(i==7)
{
if(board[i][j+1]=='B')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i][j-1]=='B')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i-1][j]=='B')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i-1][j-1]=='B')
{
for(m=i-2,n=j-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='W')
f1=1;
}
}
if(board[i-1][j+1]=='B')
{
for(m=i-2,n=j+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='W')
f1=1;
}
}
}
else if(j==0)
{
if(board[i+1][j]=='B')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i-1][j]=='B')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i][j+1]=='B')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i-1][j+1]=='B')
{
for(m=i-2,n=j+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='W')
f1=1;
}
}
if(board[i+1][j+1]=='B')
{
for(m=i+2,n=j+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='W')
f1=1;
}
}
}
else if(j==7)
{
if(board[i+1][j]=='B')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i-1][j]=='B')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i][j-1]=='B')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i-1][j-1]=='B')
{
for(m=i-2,n=j-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='W')
f1=1;
}
}
if(board[i+1][j-1]=='B')
{
for(m=i+2,n=j-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='W')
f1=1;
}
}
}
else if(i>0&&i<7&&j>0&&j<7)
{
if(board[i+1][j]=='B')
{
for(m=i+2;m<=7;m++)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i-1][j]=='B')
{
for(m=i-2;m>=0;m--)
{
if(board[m][j]=='W')
f1=1;
}
}
if(board[i][j+1]=='B')
{
for(n=j+2;n<=7;n++)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i][j-1]=='B')
{
for(n=j-2;n>=0;n--)
{
if(board[i][n]=='W')
f1=1;
}
}
if(board[i-1][j+1]=='B')
{
for(m=i-2,n=j+2;m>=0&&n<=7;m--,n++)
{
if(board[m][n]=='W')
f1=1;
}
}
if(board[i+1][j+1]=='B')
{
for(m=i+2,n=j+2;m<=7&&n<=7;m++,n++)
{
if(board[m][n]=='W')
f1=1;
}
}
if(board[i-1][j-1]=='B')
{
for(m=i-2,n=j-2;m>=0&&n>=0;m--,n--)
{
if(board[m][n]=='W')
f1=1;
}
}
if(board[i+1][j-1]=='B')
{
for(m=i+2,n=j-2;m<=7&&n>=0;m++,n--)
{
if(board[m][n]=='W')
f1=1;
}
}
}
}
}
}
if(f1==1)
{
x=0;
y=0;
c1=0;
c2=0;
for(i=0;i<=7;i++)
{
for(j=0;j<=7;j++)
{
if(board[i][j]=='_')
{
if(i==0&&j==0)
{
if(board[i+1][j]=='B')
{
c1=0;
for(k=i+1;k<=7;k++)
{
if(board[k][j]=='_')
break;
if(board[k][j]=='W')
{
c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j+1]=='B')
{
c1=0;
for(k=j+1;k<=7;k++)
{
if(board[i][k]=='_')
break;
if(board[i][k]=='W')
{
c1=k-j;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i+1][j+1]=='B')
{
c1=0;
for(k=i+1,l=j+1;k<=7&&l<=7;k++,l++)
{
if(board[k][l]=='_')
break;
if(board[k][l]=='W')
{
c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
}
else if(i==0&&j==7)
{
if(board[i+1][j]=='B')
{
c1=0;
for(k=i+1;k<=7;k++)
{
if(board[k][j]=='_')
break;
if(board[k][j]=='W')
{
c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j-1]=='B')
{
c1=0;
for(k=j-1;k>=0;k--)
{
if(board[i][k]=='_')
break;
if(board[i][k]=='W')
{
c1=j-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i+1][j-1]=='B')
{
c1=0;
for(k=i+1,l=j-1;k<=7&&l>=0;k++,l--)
{
if(board[k][l]=='_')
break;
if(board[k][l]=='W')
{
c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
}
else if(i==7&&j==0)
{
if(board[i-1][j]=='B')
{
c1=0;
for(k=i-1;k>=0;k--)
{
if(board[k][j]=='_')
break;
if(board[k][j]=='W')
{
c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j+1]=='B')
{
c1=0;
for(k=j+1;k<=7;k++)
{
if(board[i][k]=='_')
break;
if(board[i][k]=='W')
{
c1=k-j;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j+1]=='B')
{
c1=0;
for(k=i-1,l=j+1;k>=0&&l<=7;k--,l++)
{
if(board[k][l]=='_')
break;
if(board[k][l]=='W')
{
c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
}
else if(i==7&&j==7)
{
if(board[i-1][j]=='B')
{
c1=0;
for(k=i-1;k>=0;k--)
{
if(board[k][j]=='_')
break;
if(board[k][j]=='W')
{
c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j-1]=='B')
{
c1=0;
for(k=j-1;k>=0;k--)
{
if(board[i][k]=='_')
break;
if(board[i][k]=='W')
{
c1=j-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j-1]=='B')
{
c1=0;
for(k=i-1,l=j-1;k>=0&&l>=0;k--,l--)
{
if(board[k][l]=='_')
break;
if(board[k][l]=='W')
{
c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
}
else if(i==0)
{
if(board[i][j-1]=='B')
{
c1=0;
for(k=j-1;k>=0;k--)
{
if(board[i][k]=='_')
break;
if (board[i][k]=='W')
{ c1=j-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j+1]=='B')
{
c1=0;
for(k=j+1;k<=7;k++)
{
if(board[i][k]=='_')
break;
if (board[i][k]=='W')
{ c1=k-j;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i+1][j]=='B')
{
c1=0;
for(k=i+1;k<=7;k++)
{
if(board[k][j]=='_')
break;
if (board[k][j]=='W')
{ c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i+1][j-1]=='B')
{
c1=0;
for(k=i+1,l=j-1;k<=7&&l>=0;k++,l--)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i+1][j+1]=='B')
{
c1=0;
for(k=i+1,l=j+1;k<=7&&l<=7;k++,l++)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
}
else if(i==7)
{
if(board[i][j-1]=='B')
{
c1=0;
for(k=j-1;k>=0;k--)
{
if(board[i][k]=='_')
break;
if (board[i][k]=='W')
{ c1=j-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j+1]=='B')
{
c1=0;
for(k=j+1;k<=7;k++)
{
if(board[i][k]=='_')
break;
if (board[i][k]=='W')
{ c1=k-j;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j]=='B')
{
c1=0;
for(k=i-1;k>=0;k--)
{
if(board[k][j]=='_')
break;
if (board[k][j]=='W')
{ c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j-1]=='B')
{
c1=0;
for(k=i-1,l=j-1;k>=0&&l>=0;k--,l--)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j+1]=='B')
{
c1=0;
for(k=i-1,l=j+1;k>=0&&l<=7;k--,l++)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
}
else if(j==0)
{
if(board[i+1][j]=='B')
{
c1=0;
for(k=i+1;k<=7;k++)
{
if(board[k][j]=='_')
break;
if (board[k][j]=='W')
{ c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j]=='B')
{
c1=0;
for(k=i-1;k>=0;k--)
{
if(board[k][j]=='_')
break;
if (board[k][j]=='W')
{ c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j+1]=='B')
{
c1=0;
for(k=j+1;k<=7;k++)
{
if(board[i][k]=='_')
break;
if (board[i][k]=='W')
{ c1=k-j;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j+1]=='B')
{
c1=0;
for(k=i-1,l=j+1;k>=0&&l<=7;k--,l++)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i+1][j+1]=='B')
{
c1=0;
for(k=i+1,l=j+1;k<=7&&l<=7;k++,l++)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
}
else if(j==7)
{
if(board[i+1][j]=='B')
{
c1=0;
for(k=i+1;k<=7;k++)
{
if(board[k][j]=='_')
break;
if (board[k][j]=='W')
{ c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j]=='B')
{
c1=0;
for(k=i-1;k>=0;k--)
{
if(board[k][j]=='_')
break;
if (board[k][j]=='W')
{ c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j-1]=='B')
{
c1=0;
for(k=j-1;k>=7;k--)
{
if(board[i][k]=='_')
break;
if (board[i][k]=='W')
{ c1=j-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j-1]=='B')
{
c1=0;
for(k=i-1,l=j-1;k>=0&&l>=0;k--,l--)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i+1][j-1]=='B')
{
c1=0;
for(k=i+1,l=j-1;k<=7&&l>=0;k++,l--)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
}
else
{
if(board[i+1][j]=='B')
{
c1=0;
for(k=i+1;k<=7;k++)
{
if(board[k][j]=='_')
break;
if (board[k][j]=='W')
{ c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j]=='B')
{
c1=0;
for(k=i-1;k>=0;k--)
{
if(board[k][j]=='_')
break;
if (board[k][j]=='W')
{ c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j-1]=='B')
{
c1=0;
for(k=j-1;k>=0;k--)
{
if(board[i][k]=='_')
break;
if (board[i][k]=='W')
{ c1=j-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i][j+1]=='B')
{
c1=0;
for(k=j+1;k<=7;k++)
{
if(board[i][k]=='_')
break;
if (board[i][k]=='W')
{ c1=k-j;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j-1]=='B')
{
c1=0;
for(k=i-1,l=j-1;k>=0&&l>=0;k--,l--)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i+1][j+1]=='B')
{
c1=0;
for(k=i+1,l=j+1;k<=7&&l<=7;k++,l++)
{
if(board[k][l]=='_')
break;
if (board[k][l]=='W')
{ c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i-1][j+1]=='B')
{
c1=0;
for(k=i-1,l=j+1;k>=0&&l<=7;k--,l++)
{
if(board[k][l]=='_')
break;
if(board[k][l]=='W')
{
c1=i-k;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
if(board[i+1][j-1]=='B')
{
c1=0;
for(k=i+1,l=j-1;k<=7&&l>=0;k++,l--)
{
if(board[k][l]=='_')
break;
if(board[k][l]=='W')
{
c1=k-i;
if(c1>c2)
{
x=i;
y=j;
c2=c1;
}
f3=1;
}
if(f3==1)
{
f3=0;
break;
}
}
}
}
}
}
}
board[x][y]='W';
System.out.println("Computer has played at "+x+","+y);
if(f1==1)
{
for(i=x+1;i<=7;i++)
{
f2=0;
if(board[i][y]=='_')
break;
if(board[i][y]=='W')
{
for(j=x+1;j<i;j++)
board[j][y]='W';
f2=1;
}
if(f2==1)
break;
}
for(i=x-1;i>=0;i--)
{
f2=0;
if(board[i][y]=='_')
break;
if(board[i][y]=='W')
{
for(j=x-1;j>i;j--)
board[j][y]='W';
f2=1;
}
if(f2==1)
break;
}
for(i=y+1;i<=7;i++)
{
f2=0;
if(board[x][i]=='_')
break;
if(board[x][i]=='W')
{
for(j=y+1;j<i;j++)
board[x][j]='W';
f2=1;
}
if(f2==1)
break;
}
for(i=y-1;i>=0;i--)
{
f2=0;
if(board[x][i]=='_')
break;
if(board[x][i]=='W')
{
for(j=y-1;j>i;j--)
board[x][j]='W';
f2=1;
}
if(f2==1)
break;
}
for(i=x+1,j=y+1;i<=7&&j<=7;i++,j++)
{
f2=0;
if(board[i][j]=='_')
break;
if(board[i][j]=='W')
{
for(k=x+1,l=y+1;k<i&&l<j;k++,l++)
board[k][l]='W';
f2=1;
}
if(f2==1)
break;
}
for(i=x-1,j=y-1;i>=0&&j>=0;i--,j--)
{
f2=0;
if(board[i][j]=='_')
break;
if(board[i][j]=='W')
{
for(k=x-1,l=y-1;k>i&&l>j;k--,l--)
board[k][l]='W';
f2=1;
}
if(f2==1)
break;
}
for(i=x-1,j=y+1;i>=0&&j<=7;i--,j++)
{
f2=0;
if(board[i][j]=='_')
break;
if(board[i][j]=='W')
{
for(k=x-1,l=y+1;k>i&&l<j;k--,l++)
board[k][l]='W';
f2=1;
}
if(f2==1)
break;
}
for(i=x+1,j=y-1;i<=7&&j>=0;i++,j--)
{
f2=0;
if(board[i][j]=='_')
break;
if(board[i][j]=='W')
{
for(k=x+1,l=y-1;k<i&&l>j;k++,l--)
board[k][l]='W';
f2=1;
if(f2==1)
break;
}
}
}
System.out.println("  0 1 2 3 4 5 6 7");
for(i=0;i<=7;i++)
{
System.out.print(i+" ");
for(j=0;j<=7;j++)
System.out.print(board[i][j]+" ");
System.out.println();
}
c1=0;
c2=0;
for(i=0;i<=7;i++)
{
for(j=0;j<=7;j++)
{
if(board[i][j]=='W')
c1++;
else if(board[i][j]=='B')
c2++;
}
}
System.out.println("Black's Coins: "+c2+"\tWhite's coins: "+c1);
System.out.println("----------------------------------------");
t1=0;
Thread.sleep(3000);
}
else
{
System.out.println("White has no moves. Chance passes");
System.out.println("----------------------------------------");
t1++;
a--;
if(t1==2)
{
System.out.println("No player has moves. Game ends.");
c1=0;
c2=0;
for(i=0;i<=7;i++)
{
for(j=0;j<=7;j++)
{
if(board[i][j]=='W')
c1++;
else if(board[i][j]=='B')
c2++;
}
}
if(c1>c2)
{
System.out.println("White wins!");
f4=1;
}
else if(c2>c1)
{
System.out.println("Black wins!");
f4=1;
}
else
{
System.out.println("It's a draw!");
}
}
}
}
if(f4==1)
break;
}
if(a==65)
{
c1=0;
c2=0;
for(i=0;i<=7;i++)
{
for(j=0;j<=7;j++)
{
if(board[i][j]=='W')
c1++;
else if(board[i][j]=='B')
c2++;
}
}
if(c1>c2)
System.out.println("White wins!");
else if(c2>c1)
System.out.println("Black wins!");
else
System.out.println("It's a draw!");
}
System.out.println("GAME ENDS");
System.out.println("****************************************");
}
}