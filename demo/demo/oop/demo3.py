class Screen(object):
    @property
    def width(self):
        return self.width

    @width.setter
    def width(self, value):
        self._width = value

    @property
    def height(self):
        return self.height

    @height.setter
    def height(self, value):
        self.height = value

    @property
    def resolution(self):
        return self.height * self.width


# 测试:
s = Screen()
s.width = 1024
s.height = 768
print('resolution =', s.resolution)
if s.resolution == 786432:
    print('测试通过!')
else:
    print('测试失败!')