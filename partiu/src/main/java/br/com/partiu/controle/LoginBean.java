package br.com.partiu.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped; 

@ManagedBean  
@RequestScoped
public class LoginBean {
	private String login; 
	
	public LoginBean() {
	}

	public void autenticar() { 
		System.out.println("teste"); 
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
 
}
