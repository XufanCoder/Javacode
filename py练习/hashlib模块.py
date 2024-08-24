import hashlib

# 创建一个 md5 对象
obj = hashlib.md5()
# 把加密的信息传递给 obj 参数要求是字节
obj.update("123456".encode("utf-8"))
# 从 obj 中拿到密文
ans = obj.hexdigest()
print(ans)  # e10adc3949ba59abbe56e057f20f883e  此结果可以查询出来，拿着密文可破解，俗称撞库

# 解决撞库问题，可以加盐
obj = hashlib.md5(b'dfdsfs22') # 加盐操作
obj.update('123456'.encode("utf-8"))
print(obj.hexdigest()) # c8e886dc3e845db58d2228da219fe85c 此结果是查询不出来的





