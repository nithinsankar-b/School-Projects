'''Program to check if the number inputted is a vampire number or not'''
n1 = int(input("Enter a number to find if vamipire number: "))
n5 = n4 = n3 = n2 = n1
FLAG1 = FLAG2 = FLAG3 = FLAG4 = 0
d1 = len(str(n2)) #No. of digits in number inputted
if d1 % 2 == 0: #If the number has even number of digits
    for f1 in range(2, n3):
        FLAG5 = 0
        d2 = 0
        if n3 % f1 == 0:   #Checking factors
            f1_2 = f1_1 = f1
            FLAG1 = 1
            while f1_1 != 0:
                if FLAG1 == 1:    #Trailing zero check.
                    if f1_1 % 10 == 0:
                        FLAG5 = 1  #A flag to determine whether even the next factor has a trailing zero
                        break
                    FLAG1 = 0
                d2 = d2 + 1   #Finding no. of digits in first factor
                f1_1 = f1_1 // 10
            if d2 == d1 / 2:  #If first factor has N/2 digits
                for f2 in range(2, n3):  #Comparing that factor with other factors of the number by multiplying with it
                    d3 = 0
                    if n3 % f2 == 0:
                        f2_2 = f2_1 = f2
                        FLAG1 = 1
                        while f2_1 != 0:  
                            if FLAG1 == 1: #Trailing zero check of second factor
                                if f2_1 % 10 == 0:  
                                    if FLAG5 == 1:  #Check if both factors have trailing zeroes or not
                                        break
                            FLAG1 = 0
                            d3 = d3 + 1   #No. of digits in second factor
                            f2_1 = f2_1 // 10
                        if d3 == d1 / 2:  #If the second factor has N/2 digits
                            if f1_2 * f2_2 == n3:  #Check if product of factors give the number
                                f_concat_1 = int(str(f1_2) + str(f2_2))   #Concat the factors into a single number
                                f_concat_3 = f_concat_2 = f_concat_1
                                d4 = 0
                                count1 = 0
                                while f_concat_2 != 0:   #Check if all the digits of the concatinated factors are present in the original number
                                    d4 = f_concat_2 % 10
                                    f_concat_2 = f_concat_2 // 10
                                    d5 = 0
                                    n4 = n3
                                    while n4 != 0:
                                        d5 = n4 % 10
                                        n4 = n4 // 10
                                        if d4 == d5:
                                            FLAG2 = 1
                                        if FLAG2 == 1:
                                            count1 = count1 + 1  # $count1 checks the number of digits present commonly in both concatinated factors and original no. 
                                            FLAG2 = 0
                                            break
                                if count1 != d1: #If the no. of common digits is same as the original no. of digits, we move ahead with the logic
                                    break
                                FLAG2 = 1
                                if FLAG2 == 1:
                                    d6 = 0
                                    count2 = 0
                                    d8 = len(str(n3))
                                    n5 = n1
                                    while d8 != 0:   #Check if all the digits of the original number are present in the concatinated factors. Done the other way to prevent repetition of numbers affecting the logic of the program.
                                        d8 -= 1
                                        d6 = n5 % 10
                                        n5 = n5 // 10
                                        d7 = 0
                                        f_concat_3 = f_concat_1
                                        d9 = len(str(f_concat_3))
                                        while d9 != 0: #Same logic as previous while in parallel
                                            d9 -= 1
                                            d7 = f_concat_3 % 10
                                            f_concat_3 = f_concat_3 // 10
                                            if d6 == d7:
                                                FLAG3 = 1
                                            if FLAG3 == 1:
                                                count2 = count2 + 1
                                                FLAG3 = 0
                                                break
                                if count2 != d1 or count1 != d1:    #If either one of the counter variables doesn't tally with the original no. of digits in no. inputted, break out as not vampire no.. This is bcs of repetition of digits in factors(Like in 1203- 33)
                                    break
                                FLAG4 = 1
if FLAG4 == 1:   #FLAG4 turns 1 only if the number is a vampire number
    print("It is a vampire number.")
else:
    print("It is not a vampire number.")
    
#Copies of variables are used all throughout the program to prevent changes in one variable to affect the other variables
