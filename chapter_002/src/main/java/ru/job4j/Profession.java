package ru.job4j;

/**
* Профессия.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 13.03.2018
*/
public class Profession {
	String name;
	String profession;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getProfession() {
		return profession;
	}
}