Integer funn(Integer a, Integer b, Integer c)
b = 7 + a
a = (a + c) + a
b = (b + b) + c
c = 1 + b
return a + b + c
End function funn()
A. 59
B. 68
C. 70
D. 39

Explanation:
Initial values will be updated as per the order of statements. Like in Line (statement) no. 3: variable ‘b’ will be updated with a value of (7+a) which means 7+0=7.
Then, in line 4, variable ‘a’ will be updated with value (a+c)+a which is (0+10)+0=10.

Now, in line 5, ‘b’ will be updated with (b+b)+c.
Keep in mind "Precedence of Operators" while assigning the values in ‘b’.
First it will execute parentheses () and will retrieve the current value of b which has updated from line 3 then it will add with value of c.
After execution of line 5, variable ‘b’ will be updated with value (7+7)+10 = 24.

Then, in line 6, the value of variable ‘c’ will be updated with 1 + b.
Last value of b is 24, so variable ‘c’ will be updated with 1 + 24 = 25.

Now from line 7, updated values of variable a, b, and c will be added together and returned from the function.
So the final (return) value will be a + b + c => 10 + 24 + 25 = 59

Answer: A
