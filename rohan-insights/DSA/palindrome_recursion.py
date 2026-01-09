s = "dfghjjhgfd"

def palin(s,l_index,r_index):
    if s[l_index]>=s[r_index]:
        return True
    if s[l_index]!=s[r_index]:
        return False
    return palin(s,l_index+1,r_index-1)

print(palin(s,0,len(s)-1))

# TC = O(n/2)~O(n)
# ST = O(n/2)~O(n)

