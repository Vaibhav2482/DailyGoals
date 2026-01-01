nums = [5,4,43,53,44,3,4,5,54,43,3,24,5,6]

hash_map = {}
n = len(nums)

for i in range(0,n):
    hash_map[nums[i]] = hash_map.get(nums[i],0)+1

print(hash_map);

# TC = O(n)
# SC = O(n)