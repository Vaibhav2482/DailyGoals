# Print x to n

def func(x,n):
    if n==0:
        return
    print(x)
    func(x,n-1)

func(8,4)

# Print 1 to n

def func(i,n):
    if i>n:
        return
    print(i)
    func(i+1,n)

func(1,4)

# Print n to 1 (Tail) Backtracking

def func(i,n):
    if i>n:
        return
    func(i+1,n)
    print(i)

func(1,4)

# print 1 to n (Tail)

def func(i,n):
    if n<i:
        return
    func(i,n-1)
    print(n)

func(1,4)