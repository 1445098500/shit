from urllib import request
import json
'''
def fetch_data(url):
    with request.urlopen(url) as f:
        data = f.read()
        return json.loads(data.decode('utf-8'))




# 测试
URL = 'http://www.httpbin.org/get'
data = fetch_data(URL)
print(data)
assert data['query']['results']['channel']['location']['city'] == 'Beijing'
print('ok')   
'''
from urllib import request
import json

def fetch_data(url):
    with request.urlopen(str(url)) as f:
        data = f.read().decode('utf-8')
        return json.loads(data)

# 测试
URL = 'https://recsidebar.csdn.net/getSideBarRecommend.html'
data = fetch_data(URL)
print(data)
assert data['error'] == True and data['status'] == 400
print('ok')