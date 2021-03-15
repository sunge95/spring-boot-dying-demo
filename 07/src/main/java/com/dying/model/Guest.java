package com.dying.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *  数据库的表名 最好和这个实体类名一致
 *
 * @author:SunG
 * @date 2021/3/6 23:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest implements Serializable {

    private Long id;

    private String name;

    private String role;
}
