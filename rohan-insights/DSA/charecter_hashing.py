s = "14e5216wyu2ehcdhwbcnmwck-09uy86`rw4fyghdbjkwqdkepcvf vklnoi!@$#%T*()"
q = ['s', '4', 'e', '2', 's', 'f', '@','&','#', '$']

hash_list = [0]*127

for c in s:
    ascii_val = ord(c)
    hash_list[ascii_val]+=1

for c in q:
    ascii_val = ord(c)
    print(f"{c} = {hash_list[ascii_val]}")


print(hash_list)

# TC = O(n+m)
# SC = O(1)