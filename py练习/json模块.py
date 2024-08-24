import json

# py中的字典转化为json字符串
dict = {"id":1,"sex":"男的","age":"18"}
s = json.dumps(dict,ensure_ascii=False) # 处理中文 要加ensure_ascii=False
print(s,type(s)) # {"id": 1, "sex": "男的", "age": "18"} <class 'str'>


# 前端返回的json字符串转化为py中的字典
str = '{"id": 1, "sex": "男的", "age": "18"}'
dict = json.loads(str)
print(dict,type(dict)) # {'id': 1, 'sex': '男的', 'age': '18'} <class 'dict'>
print(dict['id'])