import re

def is_valid_email(addr):

    str = r'^([\w\.]+)@(\w+)\.(\w+)$'

    if re.match(str,addr):
        
        return True

    else:
        return None


#<Tom Paris> tom@voyager.org => Tom Paris
#bob@example.com => bob
#r'<?([\s\w]+)>?[\s\w]*@(\w+)\.(\w+)'


def name_of_email(addr):

    str = r'<?([\w\s]+)>?[\w\s]*@(\w+)\.(\w+)'
    
    print(re.match(str,addr).group(1))



    if re.match(str,addr):
        
        return re.match(str,addr).group(1)

    else:
        return None

# 测试:
assert name_of_email('<Tom Paris> tom@voyager.org') == 'Tom Paris'
assert name_of_email('tom@voyager.org') == 'tom'
print('ok')

# 测试:
assert is_valid_email('someone@gmail.com')
assert is_valid_email('bill.gates@microsoft.com')
assert not is_valid_email('bob#example.com')
assert not is_valid_email('mr-bob@example.com')
print('ok')