'''
旋转数组
给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        
        Do not return anything, modify nums in-place instead.
        
'''

k=3

nums = [1,2,3,4,5,6,7]
start = 0
end = 3
count=0
endtime=2%(end-start+1)
while True:
    if count == endtime:
        break
    temp = nums[start]
    nums[start] = nums[end]
    nums[end] = temp
    start +=1
    end -=1
    count += 1

print(nums)



'''
while True:
    if count == k:
        break
    nums.insert(0,nums[-1])
    nums.pop()
    count +=1
print(nums)
'''