from datetime import datetime
from datetime import date


t1 = datetime.now()
# 打印当前时间
print(t1)

# 格式化时间  strftime函数
t2 = t1.strftime("%d/%m/%Y")
print(t2)


# 用户输入俩个时间，计算时间差 strptime函数
s1 = input("请输入第一个时间：(yyyy-mm-dd HH:MM:SS)")
s2 = input("请输入第二个时间：(yyyy-mm-dd HH:MM:SS)")
# 把字符串转化为时间
t1 = datetime.strptime(s1,"%Y-%m-%d %H:%M:%S" )
t2 = datetime.strptime(s2,"%Y-%m-%d %H:%M:%S" )
print(t2 - t1)
