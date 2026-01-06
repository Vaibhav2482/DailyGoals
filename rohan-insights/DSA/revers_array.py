
#Using recursion

ary = [2,3,5,7,8,9,6,5,4,5,6]

def revers(ary,_index,right_index):
    if _index >= right_index:
        return ary
    ary[_index],ary[right_index] = ary[right_index],ary[_index]
    revers(ary,_index+1,right_index-1)
    return ary

print(revers(ary,0,len(ary)-1))



#Using While

nums = [2,3,5,7,8,9,6,5,4,5,6]
si = 0
li = len(nums)-1
while li>=si:
    # result.append(nums[n])
    nums[si],nums[li]=nums[li],nums[si]
    li-=1
    si+=1
print(nums)   
