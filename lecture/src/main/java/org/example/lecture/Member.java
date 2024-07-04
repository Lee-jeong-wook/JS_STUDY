package org.example.lecture;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Member {
    public Member(Long id, String name, RoleType roleType){
        setName(name);
        setRoleType(roleType);
    }
    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Lob
    private String description;

    public Member() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    //    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
