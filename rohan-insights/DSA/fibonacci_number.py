# Find n th fibonacci number

def fibonacci(n):
    if n==0 or n==1:
        return n
    return fibonacci(n-1)+fibonacci(n-2)

f = fibonacci(8)
print(f)

# TC = O(2^n)
# SC = O(2^n)
