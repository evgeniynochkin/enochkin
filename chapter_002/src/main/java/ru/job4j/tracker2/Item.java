package ru.job4j.tracker2;

/**
* Класс Запись.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 1.0
*/
public class Item {
	private String id;
	private String name;
	private String desc;
	private long created;
	public String[] comments;
	
	public Item() {
	}
	
	public Item(String name, String desc, long created) {
		this.name = name;
		this.desc = desc;
		this.created = created;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public void setCreated(long created) {
		this.created = created;
	}
	
	public long getCreated() {
		return this.created;
	}
}