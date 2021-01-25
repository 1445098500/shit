import os

def find(path,key):

    count_dirs = count_files = 0

    for root, dirs, files in os.walk(path):

        for x in files:

            if key in x:

                print(os.path.join(root,x),'文件')

                count_files += 1

        for y in dirs:

            if key in y:

                print(os.path.join(root,y),'目录')

                count_dirs += 1

    print('\n文件数：%d, 目录数：%d'%(count_files,count_dirs))

a = input('请输入路径：')

b = input('\n请输入关键字:')

find(a,b)