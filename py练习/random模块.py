import random

# print(random.random())

# 生成1-3之间的随机小数
print(random.uniform(1, 3))

# 随机点名
list = ["小明","小红","小何","小王"]
print(random.choice(list)) # 随机点出一个
print(random.sample(list, 2)) # 随机点击 2 个


# 随机生成四位验证码 包括数字 大小字母
def rand_num():
    return str(random.randint(0,9))

def rand_upper():
    return chr(random.randint(65,90))

def rand_lower():
    return  chr(random.randint(97,122))

def rand_verify_code(n=4):
    list = []
    for i in range(n):
        which = random.randint(1,3)
        if which == 1:
            s = rand_num()
        elif which == 2:
            s = rand_lower()
        elif which == 3:
            s = rand_upper()
        list.append(s)

    return "".join(list)


print(rand_verify_code())

