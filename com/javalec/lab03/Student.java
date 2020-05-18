package com.javalec.lab03;

public class Student {
	String name;
	String number;
	int birthYear;
	
	/**
	 * hashCode()와 equals()를 Override를 해야 내가 원하는 같은 조건을 설정할 수 있다.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Student other = (Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	
	/**
	 * toString()을 재정의해야 내가 원하는 object의 출력을 설정할 수 있다.
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.number = "1234";
		s1.birthYear = 1995;

		Student s2 = new Student();
		s2.name = "홍길동";
		s2.number = "1234";
		s2.birthYear = 1995;

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		// equals와 hashcode()를 override 하지 않으면 계속해서 다름
		if (s1.equals(s2))
			System.out.println("a1과 a2는 똑 같습니다.");
		else
			System.out.println("a1과 a2는 다릅니다.");

		System.out.println(s1);
		System.out.println(s2);
	}

}
