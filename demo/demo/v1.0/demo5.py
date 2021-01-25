def findMinAndMax(L):
    if L:
        bigger=minner=L[0]
        for x in L:
            if x>bigger:
                bigger=x
            if x<minner:
                minner=x
        return (minner,bigger)
    return (None, None)
    

# 测试
if findMinAndMax([]) != (None, None):
    print('测试失败!')
elif findMinAndMax([7]) != (7, 7):
    print('测试失败!')
elif findMinAndMax([7, 1]) != (1, 7):
    print('测试失败!')
elif findMinAndMax([7, 1, 3, 9, 5]) != (1, 9):
    print('测试失败!')
else:
    print('测试成功!')
'''    
if L:
    x = min(L)
    y = max(L)
else:
    return (None, None)
return (x, y)
'''