Integer a, b, c
Set a=2, b=6, c=8
a=(10+9)+c
if((c+b)>(a-c))
    a=b+c
    b=b+b
End if
Print a+b+c
A. 23
B. 41
C. 48
D. 58

Explanation:
In the Line (Statement) no. 3, it is updating the value of variable a from 2 to (10+9)+c => 19+8 => 27

In the Line (Statement) no. 4, it is a conditional statement and evaluates expression with the updated value of variable a, because order of statement matters. Since (c+b means 8+6 = 14) is not greater than (a-c means 27-8 = 19), the ‘if’ body will not be executed.

That’s why it will come directly at statement 8 and will display the sum of a+b+c, which is 27+6+8 = 41, which means option B will be the correct answer from the above given options.
