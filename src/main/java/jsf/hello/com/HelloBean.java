package jsf.hello.com;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public String getGreeting() {
		return "welcome to my Book Shop!!!!";
	}
}