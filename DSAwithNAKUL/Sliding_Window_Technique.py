#Find Maximum Sum Subarray of Size k
arr = [2, 1, 5, 1, 3, 2]
k = 3

window_sum = sum(arr[:k])
max_sum = window_sum

for i in range(k, len(arr)):
    window_sum += arr[i] - arr[i - k]
    max_sum = max(max_sum, window_sum)

print(max_sum)
print("\n")

#Count Number of Subarrays with Sum = k
arr = [1, 2, 3]
k = 3

count = 0
curr_sum = 0
freq = {0: 1}

for x in arr:
    curr_sum += x
    count += freq.get(curr_sum - k, 0)
    freq[curr_sum] = freq.get(curr_sum, 0) + 1

print(count)
print("\n")