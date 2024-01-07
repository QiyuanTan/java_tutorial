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

### 运算顺序
* \*, /, %
* +, -

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

### class的声明
```
修饰符 class的名称{
    属性（attribute）1
    属性（attribute）2
    属性（attribute）3
    属性（attribute）4
    构造器constructor(){}
    方法（method）{}1
    方法（method）{}2
    方法（method）{}3
    方法（method）{}4
    方法（method）{}5
}
```
eg: 
```java
public class Dog{
    String breed;
    String size;
    String color;
    int age;
    public Dog(String breed, String size, String color, int age){
        
    }
}
```

## object的声明
```
class名 变量名 = new constructor();
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

## 方法（method/function）
* 一段通用的代码，在一个地方写好之后在其他地方多次调用
* 一个对象具有的方法，用来进行一系列操作
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
```java
//调用is_even()
is_even(5); // 得到false

//使用示例
boolean b = is_even(5); // 得到false并将结果存储进b，此时is_even(5)等于false
System.out.print(is_even(5)); // 得到false并直接打印结果，此时is_even(5)等于false
```

三种method
> accessor: 访问/返回class中的attribute
>> * 没有参数
>> * 返回值类型与要访问的attribute相关

> mutator: 改变class中的attribute
>> * 需要参数
>> * 返回值类型为void

> helper: 复用逻辑，简化代码

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

### practice：
创建一个Book class  

应该包含属性：
* title
* printed_year
* num_of_pages

应包含方法：
* String get_info() //返回这本书的所有信息

在main class中创建一个book object并使用```get_info()```方法打印出它的信息

## 继承（Inheritance）
子类（subclass）  
父类（superclass）

子类继承父类  

声明方式
```java
public class 子类名 extends 父类名{
    // implementation
}
```
### 被继承的：
* 父类当中的所有方法
* 父类当中的所有变量（但private变量无法直接访问）
### 不被继承的
* constructor

## 子类的constructor
* 在没有显性调用调用父类的构造器，会自动隐性调用父类的构造器
* 如果调用父类的构造器```super（）```一定要放在constructor的最前面

## overload(重载)
* 在同一个类中创建多个名称相同但参数不同的方法
* 如果出现名称相同且参数相同（且顺序相同）会报错

## override(重写)
* 在子类当中重写父类的方法


## Math
>* Math.PI = 3.141592653589793;  
>* Math.sqrt(double a)
>* Math.pow(double a, double b)
>* Math.abs(double a)
>* Math.abs(int a)
>* Math.max(x, y)
>* Math.min(x, y)
>* Math.min(x, y)
>* Math.random()

### Math.random()
* 返回一个>=0, <1的一个double

eg: 生成一个[50, 100]的随机数
```java
int rand_number = 50 + (int)(Math.random()*51);
```

## 字符串
* 将其他数据类型转换为String：String.valueOf(某个变量);
* 使用```+```将不同字符串连接