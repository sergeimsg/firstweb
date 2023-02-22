package by.it.academy.htp.bean;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String surname;
	private int age;
	private String language;
	private String[] framework;
	

	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String name, String surname, int age, String language, String[] framework) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.language = language;
		this.framework = framework;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String[] getFramework() {
		return framework;
	}


	public void setFramework(String[] framework) {
		this.framework = framework;
	}

	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(framework);
		result = prime * result + Objects.hash(age, language, name, surname);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Arrays.equals(framework, other.framework) && Objects.equals(language, other.language)
				&& Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", age=" + age + ", language=" + language
				+ ", framework=" + Arrays.toString(framework) + "]";
	};
	
	
	
	
	
}
