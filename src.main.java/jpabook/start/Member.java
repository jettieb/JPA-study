package jpabook.start;

import javax.persistence.*;

@Entity // 테이블과 매핑한다고 JPA에게 알려줌.
@Table(name="MEMBER")   // MEMBER 테이블에 매핑
public class Member {

    @Id // pk
    @Column(name = "ID")    // 컬럼 매핑. name 속성 사용해 ID 컬럼에 매핑.
    private String id;

    @Column(name = "NAME")
    private String username;
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}