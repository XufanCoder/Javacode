import pickle
# 进行网络传输
# 把数据类型转化为字节
list = {1:"小米",2:"大米"}
bs = pickle.dumps(list)
print(bs) # b'\x80\x04\x95\x1b\x00\x00\x00\x00\x00\x00\x00}\x94(K\x01\x8c\x06\xe5\xb0\x8f\xe7\xb1\xb3\x94K\x02\x8c\x06\xe5\xa4\xa7\xe7\xb1\xb3\x94u.'

# 把字节码还原

res = b'\x80\x04\x95\x1b\x00\x00\x00\x00\x00\x00\x00}\x94(K\x01\x8c\x06\xe5\xb0\x8f\xe7\xb1\xb3\x94K\x02\x8c\x06\xe5\xa4\xa7\xe7\xb1\xb3\x94u.'
res1 = pickle.loads(res)
print(res1)