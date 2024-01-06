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
>* ++
>* --

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

# 面向对象
## class(类)
类是一个模板，它描述一类对象的行为和状态。  
## object(对象)
对象是类的一个实例（instance），有状态和行为。  
例如，一条狗是一个对象，它的状态(attributes/属性)有：颜色、名字、品种；行为(method/方法)有：摇尾巴、叫、吃等。

参考 [菜鸟教程](https://www.runoob.com/java/java-object-classes.html)

## 修饰符
访问修饰符
* public: 可以从class外部直接访问
* private： 不可以从class外部直接访问


>* Java的默认访问权限是public
>* AP CSA中，所有的attribute都应该是private的

非访问修饰符
* final: 赋值后无法被改变
* static变量：静态变量, 所有object共享一个变量
* static方法：在不创建object的情况下使用方法
>* 被static修饰后的方法或变量都需要通过class直接调用

## 方法（method/function）
### 声明 
```
修饰符 返回值类型 方法名(){
    //下级代码
}
```
eg:  
```java
public void birthday(){
    age++;
}
```
>* 如果方法不返回数据，返回值类型应声明为void  

### 调用

* 在同一个class内：直接通过方法名调用
* 不在同一个class内：通过object或class（静态方法）调用  
eg:  
``` java
object.method();
```

### 返回数据
使用```return```关键字返回数据  
eg:  
```java
public static boolean is_even(int a){
    return a % 2 == 0;
}
```

## 属性（attribute）
### 声明 
```
修饰符 数据类型 变量名;
```
eg:  
```java
private final String gender;
```
>* AP CSA中，所有的attribute都应该是private的

## 构造器（constructor）
一个用来初始化一个object的method  
特征：
* 不声明返回值类型
* 永远是public
* 名称与class名相同  

eg:  
```java
public Human(String gender, double height, int age, String race){ //constructor(构造器)
    this.gender = gender;
    this.height = height;
    this.age = age;
    this.race = race;
    }
```

### practice：
创建一个Book class  

应该包含属性：
* title
* printed_year
* num_of_pages

应包含方法：
* String get_info() //返回这本书的所有信息

## 字符串
* 将其他数据类型转换为String：String.valueOf(某个变量);
* 使用```+```将不同字符串连接