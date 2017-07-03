package com.zhidi;

@table(value="person",name="小明",age=22)
public class Person {
	public int id;
	public String sex;
	
	
	@Column(name="name",type="type",length=2,unique=true)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void study(){
		System.out.println("我爱习近平");
	}

}
