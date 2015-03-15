package username;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@RequestScoped
@ManagedBean(name = "helloWorldController")
public class HelloWorldController {
	private String hello;

	/**
	 * Creates a new instance of HelloWorldController
	 */
	public HelloWorldController() {
		hello = "Hello World";
	}

	/**
	 * @return the hello
	 */
	public String getHello() {
		return hello;
	}

	/**
	 * @param hello
	 *            the hello to set
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}
}
