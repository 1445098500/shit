'''
height = 1.75
weight = 80.5
bmi = weight / height**2
print(bmi)
if bmi < 18.5:
    print("过轻")
elif bmi < 25:
    print("正常")
elif bmi < 28:
    print("过重")
elif bmi <= 32:
    print("肥胖")
elif bmi > 32:
    print("严重肥胖")
'''
'''
L = ['Bart', 'Lisa', 'Adam']
for ls in L:
    print("Hello,"+ls+"!")
'''

#一元二次方程
import math


def quadratic(a, b, c):
    for i in (a, b, c):
        if not isinstance(i, (int, float)):
            raise TypeError("ERROR TYPE")
    derta = b**2 - 4 * a * c
    if a <= 0:
        print("a can't be 0")
    elif derta < 0:
        print("no answer")
    elif derta >= 0:
        x1 = (-b + math.sqrt(derta)) / (a * 2)
        x2 = (-b - math.sqrt(derta)) / (a * 2)
        if x1 == x2:
            return x1
        else:
            return x1, x2
    else:
        pass


# 测试:
print('quadratic(2, 3, 1) =', quadratic(2, 3, 1))
print('quadratic(1, 3, -4) =', quadratic(1, 3, -4))

if quadratic(2, 3, 1) != (-0.5, -1.0):
    print('测试失败')
elif quadratic(1, 3, -4) != (1.0, -4.0):
    print('测试失败')
else:
    print('测试成功')
