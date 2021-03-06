package com.dying.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *  数据库的表名 最好和这个实体类名一致
 *
 * @author:SunG
 * @date 2021/3/6 23:58
 */
//让jpa知道这个类是可以操控的实体类
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest implements Serializable {
    /**
     * id 上没有注解时 异常
     * org.hibernate.AnnotationException: No identifier specified for entity: com.dying.model.Guest
     * 没有为实体指定标识符
     */
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String role;
}
