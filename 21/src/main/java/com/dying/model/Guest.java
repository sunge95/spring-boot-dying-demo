package com.dying.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/14 17:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

    private Integer id;
    private String name;
    private String role;
}
