# 详细设计的设计模式

## 什么是设计模式

设计模式就是设计经验的总结。

## 可修改性

狭义的就是指对已有实现的修改。

广义的还包括可扩展性（对新的实现的拓展）和灵活性（对实现的动态配置）。

## 接口与实现分离的两种方式

* 接口&实现接口的类
* 子类继承父类，将父类接口与子类实现相分离

二者的关系：

* 对于可修改性，没区别
* 对于可扩展性，一个用新的实现类去实现接口，一个用新的子类去继承父类，也基本没啥区别
* 对于灵活性，接口+组合的方式没问题，但继承的方式要差一些，原因有2点：
  * 父类与所有子类存在共有接口的耦合性
  * 子类new出对象来的时候，就决定了实现的选择， 无法在动态修改了

## 策略模式

1. 参与者

   * Context:拥有一个策略对象的引用（组合的方式）
   * Strategy:声明了所支持的接口
   * ConcretStrategy:实现了Strategy接口

2. 协作关系

   * Context和Strategy相互协作，必要时互相访问对方的数据
   * Context将客户端发来的请求转发给策略类来实现，这个具体策略类是由客户端创建然后传递给Context来灵活配置的（通过setter或者constructor都行）。

3. 应用场景
   * 多个相关类只是在行为的实现上不一样时
   * 需要同一个行为的不同实现的时候
   * 需要隐藏复杂的算法和数据接口时
   * 类的多个行为分别作为switch语句的分支时

4. 注意点
   * Strategy可以是接口也可以时抽象类
   * 优点：动态配置不同的策略
   * 缺点：
      * 客户端必须提前知道有哪些策略
      * 策略类有时候并不需要那么多的Context类的信息，存在一定的隐患
      * 策略模式会new出很多对象
   

## 抽象工厂模式

1. 参与者

   * AbstractFactory: 声明了创建抽象产品的接口
   * ConcreteFactory: 负责实现具体产品的创建
   * AbstractProduct: 声明了一种产品的接口
   * ConcreteProduct: 定义ConcreteFactory中创建出来的具体产品
   * Client: 使用AbstractFactory和AbstractProduct

2. 协作

   * Client使用AbstractFactory的方法创建产品，一般只有一个ConcreteFactory被创建，Client应该使用不同的ConcreteFactory来创建不同的产品。
   * AbstractFactory转移了产品的创建到ConcreteFactory中去了

3. 应用场景

   * 系统需要独立于产品的创建、构成、表现
   * 系统需要灵活配置拥有多个产品族中的某一个
   * 需要限制一个产品族的产品应该一起被使用
   * 只需要暴露产品库的接口而不是实现

4. 注意点

   * 优点：
      * 隔离了Client与具体实现
      * 产品配置变得更加灵活
      * 同类产品之间具有一致性

   * 缺点：
      * 对新产品类型的支持比较困难

## 单例模式

1. 参与者
   * Singleton: 提供获取单例的接口;负责实现单例
   * Client:使用Singleton
2. 协作
   * Client通过Singleton提供的getInstance()方法获取唯一实例
3. 应用场景
   * 某个类只应有一个实例，且供公共访问
   * 当单一实现需要被继承，Client可以用一个子类的实例，而不需要修改它的代码
4. 注意点
   * 可以避免使用全局变量
   * 从Singleton类派生出来的类并不是Singleton
   * 继承之后的类，可以在配置某个应用的时候使用

## 迭代器模式

1. 参与者
   * Iterator: 定义访问和遍历的接口
   * ConcreteIterator: 实现Iterator接口，遍历Aggregate时，跟踪当前的位置
   * Aggregate: 定义创建相应Iterator的接口
   * ConcreteAggregate: 实现Aggregate接口
2. 协作
   * ConcreteIterator跟踪Aggregate中的当前对象，并能够计算出待遍历的后继对象
3. 应用场景
   * 访问一个Aggregate对象而无需暴露其内部实现
   * 支持对Aggregate对象的多种遍历
   * 为遍历不同的Aggregate结构提供一个统一的接口
4. 注意点
   * 它支持以不同的方式遍历一个Aggregate
   * 简化了Aggregate的接口
   * 在同一个Aggregate上可以有多个遍历

