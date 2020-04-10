

# Swing

## 概念

Swing 是一个用于 Java GUI 编程（图形界面设计）的工具包（类库）；换句话说，Java 可以用来开发带界面的 PC 软件，使用到的工具就是 Swing。



## 特点（AWT与其相反）

1.风格统一

2.不依赖操作系统

3.轻量级组件

3.可插入外观组件



## 容器

在 [Swing](http://c.biancheng.net/swing/) 中，任何其他组件都必须位于一个顶层容器中。JFrame 窗口和 JPanel 面板是常用的顶层容器



界面，面板和窗口的区别：从开发的角度讲，界面指的是人机交互的一个画面布局，可以是窗口，也可以是面板。窗口是一个容器，可以容纳面板，而面板不能容纳窗体，但可以由窗体构成。

 



常用语句

1. setTitle("Java 第一个 GUI 程序");    //设置显示窗口标题

2. ​        setSize(400,200);    //设置窗口显示尺寸

3. ​        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭

4. ​        JLabel jl=**new** JLabel("这是使用JFrame类创建的窗口");    //创建一个标签

5. ​        Container c=getContentPane();    //获取当前窗口的内容窗格

6. ​        c.add(jl);    //将标签组件添加到内容窗格上

7. ​        setVisible(**true**);    //设置窗口是否可见

8. setBounds(int x, int y, int width, int height)

   (前两个是组件左上角在容器中的坐标

   后两个是组件的宽度和高度)

9. jp.setBackground(Color.white);    //设置背景色

### JFrame 

### 

- JFrame()：构造一个初始时不可见的新窗体。

- JFrame(String title)：创建一个具有 title 指定标题的不可见新窗体。

  （注意：当创建一个 JFrame 类的实例化对象后，其他组件并不能够直接放到容器上面，需要将组件添加至内容窗格，而不是直接添加至 JFrame 对象。示例代码如下：）

  

对于语句：import java.awt.*;

｛

java.awt,是包含用于创建用户界面和绘制图形图像的所有类。

“.*”的意思就是包里所有的。

这句话意思就是导入awt包里的所有java类。

｝





### JPanel 面板

JPanel 是一种中间层容器，它能容纳组件并将组件组合在一起，但它本身必须添加到其他容器中使用。JPanel 类的构造方法如下。

- JPanel()：使用默认的布局管理器创建新面板，默认的布局管理器为 FlowLayout。
- JPanel(LayoutManagerLayout layout)：创建指定布局管理器的 JPanel 对象。



## 布局管理器

为了加快开发速度，[Java](http://c.biancheng.net/java/) 提供了一些布局管理器，它们可以将组件进行统一管理，这样开发人员就不需要考虑组件是否会重叠等问题。





常用语句

1.frame.setLayout(**new** BorderLayout());   

​     //为Frame窗口设置布局为    BorderLayout

2.JButton button1=**new** JButton ("上");

   //设置按钮（“上”）

3.frame.add(button1,BorderLayout.NORTH);

​    //添加按钮到North区域

4.jPanel.setLayout(**new** FlowLayout(FlowLayout.LEADING,20,20));

​      //向JPanel添加FlowLayout布局管理器，将组件间的横向和纵向间隙都          //  设置为20像素





### 边框布局管理器

BorderLayout（边框布局管理器）是 Window、JFrame 和 JDialog 的默认布局管理器。边框布局管理器将窗口分为 5 个区域：North、South、East、West 和 Center。其中，North 表示北，将占据面板的上方；Soufe 表示南，将占据面板的下方；East表示东，将占据面板的右侧；West 表示西，将占据面板的左侧；中间区域 Center 是在东、南、西、北都填满后剩下的区域

提示：边框布局管理器并不要求所有区域都必须有组件，如果四周的区域（North、South、East 和 West 区域）没有组件，则由 Center 区域去补充。如果单个区域中添加的不只一个组件，那么后来添加的组件将覆盖原来的组件，所以，区域中只显示最后添加的一个组件。







BorderLayout 布局管理器的构造方法如下所示。

- BorderLayout()：创建一个 Border 布局，组件之间没有间隙。
- BorderLayout(int hgap,int vgap)：创建一个 Border 布局，其中 hgap 表示组件之间的横向间隔；vgap 表示组件之间的纵向间隔，单位是像素。





### 流式布局管理器

FlowLayout（流式布局管理器）是 JPanel 和 JApplet 的默认布局管理器。FlowLayout 会将组件按照从上到下、从左到右的放置规律逐行进行定位。与其他布局管理器不同的是，FlowLayout 布局管理器不限制它所管理组件的大小，而是允许它们有自己的最佳大小。





FlowLayout 布局管理器的构造方法如下。

- FlowLayout()：创建一个布局管理器，使用默认的居中对齐方式和默认 5 像素的水平和垂直间隔。
- FlowLayout(int align)：创建一个布局管理器，使用默认 5 像素的水平和垂直间隔。其中，align 表示组件的对齐方式，对齐的值必须是 FlowLayoutLEFT、FlowLayout.RIGHT 和 FlowLayout.CENTER，指定组件在这一行的位置是居左对齐、居右对齐或居中对齐。
- FlowLayout(int align, int hgap,int vgap)：创建一个布局管理器，其中 align 表示组件的对齐方式；hgap 表示组件之间的横向间隔；vgap 表示组件之间的纵向间隔，单位是像素。





### 卡片布局管理器

CardLayout（卡片布局管理器）能够帮助用户实现多个成员共享同一个显不空间，并且一次只显示一个容器组件的内容。

CardLayout 布局管理器将容器分成许多层，每层的显示空间占据整个容器的大小，但是每层只允许放置一个组件。CardLayout 的构造方法如下。

- CardLayout()：构造一个新布局，默认间隔为 0。
- CardLayout(int hgap, int vgap)：创建布局管理器，并指定组件间的水平间隔（hgap）和垂直间隔（vgap）。



## 事件监听

事件表示程序和用户之间的交互，例如在文本框中输入，在列表框或组合框中选择，选中复选框和单选框，单击按钮等。事件处理表示程序对事件的响应，对用户的交互或者说对事件的处理是事件处理程序完成的。

当事件发生时，系统会自动捕捉这一事件，创建表示动作的事件对象并把它们分派给程序内的事件处理程序代码。这种代码确定了如何处理此事件以使用户得到相应的回答。





### 事件处理模型

放置各种组件，使图形界面更加丰富多彩，但是还不能响应用户的任何操作。若使图形界面能够接收用户的操作，必须给各个组件加上事件处理机制。在事件处理的过程中，主要涉及三类对象。

- Event（事件）：用户对组件的一次操作称为一个事件，以类的形式出现。例如，键盘操作对应的事件类是 KeyEvent。
- Event Source（事件源）：事件发生的场所，通常就是各个组件，例如按钮 Button。
- Event Handler（事件处理者）：接收事件对象并对其进行处理的对象事件处理器，通常就是某个 [Java](http://c.biancheng.net/java/) 类中负责处理事件的成员方法。

例如，如果鼠标单击了按钮对象 Button，则该按钮 Button 就是事件源，而 Java 运行时系统会生成 ActionEvent 类的对象 ActionEvent，该对象中描述了单击事件发生时的一些信息。之后，事件处理者对象将接收由 Java 运行时系统传递过来的事件对象 ActionEvent，并进行相应的处理。

由于同一个事件源上可能发生多种事件，因此，Java 采取了授权模型（Delegation Model），事件源可以把在其自身上所有可能发生的事件分别授权给不同的事件处理者来处理。例如，在 Panel 对象上既可能发生鼠标事件，也可能发生键盘事件，该 Panel 对象可以授权给事件处理者 a 来处理鼠标事件，同时授权给事件处理者 b 来处理键盘事件。

有时也将事件处理者称为监听器，主要原因在于监听器时刻监听事件源上所有发生的事件类型，一旦该事件类型与自己所负责处理的事件类型一致，就马上进行处理。授权模型把事件的处理委托给外部的处理实体进行处理，实现了将事件源和监听器分开的机制。

事件处理者（监听器）通常是一个类，该类如果能够处理某种类型的事件，就必须实现与该事件类型相对的接口。例如，一个 ButtonHandler 类之所以能够处理 ActionEvent 事件，原因在于它实现了与 ActionEvent 事件对应的接口 ActionListener。每个事件类都有一个与之相对应的接口。



### 动作事件监听器

动作事件监听器是 [Swing](http://c.biancheng.net/swing/) 中比较常用的事件监听器，很多组件的动作都会使用它监听，像按钮被里击、列表框中选择一项等。与动作事件监听器有关的信息如下。

- 事件名称：ActionEvent。
- 事件监听接口: ActionListener。
- 事件相关方法：addActionListener() 添加监听，removeActionListener() 删除监听。
- 涉及事件源：JButton、JList、JTextField 等。











实例：（使用 CardLayout 类对容器内的两个面板进行布局。其中第一个面板上包括三个按钮，第二个面板上包括三个文本框。最后调用 CardLayout 类的 show() 方法显示指定面板的内容）

1. ```java
   1. import javax.swing.JButton;
   2. import javax.swing.JFrame;
   3. import javax.swing.JLabel;
   4. import javax.swing.JPanel;
   5. import javax.swing.JTextField;
   6. import java.awt.*;
   7. **public** **class** CardLayoutDemo
   8. {   
   9. ​    **public** **static** void main(String[] agrs)
   10. ​    {
   11. ​        JFrame frame=**new** JFrame("Java第五个程序");  
   12. //创建Frame窗口
   13. ​        JPanel p1=**new** JPanel();    //面板1
   14. ​        JPanel p2=**new** JPanel();    //面板2
   15. ​        JPanel cards=**new** JPanel(**new** CardLayout()); 
   16. //卡片式布局的面板
   17. ​        p1.add(**new** JButton("登录按钮"));
   18. ​        p1.add(**new** JButton("注册按钮"));
   19. ​        p1.add(**new** JButton("找回密码按钮"));
   20. ​        p2.add(**new** JTextField("用户名文本框",20));
   21. ​        p2.add(**new** JTextField("密码文本框",20));
   22. ​        p2.add(**new** JTextField("验证码文本框",20));
   23. ​        cards.add(p1,"card1");    //向卡片式布局面板中添加面板1
   24. ​        cards.add(p2,"card2");    //向卡片式布局面板中添加面板2
   25. ​        CardLayout cl=(CardLayout)(cards.getLayout());
   26. ​        cl.show(cards,"card1");    //调用show()方法显示面板2
   27. ​        frame.add(cards);
   28. ​        frame.setBounds(300,200,400,200);
   29. ​        frame.setVisible(**true**);
   30. ​        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   31. ​    }
   32. }
   ```

   

（上述代码创建了一个卡片式布局的面板 cards，该面板包含两个大小相同的子面板 p1 和 p2。需要注意的是，在将 p1 和 p2 添加到 cards 面板中时使用了含有两个参数的 add() 方法，该方法的第二个参数用来标识子面板。当需要显示某一个面板时，只需要调用卡片式布局管理器的 show() 方法，并在参数中指定子面板所对应的字符串即可）















# MySQL





## 登录

1.输入mysql -h localhost -u root -p后回车(配置好环境变量后)

2.再输入密码

也可以通过客户端启动







## 注释

单行注释：#注释文字

单行注释：-- 注释文字（注意--后面还有一个空格）

多行注释：跟Java一样





## 创建数据库

在 [MySQL](http://c.biancheng.net/mysql/) 中，可以使用 **CREATE DATABASE** 语句创建数据库，语法格式如下：

CREATE DATABASE [IF NOT EXISTS] <数据库名>
[[DEFAULT] CHARACTER SET <字符集名>] 
[[DEFAULT] COLLATE <校对规则名>];

`[ ]`中的内容是可选的。语法说明如下：

- <数据库名>：创建数据库的名称。MySQL 的数据存储区将以目录方式表示 MySQL 数据库，因此数据库名称必须符合操作系统的文件夹命名规则，不能以数字开头，尽量要有实际意义。注意在 MySQL 中不区分大小写。
- IF NOT EXISTS：在创建数据库之前进行判断，只有该数据库目前尚不存在时才能执行操作。此选项可以用来避免数据库已经存在而重复创建的错误。
- [DEFAULT] CHARACTER SET：指定数据库的字符集。指定字符集的目的是为了避免在数据库中存储的数据出现乱码的情况。如果在创建数据库时不指定字符集，那么就使用系统的默认字符集。
- [DEFAULT] COLLATE：指定字符集的默认校对规则。

> MySQL 的字符集（CHARACTER）和校对规则（COLLATION）是两个不同的概念。字符集是用来定义 MySQL 存储字符串的方式，校对规则定义了比较字符串的方式。后面我们会单独讲解 MySQL 的字符集和校对规则。



注意：语句的结尾记得加分号



#### 实例1：最简单的创建 MySQL 数据库的语句

在 MySQL 中创建一个名为 test_db 的数据库。在 MySQL 命令行客户端输入 SQL 语句`CREATE DATABASE test_db;`即可创建一个数据库，输入的 SQL 语句与执行结果如下。

mysql> CREATE DATABASE test_db;
Query OK, 1 row affected (0.12 sec);

“Query OK, 1 row affected (0.12 sec);”提示中，“Query OK”表示上面的命令执行成功，“1 row affected”表示操作只影响了数据库中一行的记录，“0.12 sec”则记录了操作执行的时间。

若再次输入`CREATE DATABASE test_db;`语句，则系统会给出错误提示信息，如下所示：

mysql> CREATE DATABASE test_db;
ERROR 1007 (HY000): Can't create database 'test_db'; database exists

提示不能创建“test_db”数据库，数据库已存在。MySQL 不允许在同一系统下创建两个相同名称的数据库。

可以加上`IF NOT EXISTS`从句，就可以避免类似错误，如下所示：

mysql> CREATE DATABASE IF NOT EXISTS test_db;
Query OK, 1 row affected (0.12 sec)





#### 实例2：创建 MySQL 数据库时指定字符集和校对规则

使用 MySQL 命令行工具创建一个测试数据库，命名为 test_db_char，指定其默认字符集为 utf8，默认校对规则为 utf8_chinese_ci（简体中文，不区分大小写），输入的 SQL 语句与执行结果如下所示：

mysql> CREATE DATABASE IF NOT EXISTS test_db_char
  -> DEFAULT CHARACTER SET utf8
  -> DEFAULT COLLATE utf8_chinese_ci;
Query OK, 1 row affected (0.03 sec)

这时，可以使用`SHOW CREATE DATABASE`查看 test_db_char 数据库的定义声明，发现该数据库的指定字符集为 utf8，运行结果如下所示：

mysql> SHOW CREATE DATABASE test_db_char;
+--------------+-----------------------------------------------------+
| Database     | Create Database                                     |
+--------------+-----------------------------------------------------+
| test_db_char | CREATE DATABASE `test_db_char` /*!40100 DEFAULT CHARACTER SET utf8 */ |
+--------------+-----------------------------------------------------+
1 row in set (0.00 sec)

“1 row in set (0.00 sec)”表示集合中有 1 行信息，处理时间为 0.00秒。时间为 0.00 秒并不代表没有花费时间，而是时间非常短，小于 0.01 秒。







## 查看数据库

数据库可以看作是一个专门存储数据对象的容器，每一个数据库都有唯一的名称，并且数据库的名称都是有实际意义的，这样就可以清晰的看出每个数据库用来存放什么数据。在 [MySQL](http://c.biancheng.net/mysql/) 数据库中存在系统数据库和自定义数据库，系统数据库是在安装 MySQL 后系统自带的数据库，自定义数据库是由用户定义创建的数据库。

在 MySQL 中，可使用 **SHOW DATABASES** 语句来查看或显示当前用户权限范围以内的数据库。查看数据库的语法格式为：

SHOW DATABASES [LIKE '数据库名'];

语法说明如下：

- LIKE 从句是可选项，用于匹配指定的数据库名称。LIKE 从句可以部分匹配，也可以完全匹配。
- 数据库名由单引号`' '`包围。



## 修改数据库

在 [MySQL](http://c.biancheng.net/mysql/) 数据库中只能对数据库使用的字符集和校对规则进行修改，数据库的这些特性都储存在 db.opt 文件中

在 MySQL 中，可以使用 **ALTER DATABASE** 来修改已经被创建或者存在的数据库的相关参数。修改数据库的语法格式为：

```
ALTER DATABASE [数据库名] { 
[ DEFAULT ] CHARACTER SET <字符集名> |
[ DEFAULT ] COLLATE <校对规则名>}
```

语法说明如下：

- ALTER DATABASE 用于更改数据库的全局特性。
- 使用 ALTER DATABASE 需要获得数据库 ALTER 权限。
- 数据库名称可以忽略，此时语句对应于默认数据库。
- CHARACTER SET 子句用于更改默认的数据库字符集。







## 删除数据库

在 [MySQL](http://c.biancheng.net/mysql/) 中，当需要删除已创建的数据库时，可以使用 **DROP DATABASE** 语句。其语法格式为：

DROP DATABASE [ IF EXISTS ] <数据库名>

语法说明如下：

- <数据库名>：指定要删除的数据库名。
- IF EXISTS：用于防止当数据库不存在时发生错误。
- DROP DATABASE：删除数据库中的所有表格并同时删除数据库。使用此语句时要非常小心，以免错误删除。如果要使用 DROP DATABASE，需要获得数据库 DROP 权限。


注意：MySQL 安装后，系统会自动创建名为 information_schema 和 mysql 的两个系统数据库，系统数据库存放一些和数据库相关的信息，如果删除了这两个数据库，MySQL 将不能正常工作。







## 选择数据库

USE <数据库名>

该语句可以通知 MySQL 把`<数据库名>`所指示的数据库作为当前数据库。该数据库保持为默认数据库，直到语段的结尾，或者直到遇见一个不同的 USE 语句。

只有使用 USE 语句来指定某个数据库作为当前数据库之后，才能对该数据库及其存储的数据对象执行操作。







## 查看数据表

查看当前库的所有表:show tables;

查看其他库的所有表：show tables from 库名；







## 创建数据表

在 [MySQL](http://c.biancheng.net/mysql/) 中，可以使用 **CREATE TABLE** 语句创建表。其语法格式为：

CREATE TABLE <表名> ([表定义选项])[表选项][分区选项];

其中，`[表定义选项]`的格式为：

<列名1> <类型1> [,…] <列名n> <类型n>



CREATE TABLE 语句的主要语法及使用说明如下：

- CREATE TABLE：用于创建给定名称的表，必须拥有表CREATE的权限。
- <表名>：指定要创建表的名称，在 CREATE TABLE 之后给出，必须符合标识符命名规则。表名称被指定为 db_name.tbl_name，以便在特定的数据库中创建表。无论是否有当前数据库，都可以通过这种方式创建。在当前数据库中创建表时，可以省略 db-name。如果使用加引号的识别名，则应对数据库和表名称分别加引号。例如，'mydb'.'mytbl' 是合法的，但 'mydb.mytbl' 不合法。
- <表定义选项>：表创建定义，由列名（col_name）、列的定义（column_definition）以及可能的空值说明、完整性约束或表索引组成。
- 默认的情况是，表被创建到当前的数据库中。若表已存在、没有当前数据库或者数据库不存在，则会出现错误。

> 提示：使用 CREATE TABLE 创建表时，必须指定以下信息：
>
> - 要创建的表的名称不区分大小写，不能使用SQL语言中的关键字，如DROP、ALTER、INSERT等。
> - 数据表中每个列（字段）的名称和数据类型，如果创建多个列，要用逗号隔开。



数据表属于数据库，在创建数据表之前，应使用语句“USE<数据库>”指定操作在哪个数据库中进行，如果没有选择数据库，就会抛出 No database selected 的错误。



【实例 1】创建员工表 tb_emp1，结构如下表所示。



| 字段名称 | 数据类型    | 备注         |
| -------- | ----------- | ------------ |
| id       | INT(ll)     | 员工编号     |
| name     | VARCHAR(25) | 员工名称     |
| deptld   | INT(ll)     | 所在部门编号 |
| salary   | FLOAT       | 工资         |


选择创建表的数据库 test_db，创建 tb_emp1 数据表，输入的 SQL 语句和运行结果如下所示。

```
mysql> USE test_db;
Database changed
mysql> CREATE TABLE tb_emp1
    -> (
    -> id INT(11),
    -> name VARCHAR(25),
    -> deptId INT(11),
    -> salary FLOAT
    -> );
Query OK, 0 rows affected (0.37 sec)
```

语句执行后，便创建了一个名称为 tb_emp1 的数据表，使用 SHOW TABLES；语句查看数据表是否创建成功，如下所示。

```
mysql> SHOW TABLES;
+--------------------+
| Tables_in_test_db  |
+--------------------+
| tb_emp1            |
+--------------------+
1 rows in set (0.00 sec)
```







## 查看表结构

在 MySQL 中，使用 SQL 语句创建好数据表之后，可以查看结构的定义，以确认表的定义是否正确。在 MySQL 中，查看表结构可以使用 DESCRIBE 和 SHOW CREATE TABLE 语句。

DESCRIBE/DESC 语句可以查看表的字段信息，包括字段名、字段数据类型、是否为主键、是否有默认值等，语法规则如下：

DESCRIBE <表名>;

或简写成：

DESC <表名>;

【实例 2】使用 DESCRIBE 查看表 tb_emp1 的结构，输入的 SQL 语句和运行结果如下所示。

```
mysql> DESCRIBE tb_emp1;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| id     | int(11)     | YES  |     | NULL    |       |
| name   | varchar(25) | YES  |     | NULL    |       |
| deptId | int(11)     | YES  |     | NULL    |       |
| salary | float        | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
4 rows in set (0.14 sec)
```

其中，各个字段的含义如下：

- Null：表示该列是否可以存储 NULL 值。
- Key：表示该列是否已编制索引。PRI 表示该列是表主键的一部分，UNI 表示该列是 UNIQUE 索引的一部分，MUL 表示在列中某个给定值允许出现多次。
- Default：表示该列是否有默认值，如果有，值是多少。
- Extra：表示可以获取的与给定列有关的附加信息，如 AUTO_INCREMENT 等。





## 显示创建表时所用的语句

SHOW CREATE TABLE语句可以用来显示创建表时的CREATE TABLE语句，语法格式如下：

```
SHOW CREATE TABLE <表名>\G；
```

提示：使用 SHOW CREATE TABLE 语句不仅可以查看创建表时的详细语句，而且可以查看存储引擎和字符编码。如果不加“\G”参数，显示的结果可能非常混乱，加上“\G”参数之后，可使显示的结果更加直观，易于查看。







## 修改数据表

在 [MySQL](http://c.biancheng.net/mysql/) 中可以使用 **ALTER TABLE** 语句来改变原有表的结构，例如增加或删减列、创建或取消索引、更改原有列类型、重新命名列或表等。





### 字段

在数据库中，大多数时，表的“列”称为“字段” ，每个字段包含某一专题的信息。就像“通讯录”数据库中，“姓名”、“联系电话”这些都是表中所有行共有的属性，所以把这些列称为“姓名”字段和“联系电话”字段。

### 添加字段

随着业务的变化，可能需要在已经存在的表中添加新的字段，一个完整的字段包括字段名、数据类型、完整性约束。添加字段的语法格式如下：

ALTER TABLE <表名> ADD <新字段名> <数据类型> [约束条件] [FIRST|AFTER 已存在的字段名]；

`新字段名`为需要添加的字段的名称；`FIRST` 为可选参数，其作用是将新添加的字段设置为表的第一个字段；`AFTER` 为可选参数，其作用是将新添加的字段添加到指定的`已存在的字段名`的后面。

提示：“FIRST 或 AFTER 已存在的字段名”用于指定新增字段在表中的位置，如果 SQL 语句中没有这两个参数，则默认将新添加的字段设置为数据表的最后列。



### 修改字段数据类型

修改字段的数据类型就是把字段的数据类型转换成另一种数据类型。在 MySQL 中修改字段数据类型的语法规则如下：

```
ALTER TABLE <表名> MODIFY <字段名> <数据类型>
```

其中，`表名`指要修改数据类型的字段所在表的名称，`字段名`指需要修改的字段，`数据类型`指修改后字段的新数据类型。





### 删除字段

删除字段是将数据表中的某个字段从表中移除，语法格式如下：

ALTER TABLE <表名> DROP <字段名>；

其中，`字段名`指需要从表中删除的字段的名称。





### 修改字段名称

MySQL 中修改表字段名的语法规则如下：

ALTER TABLE <表名> CHANGE <旧字段名> <新字段名> <新数据类型>；

其中，`旧字段名`指修改前的字段名；`新字段名`指修改后的字段名；`新数据类型`指修改后的数据类型，如果不需要修改字段的数据类型，可以将新数据类型设置成与原来一样，但数据类型不能为空。

### 修改表名

MySQL 通过 ALTER TABLE 语句来实现表名的修改，语法规则如下：

ALTER TABLE <旧表名> RENAME [TO] <新表名>；

其中，`TO` 为可选参数，使用与否均不影响结果。



## 删除数据表

使用 **DROP TABLE** 语句可以删除一个或多个数据表，语法格式如下：

DROP TABLE [IF EXISTS] 表名1 [ ,表名2, 表名3 ...]

对语法格式的说明如下：

- `表名1, 表名2, 表名3 ...`表示要被删除的数据表的名称。DROP TABLE 可以同时删除多个表，只要将表名依次写在后面，相互之间用逗号隔开即可。
- IF EXISTS 用于在删除数据表之前判断该表是否存在。如果不加 IF EXISTS，当数据表不存在时 MySQL 将提示错误，中断 SQL 语句的执行；加上 IF EXISTS 后，当数据表不存在时 SQL 语句可以顺利执行，但是会发出警告（warning）。


两点注意：

- 用户必须拥有执行 DROP TABLE 命令的权限，否则数据表不会被删除。
- 表被删除时，用户在该表上的权限不会自动删除。



## 查询数据表

### 查询表中所有字段

查询所有字段是指查询表中所有字段的数据。MySQL 提供了以下 2 种方式查询表中的所有字段。

- 使用“*”通配符查询所有字段
- 列出表的所有字段

使用“*”查询表的所有字段

SELECT 可以使用“*”查找表中所有字段的数据，语法格式如下：

SELECT * FROM 表名;

使用“*”查询时，只能按照数据表中字段的顺序进行排列，不能改变字段的排列顺序。

### 查询表中指定的字段

查询表中的某一个字段的语法格式为：

SELECT < 列名 > FROM < 表名 >;





使用 SELECT 声明可以获取多个字段下的数据，只需要在关键字 SELECT 后面指定要查找的字段名称，不同字段名称之间用逗号“，”分隔开，最后一个字段后面不需要加逗号，语法格式如下：

SELECT <字段名1>,<字段名2>,…,<字段名n> FROM <表名>;

### 使用 LIKE 的模糊查询

字符串匹配的语法格式如下：

<表达式1> [NOT] LIKE <表达式2>

字符串匹配是一种模式匹配，使用运算符 LIKE 设置过滤条件，过滤条件使用通配符进行匹配运算，而不是判断是否相等进行比较。

相互间进行匹配运算的对象可以是 CHAR、VARCHAR、TEXT、DATETIME 等数据类型。运算返回的结果是 TRUE 或 FALSE。

利用通配符可以在不完全确定比较值的情形下创建一个比较特定数据的搜索模式，并置于关键字 LIKE 之后。可以在搜索模式的任意位置使用通配符，并且可以使用多个通配符。MySQL 支持的通配符有以下两种：

#### 1) 百分号（%）

百分号是 MySQL 中常用的一种通配符，在过滤条件中，百分号可以表示任何字符串，并且该字符串可以出现任意次。

使用百分号通配符要注意以下几点：

- MySQL 默认是不区分大小写的，若要区分大小写，则需要更换字符集的校对规则。
- 百分号不匹配空值。
- 百分号可以代表搜索模式中给定位置的 0 个、1 个或多个字符。
- 尾空格可能会干扰通配符的匹配，一般可以在搜索模式的最后附加一个百分号。

#### 2) 下划线（_）

下划线通配符和百分号通配符的用途一样，下画线只匹配单个字符，而不是多个字符，也不是 0 个字符。

> 注意：不要过度使用通配符，对通配符检索的处理一般会比其他检索方式花费更长的时间。





### 正则表达式查询

例如，从一个文件中提取电话号码，查找一篇文章中重复的单词或替换用户输入的敏感语汇等，这些地方都可以使用正则表达式。正则表达式强大而且灵活，常用于复杂的查询。

MySQL 中使用 REGEXP 关键字指定正则表达式的字符匹配模式，下表列出了 REGEXP 操作符中常用的匹配列表。



| 选项         | 说明                                  | 例子                                        | 匹配值示例                  |
| ------------ | ------------------------------------- | ------------------------------------------- | --------------------------- |
| ^            | 匹配文本的开始字符                    | '^b' 匹配以字母 b 开头 的字符串             | book、big、banana、 bike    |
| $            | 匹配文本的结束字符                    | 'st$’ 匹配以 st 结尾的字 符串               | test、resist、persist       |
| .            | 匹配任何单个字符                      | 'b.t’ 匹配任何 b 和 t 之间有一个字符        | bit、bat、but、bite         |
| *            | 匹配零个或多个在它前面的字 符         | 'f*n’ 匹配字符 n 前面有 任意个字符 f        | fn、fan、faan、abcn         |
| +            | 匹配前面的字符 1 次或多次             | 'ba+’ 匹配以 b 开头，后 面至少紧跟一个 a    | ba、bay、bare、battle       |
| <字符串>     | 匹配包含指定字符的文本                | 'fa’                                        | fan、afa、faad              |
| [字符集合]   | 匹配字符集合中的任何一个字 符         | '[xz]'匹配 x 或者 z                         | dizzy、zebra、x-ray、 extra |
| [^]          | 匹配不在括号中的任何字符              | '[^abc]’ 匹配任何不包 含 a、b 或 c 的字符串 | desk、fox、f8ke             |
| 字符串{n,}   | 匹配前面的字符串至少 n 次             | b{2} 匹配 2 个或更多 的 b                   | bbb、 bbbb、 bbbbbbb        |
| 字符串 {n,m} | 匹配前面的字符串至少 n 次， 至多 m 次 | b{2,4} 匹配最少 2 个， 最多 4 个 b          | bbb、 bbbb                  |

#### 查询以特定字符或字符串开头的记录

字符“^”匹配以特定字符或者字符串开头的文本。

#### 查询以特定字符或字符串结尾的记录

字符“$”匹配以特定字符或者字符串结尾的文本。

#### 用符号“.”代替字符串中的任意一个字符

【实例 5】在 tb_departments 表中，查询 dept_name 字段值包含字母“o”与字母“y”，且两个字母之间只有一个字母的记录，输入的 SQL 语句和执行结果如下所示。

```
mysql> SELECT * FROM tb_departments
    -> WHERE dept_name REGEXP 'o.y';
+---------+-----------+-----------+-----------+
| dept_id | dept_name | dept_call | dept_type |
+---------+-----------+-----------+-----------+
|       4 | Economy   | 44444     | B         |
|       5 | History   | 55555     | B         |
+---------+-----------+-----------+-----------+
2 rows in set (0.00 sec)
```

查询语句中“o.y”指定匹配字符中要有字母 o 和 y，且两个字母之间包含单个字符，并不限定匹配的字符的位置和所在查询字符串的总长度，因此 Economy 和 History 都符合匹配条件。

#### 使用“*”和“+”来匹配多个字符

星号“*”匹配前面的字符任意多次，包括 0 次。加号“+”匹配前面的字符至少一次。

【实例 6】在 tb_departments 表中，查询 dept_name 字段值包含字母“C”，且“C”后面出现字母“h”的记录，输入的 SQL 语句和执行结果如下所示。

```
mysql> SELECT * FROM tb_departments
    -> WHERE dept_name REGEXP '^Ch*';
+---------+-----------+-----------+-----------+
| dept_id | dept_name | dept_call | dept_type |
+---------+-----------+-----------+-----------+
|       1 | Computer  | 11111     | A         |
|       3 | Chinese   | 33333     | B         |
+---------+-----------+-----------+-----------+
2 rows in set (0.00 sec)
```

星号“*”可以匹配任意多个字符，Computer 中字母 C 后面并没有出现字母 h，但是也满足匹配条件。

#### 匹配指定字符串

正则表达式可以匹配指定字符串，只要这个字符串在查询文本中即可，若要匹配多个字符串，则多个字符串之间使用分隔符“|”隔开。

#### 匹配指定字符串中的任意一个

方括号“[]”指定一个字符集合，只匹配其中任何一个字符，即为所查找的文本。

#### 匹配指定字符以外的字符

“[^字符集合]”匹配不在指定集合中的任何字符。

## 插入数据

数据库与表创建成功以后，需要向数据库的表中插入数据。在 [MySQL](http://c.biancheng.net/mysql/) 中可以使用 INSERT 语句向数据库已有的表中插入一行或者多行元组数据。

基本语法

INSERT 语句有两种语法形式，分别是 INSERT…VALUES 语句和 INSERT…SET 语句。

#### 1) INSERT…VALUES语句

INSERT VALUES 的语法格式为：

INSERT INTO <表名> [ <列名1> [ , … <列名n>] ]
VALUES (值1) [… , (值n) ];

语法说明如下。

- `<表名>`：指定被操作的表名。
- `<列名>`：指定需要插入数据的列名。若向表中的所有列插入数据，则全部的列名均可以省略，直接采用 INSERT<表名>VALUES(…) 即可。
- `VALUES` 或 `VALUE` 子句：该子句包含要插入的数据清单。数据清单中数据的顺序要和列的顺序相对应。

#### 2) INSERT…SET语句

语法格式为：

INSERT INTO <表名>
SET <列名1> = <值1>,
    <列名2> = <值2>,
    …

此语句用于直接给表中的某些列指定对应的列值，即要插入的数据的列名在 SET 子句中指定，col_name 为指定的列名，等号后面为指定的数据，而对于未指定的列，列值会指定为该列的默认值。

由 INSERT 语句的两种形式可以看出：

- 使用 INSERT…VALUES 语句可以向表中插入一行数据，也可以插入多行数据；
- 使用 INSERT…SET 语句可以指定插入行中每列的值，也可以指定部分列的值；
- INSERT…SELECT 语句向表中插入其他表的数据。
- 采用 INSERT…SET 语句可以向表中插入部分列的值，这种方式更为灵活；
- INSERT…VALUES 语句可以一次插入多条数据。


在 MySQL 中，用单条 INSERT 语句处理多个插入要比使用多条 INSERT 语句更快。

当使用单条 INSERT 语句插入多行数据的时候，只需要将每行数据用圆括号括起来即可。

## 修改数据

UPDATE 语句的基本语法

使用 UPDATE 语句修改单个表，语法格式为：

UPDATE <表名> SET 字段 1=值 1 [,字段 2=值 2… ] [WHERE 子句 ]
[ORDER BY 子句] [LIMIT 子句]

语法说明如下：

- `<表名>`：用于指定要更新的表名称。
- `SET` 子句：用于指定表中要修改的列名及其列值。其中，每个指定的列值可以是表达式，也可以是该列对应的默认值。如果指定的是默认值，可用关键字 DEFAULT 表示列值。
- `WHERE` 子句：可选项。用于限定表中要修改的行。若不指定，则修改表中所有的行。
- `ORDER BY` 子句：可选项。用于限定表中的行被修改的次序。
- `LIMIT` 子句：可选项。用于限定被修改的行数。

> 注意：修改一行数据的多个列值时，SET 子句的每个值用逗号分开即可。

## 删除数据

在 [MySQL](http://c.biancheng.net/mysql/) 中，可以使用 DELETE 语句来删除表的一行或者多行数据。

### 删除单个表中的数据

使用 DELETE 语句从单个表中删除数据，语法格式为：

DELETE FROM <表名> [WHERE 子句] [ORDER BY 子句] [LIMIT 子句]

语法说明如下：

- `<表名>`：指定要删除数据的表名。
- `ORDER BY` 子句：可选项。表示删除时，表中各行将按照子句中指定的顺序进行删除。
- `WHERE` 子句：可选项。表示为删除操作限定删除条件，若省略该子句，则代表删除该表中的所有行。
- `LIMIT` 子句：可选项。用于告知服务器在控制命令被返回到客户端前被删除行的最大值。


注意：在不使用 WHERE 条件的时候，将删除所有数据。

### 删除表中的全部数据

【实例 1】删除 tb_courses_new 表中的全部数据，输入的 SQL 语句和执行结果如下所示。

```
mysql> DELETE FROM tb_courses_new;
Query OK, 3 rows affected (0.12 sec)
mysql> SELECT * FROM tb_courses_new;
Empty set (0.00 sec)
```

### 根据条件删除表中的数据

【实例 2】在 tb_courses_new 表中，删除 course_id 为 4 的记录，输入的 SQL 语句和执行结果如下所示。

```
mysql> DELETE FROM tb_courses
    -> WHERE course_id=4;
Query OK, 1 row affected (0.00 sec)
mysql> SELECT * FROM tb_courses;
+-----------+-------------+--------------+------------------+
| course_id | course_name | course_grade | course_info      |
+-----------+-------------+--------------+------------------+
|         1 | Network     |            3 | Computer Network |
|         2 | Database    |            3 | MySQL            |
|         3 | Java        |            4 | Java EE          |
+-----------+-------------+--------------+------------------+
3 rows in set (0.00 sec)
```

由运行结果可以看出，course_id 为 4 的记录已经被删除。

## 数据库设计范式

什么是范式：简言之就是，数据库设计对数据的存储性能，还有开发人员对数据的操作都有莫大的关系。所以建立科学的，规范的的数据库是需要满足一些

规范的来优化数据数据存储方式。在关系型数据库中这些规范就可以称为范式。

什么是三大范式：

第一范式：当关系模式R的所有属性都不能在分解为更基本的数据单位时，称R是满足第一范式的，简记为1NF。满足第一范式是关系模式规范化的最低要

求，否则，将有很多基本操作在这样的关系模式中实现不了。

第二范式：如果关系模式R满足第一范式，并且R得所有非主属性都完全依赖于R的每一个候选关键属性，称R满足第二范式，简记为2NF。

第三范式：设R是一个满足第一范式条件的关系模式，X是R的任意属性集，如果X非传递依赖于R的任意一个候选关键字，称R满足第三范式，简记为3NF.

**注：**关系实质上是一张二维表，其中每一行是一个元组，每一列是一个属性



### **第一范式**

  1、每一列属性都是不可再分的属性值，确保每一列的原子性

 

  2、两列的属性相近或相似或一样，尽量合并属性一样的列，确保不产生冗余数据。



### **第二范式**

 

每一行的数据只能与其中一列相关，即一行数据只做一件事。只要数据列中出现数据重复，就要把表拆分开来。

### **第三范式**

 数据不能存在传递关系，即没个属性都跟主键有直接关系而不是间接关系。像：a-->b-->c  属性之间含有这样的关系，是不符合第三范式的。

比如Student表（学号，姓名，年龄，性别，所在院校，院校地址，院校电话）

这样一个表结构，就存在上述关系。 学号--> 所在院校 --> (院校地址，院校电话)

这样的表结构，我们应该拆开来，如下。

（学号，姓名，年龄，性别，所在院校）--（所在院校，院校地址，院校电话）

# JDBC

即使用Java去操作数据库





数据持久化：将数据存储在内存中，关闭程序会造成数据丢失，需要将数据存储在持久化介质中



数据库驱动：用来连接数据库，对数据库进行增删改查操作



CRUD：即增删改查



## 连接数据库的步骤

JDBC编程步骤：

#### （1）加载数据库驱动，通过使用Class类的forName()静态方法来加载驱动。

Class.forName(driverClass)
加载MySQL的驱动：Class.forName(“com.mysql.jdbc.Driver”)
加载Oracle的驱动：Class.forName(“cracle.jdbc.driver.OracleDriver”)

#### （2）通过DriverManager获取数据库连接。

DriverManager.getConnection(String url,String user,String pass);
三个参数：数据库url, 登陆数据库的用户名和密码，
数据库url通常写法：
jdbc : subprotocol : other stuff
subprotocol :连接到特定数据库的驱动
连接到MySQL数据库的URL写法：
jdbc : mysql ： //hostname : port/databasename
连接到Oracle数据库的URL写法：
jdbc : oracle : thin : @hostname : port : databasename

#### (3) 通过Connection 对象创建Statement对象。

createStatement():创建基本的Statement对象
prepareStatement(String sql) : 根据传入的SQL语句创建预编译的Statement对象
prepareCall(String sql) : 根据传入的SQL语句创建CallableStatement对象。

#### （4）通过Statement执行SQL语句。

execute():可以执行任何SQL语句，但比较麻烦
executeUpdate(): 主要用于执行DML和DDL语句。执行DML语句返回受SQL影响的行数，执行DDL语句返回０.
executeQuery():只能执行查询语句，执行后返回代表查询结果的ResultSet对象。
DDL（Data Definition Languages）语句：数据定义语言，这些语句定义了不同的数据段、数据库、表、列、索引等数据库对象的定义。常用的语句关键字主要包括 create、drop、alter等。
DML（Data Manipulation Language）语句：数据操纵语句，用于添加、删除、更新和查询数据库记录，并检查数据完整性，常用的语句关键字主要包括 insert、delete、udpate 和select 等。(增添改查）

#### （5）操作结果集

如果执行的SQL语句是查询语句，执行后返回代表查询结果的ResultSet对象。程序可以通过操作该ResultSet对象来取出查询结果。ResultSet对象提供了如下两类方法：

next(), previous(), first(), last(), beforeFirst(), afterLast(),
absolute()等移动记录指针的方法
getXXX()方法获取记录指针指向行、特定列的值，该方法既可以使用列索引作为参数，也可使用列名作参数。使用前者性能更好，使用后者可读性更好。

#### （6）回收数据库资源

包括关闭ResultSet、Statement和Connection等资源。



## Statement接口

作用：用于执行静态 SQL 语句并返回它所生成结果的对象。

利用Statement stmt=con.createStatement(); 获取Statement对象。
int executeUpdate(String sql) 执行给定 SQL 语句，该语句可能为 INSERT、UPDATE 或DELETE 语句，或 者不返回任何内容的 SQL 语句（如 SQL DDL 语句）。
void close() 立即释放此 Statement 对象的数据库和 JDBC 资源，而不是等待该对象自动关闭时发生此操作。





弊端：需要拼写sql语句，并且存在SQL注入的问题

如：拼写：WHERE USER=' "+ user +" '

​        注入：不安全，有时密码输入错误，也会登陆成功





补充：1.可以将Statemant与Connection的close写在一个方法中

​            2.stmt.executeUpdate(sql);会返回一个int类型的result，可以用这个判断是否语句是否成功，成功的话会返回1。

## PreparedStatement 接口

PreparedStatement 是 Statement 的子接口，属于预处理操作，与直接使用 Statement 不同的是，PreparedStatement 在操作时，是先在数据表中准备好了一条 SQL 语句，但是此 SQL 语句的具体内容暂时不设置，而是之后再进 行设置。

（开发中一般用 PreparedStatement，不用 Statement）



增删改，相当于void；查：需要有一个返回



引用sql语句举例：

String sql="insert intocustomers(name,email,birth)values(?,?,?)";

//问号是占位符



其中values的标准语法：

insert into 表名(列名1，列名2，列名3)
values ('列1的值'，'列2的值'，'列3的值')



优点:PreparedStatement是预编译的**,**对于批量处理可以大大提高效率. 也叫JDBC存储过程



使用例子

```java
perstmt = con.prepareStatement("insert into tb_name (col1,col2,col2,col4) values (?,?,?,?)");
perstmt.setString(1,var1);
perstmt.setString(2,var2);
perstmt.setString(3,var3);
perstmt.setString(4,var4);
perstmt.executeUpdate();
```

