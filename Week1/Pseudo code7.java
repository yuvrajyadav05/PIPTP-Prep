Integer funn(Integer a, Integer b, Integer c)
  for (each c from 4 to 5)
    b = c + b
    if ((4 - c - a) < (a + b))
      b = (b + 8) + b
      b = (a ^ b) + b
    Else
      b = (c ^ a) + c
      Jump out of the loop
    End if
  End for
  return a + b


  Iteration 1: c = 4
Initial: a = 1, b = 2

b = c + b = 4 + 2 = 6

Check: (4 - 4 - 1) < (1 + 6) → -1 < 7 ✅ true

b = (6 + 8) + 6 = 14 + 6 = 20

b = (1 ^ 20) + 20 = 21 + 20 = 41

🔁 Iteration 2: c = 5
Now: a = 1, b = 41

b = c + b = 5 + 41 = 46

Check: (4 - 5 - 1) < (1 + 46) → -2 < 47 ✅ true

b = (46 + 8) + 46 = 54 + 46 = 100

b = (1 ^ 100) + 100 = 101 + 100 = 201

✅ Final Step:
a = 1, b = 201

return a + b = 1 + 201 = 202
