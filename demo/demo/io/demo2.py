import os

a = os.walk('.')

for root, dirs, files in a:
    print(root)
    print(dirs)
    print(files)
    print('\n')