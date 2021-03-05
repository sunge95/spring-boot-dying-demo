package com.dying.controller;

import com.dying.bean.Food;
import com.dying.bean.Vegetables;
import com.dying.config.FoodConfig;
import com.dying.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @RestController
 * 是@Controller和@ResponseBody的组合
 * 返回json形式的响应结果   而不是视图(jsp html)
 */
@RestController
public class JsonController {
    // 1

    @RequestMapping("/json1")
    public Food json1(){
        Food food = new Food();
        food.setMeat("猪肉");
        food.setRice("米饭");
        return food;
    }

    // 2
    /**
     * @Value 通过${}结构获得配置文件中属性值
     * 当使用@Value时，指定位置配置文件必须有赋值
     * */
    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;

    @RequestMapping("/json2")
    public Food json2(){
        Food food = new Food();
        food.setMeat(meat);
        food.setRice(food.getRice());
        return food;
        // 响应结果 {"rice":null,"meat":"烤肉-499001342","sauce":null}
    }

    // 3 官方推荐

    @Autowired
    private FoodConfig foodConfig;
    @RequestMapping("/json3")
    public Food json3(){
        Food food = new Food();
        food.setRice(foodConfig.getRice());
        food.setMeat(foodConfig.getMeat());
        return food;
    }

    @Autowired
    private VegetablesConfig vegetablesConfig;
    @RequestMapping("/Vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        return vegetables;
    }
}
