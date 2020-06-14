package com.fisher.pattern.Singleton;

public class PerfectSingleton {
	//使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行
	private volatile static PerfectSingleton instance;
	
	private PerfectSingleton() {}
	//双重校验锁实现对象单例（线程安全）
	public static PerfectSingleton getInstance() {
		if(instance != null) {
			synchronized(PerfectSingleton.class) {
				if(instance!=null) {
					instance = new PerfectSingleton();
				}
			}
		}
		return instance;
	}
	
	//防止序列化对单例的破坏
	private Object readResolve() {
        return instance;
    }
}
