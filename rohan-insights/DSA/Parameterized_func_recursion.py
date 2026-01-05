# Sum of 1 to n numbers

def func(n):
    if n==1:
        return 1
    return n + func(n-1)

print(func(4))

# TC = O(n)
# SC = O(n)

# Recursion Tree

#   func(4)⬆️
#   ⬇️
#   func(3)⬆️
#   ⬇️
#   func(2)⬆️
#   ⬇️
#   func(1)⬆️


# Factorial of a number using recursion

def fact(n):
    if n==0 or n==1:
        return 1
    return n * fact(n-1)

print(fact(5))

# TC = O(n)
# SC = O(n)

# Recursion Tree

#   func(5)⬆️
#   ⬇️
#   func(4)⬆️
#   ⬇️
#   func(3)⬆️
#   ⬇️
#   func(2)⬆️
#   ⬇️
#   func(1)⬆️
