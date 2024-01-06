# 顺序执行
```java
public class Main {
    public static void main(String[] args){
        //所有的代码都是从这里开始按顺序执行
    }
}
```

# 变量
## 声明
```
数据类型 变量名
```
eg:
```java
int a;
```
## 赋值
等于号将等于号右边的值赋值给左边的变量
## 数据类型
### 基础数据类型(primitive data type)
| 数据类型 | 名称      | 存储内容       |
|------|---------|------------|
| 整形   | int     | 整数         |
| 浮点   | double  | 小数         |
| 布尔   | boolean | ture/false |

### reference
| 数据类型 | 名称     | 存储内容    |
|------|--------|---------|
| 字符串  | String | 字符串     |
| -    | -      | objects |

## 运算符
| 运算符 | 作用 |
|-----|----|
| +   | 加  |
| -   | 减  |
| *   | 乘  |
| /   | 除  |
| %   | 取余 |

## Compound assignment operators
eg:
```java
a = a + 10;
a += 10;
// 作用相同
```
>+=  
>-=  
>/=  
>*=  
>%=

## 递增/递减
>--  
>++

eg:
```java
i += 1
i++
// 作用相同
```

## 数据类型的转换
整数与整数运算得到的永远是整数  
eg:
```java
public class Main {
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        System.out.println(a/b);
    }
}
```
output: ```2```

* 整数与整数运算输出整数
* 整数与小数运算输出小数

### 数据类型的转换方法  
```(数据类型)```  
eg:
```java
public class Main {
    public static void main(String[] args){
        double a = 2.9;
        System.out.println((int)a);
    }
}
```
output: ```2```