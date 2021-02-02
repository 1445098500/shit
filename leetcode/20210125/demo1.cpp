#include <stdio.h>
#include <windows.h>
int removeDuplicates(int* nums, int numsSize){
    int j = numsSize;
    if(j > 1){
        j = 1;
        for(int i = 1; i < numsSize; i ++){
            if(nums[i] == nums[i - 1]){
                continue;
            } else{
                nums[j] = nums[i];
                j++;
            }
        }
    }
    return j;
}