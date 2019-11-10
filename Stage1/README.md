# Vi的学习
## Vi的安装
安装指令：
```bash
   28  sudo apt-get install vim
   29  update-alternatives --display vi
```
## Vi的配置
```bash
sudo vim /etc/vim/vimrc
```
输入用户密码获得配置权限，修改vimrc文件  
```bash
set nu         #左侧行号
set tabstop    #tab 长度设置为4
set autoindent #自动缩进
set ruler      #在右下角显示光标位置的状态行

```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109195451124.png) 
语法高亮  
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109195514377.png)
  
## Vim简单常见指令
|命令|  作用|
|--|--|
|  i| 在光标之前插入 |
|:q  | 退出但不保存 |
|:w | 保存 |
|:wq |  保存并退出|
|dd | 删除光标所在行 |
|u | 撤销操作 |
|gg |  跳到第一行|
|G |跳到最后一行  |

![在这里插入图片描述](https://img-blog.csdnimg.cn/2019110920005585.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1pxejk4Mzk0NA==,size_16,color_FFFFFF,t_70)

# Java学习
## jdk下载安装
```bash
  74  sudo apt-get purge openjdk/openjdk*
  75  sudo apt-get clean/autoclean
  76  tar -zxvf jdk-8u221-linux-i586.tar.gz
  81  sudo mv ./jdk1.8.0_131 /opt/Java
```
这个是在自己的虚拟机上找到的之前下载jdk的history  
配置完环境变量查看版本号，出现下图所示说明jdk安装并配置完成了
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109200521258.png)   
## Java自学
因为之前专选课选过java，虽然有点忘了但看看教程还是可以想起来，接受的比较快一点，总结了一些主要特性  
- 简单：  
Java语言的语法与C语言和C++语言很接近。另一方面，Java丢弃了C++中很少使用的、很难理解的、令人迷惑的那些特性，如操作符重载、多继承、自动的强制类型转换。特别地，Java语言不使用指针，而是引用。并提供了自动的废料收集，不必为内存管理而担忧。
- 面向对象  
Java语言提供类、接口和继承等面向对象的特性，为了简单起见，只支持类之间的单继承，但支持接口之间的多继承，并支持类与接口之间的实现机制（关键字为implements）。Java语言全面支持动态绑定，而C++语言只对虚函数使用动态绑定。总之，Java语言是一个纯的面向对象程序设计语言。
- 健壮性  
Java的强类型机制、异常处理、垃圾的自动收集等是Java程序健壮性的重要保证。对指针的丢弃是Java的明智选择。Java的安全检查机制使得Java更具健壮性。
- 体系结构中立  
Java程序（后缀为java的文件）在Java平台上被编译为体系结构中立的字节码格式（后缀为class的文件），然后可以在实现这个Java平台的任何系统中运行。这种途径适合于异构的网络环境和软件的分发。  
- 可移植  
这种可移植性来源于体系结构中立性，另外，Java还严格规定了各个基本数据类型的长度。Java系统本身也具有很强的可移植性，Java编译器是用Java实现的，Java的运行环境是用ANSI C实现的。
- 动态
Java程序需要的类能够动态地被载入到运行环境，也可以通过网络来载入所需要的类。这也有利于软件的升级。另外，Java中的类有一个运行时刻的表示，能进行运行时刻的类型检查。

## Java GUI
Swing 是一个为Java设计的GUI工具包。  
Swing是JAVA基础类的一部分。   
Swing包括了图形用户界面（GUI）器件如：文本框，按钮，分隔窗格和表。
  
Swing提供许多比AWT更好的屏幕显示元素。它们用纯Java写成，所以同Java本身一样可以跨平台运行，这一点不像AWT。它们是JFC的一部分。它们支持可更换的面板和主题（各种操作系统默认的特有主题），然而不是真的使用原生平台提供的设备，而是仅仅在表面上模仿它们。这意味着你可以在任意平台上使用JAVA支持的任意面板。轻量级组件的缺点则是执行速度较慢，优点就是可以在所有平台上采用统一的行为。

常用类：
- JFrame – java的GUI程序的基本思路是以JFrame为基础，它是屏幕上window的对象，能够最大化、最小化、关闭。

- JPanel – Java图形用户界面(GUI)工具包swing中的面板容器类，包含在javax.swing 包中，可以进行嵌套，功能是对窗体中具有相同逻辑功能的组件进行组合，是一种轻量级容器，可以加入到JFrame窗体中。

- JLabel – JLabel 对象可以显示文本、图像或同时显示二者。可以通过设置垂直和水平对齐方式，指定标签显示区中标签内容在何处对齐。默认情况下，标签在其显示区内垂直居中对齐。默认情况下，只显示文本的标签是开始边对齐；而只显示图像的标签则水平居中对齐。

- JTextField –一个轻量级组件，它允许编辑单行文本。
- JButton – JButton 类的实例。用于创建按钮


## 完成HelloWorld的编译运行
代码：

```java
public class hello {
  public static void main(String args[]) {
    System.out.println("Hello world!");
  }
}
```
编译运行：  
- javac 后面跟着的是java文件的文件名，例如 HelloWorld.java。 该命令用于将 java 源文件编译为 class 字节码文件，如： javac HelloWorld.java。

- 运行javac命令后，如果成功编译没有错误的话，会出现一个 HelloWorld.class 的文件。java 后面跟着的是java文件中的类名,例如 HelloWorld 就是类名，如: java HelloWorld。  
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109201350388.png)

# ant学习
## 认识Ant
Ant是一个将软件编译、测试、部署等步骤联系在一起加以自动化的一个工具，有点类似于C/C++的make，其没有单独的语法，而是通过xml来构建，免去了重新学习的时间,并且比make更好维护一些。从一台服务器移植到另一台服务器有可能只是需要简单修改一下build.xml。
## ant下载安装
[官网](http://ant.apache.org/)下载Ant->Download->Binary Distributions  
由于我的应用都统一放在opt目录，所以我把ant移动到opt目录下，并且修改目录名为ant
```bash
  138  tar -xf apache-ant-1.10.6-bin.tar.gz
  139  sudo mv apache-ant-1.10.6 /opt/

```
配置环境变量后查看版本号  
![在这里插入图片描述](https://img-blog.csdnimg.cn/201911092020244.png)
## ant使用
使用ant进行管理，要在项目内创建一个build.xml文件
代码文件如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project name="HelloWorld" default="run" basedir=".">
  <property name="src" value="src"/>
  <property name="classes" value="classes"/>
  <property name="lib" value="lib"/>

  <target name="init">
  <mkdir dir="${classes}"/>
  <mkdir dir="${lib}"/>
  </target>

  <target name="clean">
    <delete dir="${classes}"/>
    <delete dir="${lib}"/>
  </target>

  <target name="jar" depends="compile">
    <jar jarfile="${lib}/HelloWorld.jar">
      <fileset dir="${classes}"/>
      <manifest>
        <attribute name="Main-class" value="HelloWorld"/>
      </manifest>
    </jar>
  </target>

  <target name="compile" depends="init">
    <javac srcdir="${src}" destdir="${classes}">
     <include name="HelloWorld.java"/>
    </javac>
  </target>

  <target name="run" depends="compile">
    <java classname="HelloWorld" classpath="${classes}"/>
  </target>
 </project>    
  ```
 - project: ant的所有内容都包含在这个里边
-  name是项目的名字
-  basedir是工作的根目录 
 - 代表当前目录
 - default代表默认要做的事情。
- target：任务
	- inti：新建文件夹
	- clean：删除所生成文件
	- jar：打包操作，依赖于compile操作，将生成的jar包放入lib文件夹目录
	- compile：编译.java文件，并把生成的.class文件放进classes文件夹里
	- run：运行.class文件
	- test：测试命令
 - depends：所依赖的target，在执行这个target 例如compile之前ant会先检查init是否曾经被执行过，如果执行过则直接直接执行compile，如果没有则会先执行它依赖的target例如这里的init，然后再执行这个target

```bash
ant run
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109211132448.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1pxejk4Mzk0NA==,size_16,color_FFFFFF,t_70)
  

```bash
ant jar
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109211633788.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1pxejk4Mzk0NA==,size_16,color_FFFFFF,t_70)  
发现HelloWorld.jar已经在lib文件夹下，运行jar包  

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109211939770.png)  
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109212158830.png)  
文件结构：  
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109202432943.png)  
# Junit 学习
## 认识Junit
Junit用于项目的单元测试。对于一个比较大的类而言，编写一个测试类是很麻烦的，因此我们使用Junit。Junit允许程序员使用@Test来描述测试的数据。我们可以使用assertEquals()对输出结果进行判定。如果符合预期输出，则输出true，否则报错。
##  Junit下载安装
从[Junit官网](https://junit.org/junit5/)下载最新版本
我下载的是`hamcrest-core-1.3.jar` 和`junit-4.13-rc-1.jar`
设置环境变量
## Junit使用
修改HelloWorld.java文件

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class HelloWorld {
   @Test
   public void testHello() {
      String str= "Hello Junit";
      assertEquals("Hello Junit",str);
   }
}
```
新建HelloWorldTest.java文件

```java
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class HelloWorldTest {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(HelloWorld.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
} 
```
- @Test :元标记，表明这个函数是一个测试，里面填写要测试的东西，然后使用 assertEquals () 来比对程序运行结果和我们预期的结果。
- 元标记还包括 @ignore（运行后将会忽略这一个测试）、@BeforeClass（一般是预先实例化一个对象）、@AfterClass（释放资源）。
- 编译和运行 测试类 

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109214004694.png)  
如果配置不好环境变量也可以用-classpath路径引用junit-4.13-rc-1  

```bash
  160  javac -classpath .:junit-4.13-rc-1.jar HelloWorld.java HelloWorldTest.java
  162  java -classpath .:junit-4.13-rc-1.jar HelloWorldTest

```

## ant管理Junit测试HelloWorld
在build.xml里新增test target
```xml
<target name="test">
    <javac srcdir="${src}" destdir="${classes}">
      <include name="HelloWorldTest.java"/>
      <include name="HelloWorld.java"/>
    </javac>
    <java  classname="org.junit.runner.JUnitCore" >
    <arg value="HelloWorldTest"/>
    <classpath>
        <pathelement path="${classes}"/>
        <pathelement path="${src}/junit-4.13-rc-1.jar"/>
    </classpath>
    </java>
  </target>
```
测试结果  
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109214946909.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1pxejk4Mzk0NA==,size_16,color_FFFFFF,t_70)

# 上述环境变量的配置

```bash
vi ~/.bashrc
source ~/.bashrc
```

![在这里插入图片描述](https://img-blog.csdnimg.cn/20191109200739904.png)
