# 我的 Python 学习笔记
# 学习Python 的笔记们

1.  # 名词解释们
    line5：第五行
    not defined  未被定义



# 知识点们

2. # 错误类型
表示语法错误 SyntaxError
    缩进错误 IndentationError  表明这里的代码没有顶格。
    无效语法 invalid syntax  说明变量定义出错了。
表示名称错误 NameError，



3. 变量（可以理解为 “容器”） 
   常量 （可以理解为 “往容器里面装的液体”）
   例如
# 把 Downey 赋值给变量 name
   nane = "Downey"      注意：常量 Downey  要用 "" 引号括起来。
# 输出 name 的值 （如果有两次给 变量 name 进行两次赋值，只留下最后一次赋值的东西）
   print(nanme) 

4. 变量可以给变量赋值
name = "Downey"
myName = name   这里的 name 是属于变量，所以被赋值的时候不用像 常量Downey一样，加 "" 引号括起来。
print(myName)

5. 字符串之前的小写字母 f 表示这个字符串需要进行格式化输出。
例
name = "Tony"
print(f"My name is {name}")

name = "Mike"
print(f"My name is {name}")




# 加 减 乘 除 取整 取模 等于
  +  -  *  /  \\   %    =

Tips：取模常被用于判断奇偶性。如果一个数对2取模，结果为0，则是偶数；结果为1，则为奇数。

 # 先乘除 取整取模，后加减 

6. 整型和浮点型
整整为整 ， 浮浮为浮， 一整一浮为浮。
# 整数和整数进行除法运算，结果也是浮点型！！！！

7. # 例题  变量 常量 字符串

将字符串"carbo"赋值给变量word1
将字符串"hydrate"赋值给变量word2
然后使用print()输出word1+word2的结果。

# word1 = "carbo"               错误的 1 word1 = carbo                2 carbo = "word1"
  word2 = "hydrate"                      word2 = hydrate                hydrate = "word2"
  print(word1+word2)               
# 运行结果 carbohydrate










2026.4.21

# —— 判定逻辑
今天在夜曲编程练了一道题，要求判断密码。
## 题1：
将变量password设置为None；

如果password为“yequ”，输出“欢迎来到夜曲”；

如果password为空值或者不为“yequ”，输出“密码不正确”。

### 我的代码实现：
我自己写的代码：
password = None

if password == yequ:
    print("欢迎来到夜曲")
else:
    print("密码不正确")
    
## 问题：
1. 致命伤：漏掉的冒号 (:)
在 Python 里，if 语句就像是在下指令。你写完条件后，必须加一个冒号，告诉电脑：“如果满足这个条件，就去做接下来的事”。

错误：if password == None

正确：if password == None: （注意最后那个冒号）

2. 引号的问题（字符串）
电脑是很笨的。如果你写 yequ，它会以为这是一个变量名（就像 password 一样）；如果你想表示这段具体的文字，必须给它戴上**“引号”**。

错误：if password == yequ:

正确：if password == "yequ":

3. 逻辑逻辑（逻辑嵌套）
题目要求的是：如果密码是 yequ 就欢迎；如果是 None 或者不是 yequ 就报错。
你现在的写法是两个 if 连在一起，这会让电脑很困惑。建议用 if...elif...else 或者把逻辑合并。
下面是我改对之后的代码：

password = None

if password == "yequ":
    print("欢迎来到夜曲")
else:
    print("密码不正确")

### 正确答案：
password = None

if password =="yequ":
    print("欢迎来到夜曲")
if passord ==None or password != "yequ":
    print("密码不正确")





    
