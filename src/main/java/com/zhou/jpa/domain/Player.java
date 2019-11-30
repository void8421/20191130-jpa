package com.zhou.jpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Author mac
 * @ClassName Player
 * @Description
 * @Date 2019/11/30 10:21 上午
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;
    private String name;
    private String gender;
    private Integer age;
    private String idCard;
    private String phone;
    private String school;
    private String speciality;
    private String worksName;
    private String worksType;
    private LocalDateTime worksTime;
}
