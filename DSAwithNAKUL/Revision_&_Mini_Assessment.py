#Mixed Problem (Array + String + Pattern Choice)
from collections import defaultdict

s = "eceba"
k = 2

l = 0
freq = defaultdict(int)
ans = 0

for r in range(len(s)):
    freq[s[r]] += 1

    while len(freq) > k:
        freq[s[l]] -= 1
        if freq[s[l]] == 0:
            del freq[s[l]]
        l += 1

    ans = max(ans, r - l + 1)

print(ans)
print("\n")

#Analyze Time Complexity of a Given Solution
arr = [10, 20, 30, 40]
n = 4
for i in range(n):
    for j in range(n):
        print(arr[i], arr[j])
