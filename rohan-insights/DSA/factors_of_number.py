# Option 1

num = 36
result = []
# for i in range(1,num+1):
#     if num%i == 0:
#         result.append(i)

# print(result);


# Option 2

# for i in range(1,num//2 + 1):
#     if num%i == 0:
#         result.append(i)

# result.append(num)
# print(result);


# Option 3
from math import sqrt;
for i in range(1,int(sqrt(num))+1):
    if num%i == 0:
        result.append(i)

        if num//i != i:
            result.append(num//i)

result.sort()
print(result);


# TC
# Option 1 - O(n)
# Option 2 - O(n/2)
# Option 3 - O(nlog(n))
# SC
# Option 1 - O(k)
# Option 2 - O(k)
# Option 3 - O(k)
