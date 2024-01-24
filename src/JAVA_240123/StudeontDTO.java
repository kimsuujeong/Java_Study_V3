package JAVA_240123;

import java.util.Objects;

// DTO -> 읽기 전용
// VO -> 읽고 쓰기
public class StudeontDTO {

	private String sid;
	private String name;
	
	public StudeontDTO(String sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	  @Override
	   public int hashCode() {
	      return Objects.hash(this.sid, this.name);
	   }
	//   하위 호환성을 위주로 한다면 이 방법을 선택하자.
	//   public int hashCode() {
//	      return this.sno + this.name.hashCode();
	//   }
	   
	   @Override
	   public boolean equals(Object obj) {
	      if(obj instanceof StudeontDTO) {
	         StudentDTO student = (StudentDTO)obj;
	         return this.sid == student.sid && this.name.equals(student.name);
	      }
	      return false;
	   }
	   
	   
	
}
