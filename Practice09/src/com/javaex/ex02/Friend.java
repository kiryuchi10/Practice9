package com.javaex.ex02;

public class Friend {

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	private String name;
    private String hp;
    private String school;
	
    public Friend(String name, String hp, String school) {
		super();
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
    public Friend() {
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		System.out.println("이름:" +  name + 
				           " 번호:" + hp + 
				           " 학교:" + school
				           );
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}
    



}
