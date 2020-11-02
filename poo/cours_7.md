[Index](./index.md)  
[Cours précédant](./cours_6.md)  
[Cours suivant](./cours_8.md)

# Interface avec méthode par défaut

```java
interface I {
	void f(int a);
	int g();

	/**
	 * La méthode avec default n'est pas obligé d'être redéfinie dans les classes qui implémentent cette interface
	 * La méthode s'hérite dans les sous interfaces et les implémentations.
	 */
	default int h(){
		return 0;
	}
}
```

```java
class P {
	void f(){
		//some code
	}
}
interface C {
	default void f(){
		//some code
	}
}

class G extends P implements C {
	f();//méthode de la super classe.

	@Override
	void f(){
		super.f()//méthode de la super classe
		C.super.f()//méthode de l'interface
	}
}
```


# Exception

```java
class MyClass {
	public static void main(String[] args) {
		try {
			f();
		} catch(MyException e) {
			//code dans le cas où la méthode a lancé une exception
		} catch (Exception e) {

		} finally {
			//code exécuté après le try bien passé ou après le catch
		}
	}
}

```

RuntimeException : exception qui n'est pas obligé d'être rattrapé.


[Index](./index.md)  
[Cours précédant](./cours_6.md)  
[Cours suivant](./cours_8.md)
