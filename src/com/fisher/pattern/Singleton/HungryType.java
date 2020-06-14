package com.fisher.pattern.Singleton;

public class HungryType {
	//private static 
	private static HungryType instance = new HungryType();//initialized
	
	//private constructor
	private HungryType() {
		
	}
	
	//public interface
 	public HungryType getInstance() {
 		return instance;
 	}
}

/**
 * 所谓饿汉。这是个比较形象的比喻。
 * 对于一个饿汉来说，他希望他想要用到这个实例的时候就能够立即拿到，而不需要任何等待时间。
 * 所以，通过static的静态初始化方式，在该类第一次被加载的时候，就有一个SimpleSingleton的实例被创建出来了。
 * 这样就保证在第一次想要使用该对象时，他已经被初始化好了。
 * 同时，由于该实例在类被加载的时候就创建出来了，所以也避免了线程安全问题。
 * */

/**
 * 如果这个类被多次加载的话也会造成多次实例化！
 * 两种解决方式，第一种是使用静态内部类的形式。第二种是使用懒汉式。
 */


//只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance。
/**
	public class StaticInnerClassSingleton {
	  //在静态内部类中初始化实例对象
	  private static class SingletonHolder {
	      private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
	  }
	  //私有的构造方法
	  private StaticInnerClassSingleton() {
	  }
	  //对外提供获取实例的静态方法
	  public static final StaticInnerClassSingleton getInstance() {
	      return SingletonHolder.INSTANCE;
	  }
	}
*/