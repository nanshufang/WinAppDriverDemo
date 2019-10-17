package com.nanshufang.win.client.demo.common.utils;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;

/**
 * @Author WangGang6@100tal.com
 * @create 2019/9/20 23:17
 */

public class Utils {

    public static void sleep(int millSecond){
        try {
            Thread.sleep(millSecond);
        }catch(Exception e){
            e.printStackTrace();
        }
    }





}
