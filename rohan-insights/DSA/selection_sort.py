# Ascending order

nums = [3,2,5,9,6,8,4,1,7]

def selec_sort(num):
    n=len(num)
    for i in range(0,n):
        min_index = i
        for j in range(i+1,n):
            if num[j]<num[min_index]:
                min_index=j
        num[i],num[min_index]=num[min_index],num[i]

selec_sort(nums)
print(nums)

# Descending order

def selec_sort(num):
    n=len(num)
    for i in range(0,n):
        max_index = i
        for j in range(i+1,n):
            if num[j]>num[max_index]:
                max_index=j
        num[i],num[max_index]=num[max_index],num[i]

selec_sort(nums)
print(nums)


# TC = O(n(n+1)/2) ~ O(n^2)
# SC = O(1)
