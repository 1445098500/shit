def trim(s):
    '''
    while s[:1] == " ":
        s=s[1:]
    while s[-1:] == " ":
        s=s[:-2]
    return s
    '''

    for _ in range(2):

        s = s [::-1]

        while s[:1] == " ":

            s = s[1:]

    return s




'''
    b = 0
    c = -1
    for a in s[:]:
        if a == " ":
            c = c - 1
        else:
            b = b + 1
    if s[:1] == " ":
        return s[:b]
    else :
        return s[-1:c]
'''
'''
    b = -1
    while s[a::1] != " " and s[b::1] != " ":
        if s[a::1] == " ":
            a = a + 1
        elif s[b::1] == " ":
            b = b - 1
        else:
            print(s[a:b])
'''

# 测试:
if trim('hello  ') != 'hello':
    print('测试失败!')
elif trim('  hello') != 'hello':
    print('测试失败!')
elif trim('  hello  ') != 'hello':
    print('测试失败!')
elif trim('  hello  world  ') != 'hello  world':
    print('测试失败!')
elif trim('') != '':
    print('测试失败!')
elif trim('    ') != '':
    print('测试失败!')
else:
    print('测试成功!')