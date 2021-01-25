import pymysql
conn = pymysql.connect(host='localhost',
                       port=3306,
                       user='root',
                       passwd='password',
                       db='test',
                       charset='utf8')
conn.close()