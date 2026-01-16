# Merge Sort (Divide & Merge)

nums = [2,4,6,3,5,7,9,9,5,4,3,5,8]

def merge_arr(left,right):
    result  = []
    i,j = 0,0
    n,m = len(left),len(right)
    while i<n and j<m:
        if left[i]<=right[j]:
            result.append(left[i])
            i+=1
        else:
            result.append(right[j])
            j+=1
    if i<n:
        while i<n:
            result.append(left[i])
            i+=1
    if j<m:
        while j<m:
            result.append(right[j])
            j+=1
    return result

def merge_sort(arr):
    if len(arr)<=1:
        return arr
    mid = len(arr)//2
    left_half = arr[:mid]
    right_half = arr[mid:]
    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)
    return merge_arr(left_half,right_half)

print(merge_sort(nums))

# TC = O(log2 n+n) ~ O(n log n)
# SC = O(n)
