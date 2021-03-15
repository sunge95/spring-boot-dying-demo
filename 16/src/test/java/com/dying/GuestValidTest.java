package com.dying;

import com.dying.bean.Guest;
import org.springframework.validation.Validator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import java.util.Set;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/10 16:06
 */
public class GuestValidTest {
    public static void main(String[] args) {
        //1、通过Validation创建一个validator实例  （普通模式）
        Validator validator = (Validator) Validation.buildDefaultValidatorFactory().getValidator();

        //2、创建一个快速失败模式的实例
        Validator validatorFastFail = (Validator) Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast", "true").
                        buildValidatorFactory().getValidator();

        //创建一个不符合要求的bean
        Guest guest = new Guest("", "");

        //开始验证  接收验证结果
//        Set<ConstraintViolation<Guest>> violationSet = validator.validate(guest);

//        for (ConstraintViolation violation : violationSet) {
//            System.out.println(violation.getPropertyPath() + "," + violation.getMessage());
//        }

        System.out.println("==============================");

//        Set<ConstraintViolation<Guest>> violationFastFailSet = validatorFastFail.validate(guest);
//        for (ConstraintViolation violation : violationFastFailSet) {
//            System.out.println(violation.getPropertyPath() + "," + violation.getMessage());
//        }


    }
}
