
# Q. find how many times element of list m appear in list n. 
# Constraints 1) 1 < n[i] <=10  2) n can have 10^8 elements  3) m can have 10^8 elements

 
n = [1,3,5,3,4,6,7,8,9,7,5,4,5,6,7,]
m = [2,44,98,5,6,7,5,5,45,6,56,7,84,4]

# Optimal Solution

hash_list = [0]*11

for num in n:
    hash_list[num]+=1

for num in m:
    if num<1 or num>10:
        print(f"{num} = 0")
    else:
        print(f"{num} = {hash_list[num]}")

print(hash_list)

#TC = O(n+m)
#SC = O(11) ~= O(1)

#-----------------------------------------------------


# Using Dictionary - if values in list n is anything.

# dict = {}

# for i in n:
#     if i in dict:
#         dict[i] += 1
#     else:
#         dict[i] = 1

# for i in m:
#     if i in n:
#         print(f"{i} = {dict.get(i)}");
#     else:
#         print(f"{i} = 0 ");

# print(dict);

