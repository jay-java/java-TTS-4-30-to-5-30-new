package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean,DisposableBean{
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
//bean lifecycle by methods
	public void startBean() {
		System.out.println("bean started");
	}

	public void destroyBean() {
		System.out.println("bean destroyed");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("bean started with interface");
	}

	public void destroy() throws Exception {
		System.out.println("bean destrot by interface");
	}
	@PostConstruct
	public void startBeanWithAnnotation() {
		System.out.println("bean started with annotation");
	}
	@PreDestroy
	public void destoryBeanWithAnnotation() {
		System.out.println("bean destroyed with annotation");
	}
	
}
