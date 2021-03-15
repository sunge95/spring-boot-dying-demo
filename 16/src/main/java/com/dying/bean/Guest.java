package com.dying.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/10 16:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {

    @NotBlank(message = "{guest.name.notblank}")
    private String name;
    @NotBlank
    private String role;
}
