'''
def normalize(name):
    return name.capitalize()
    
# 测试:
L1 = ['adam', 'LISA', 'barT']
L2 = list(map(normalize, L1))
print(L2)
'''


'''
def prod(L):
    def ox(x, y):
        return x * y

    return reduce(ox, L)


print('3 * 5 * 7 * 9 =', prod([3, 5, 7, 9]))
if prod([3, 5, 7, 9]) == 945:
    print('测试成功!')
else:
    print('测试失败!')
'''
from functools import reduce

def str2int(s):
    return reduce(lambda x,y:x*10+y,map(int,s))
def str2float(s):
    i = s.index('.') 
    result = str2int(s[0:i])*10**i + str2int(s[i+1:])
    return result/10**i


print('str2float(\'123.456\') =', str2float('123.456'))
if abs(str2float('123.456') - 123.456) < 0.00001:
    print('测试成功!')
else:
    print('测试失败!')