package com.nanshufang.win.client.demo.common.driver;

import com.nanshufang.win.client.demo.common.utils.PropertyUtils;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @Author Wang Gang
 * @create 2019/9/12 22:29
 */

public class Driver {

    private static WindowsDriver driver = null;

    private static WindowsDriver desktopDriver = null;
//    static int CefPort=7777;


    public  static WindowsDriver getDriver(){
        return driver;
    }

    public static void initDriver() {
            String WindowsApplicationDriverUrl= PropertyUtils.getInstance().getWindowsApplicationDriverUrl();
            //1,Try start Client
            try {
                DesiredCapabilities appCapabilities = new DesiredCapabilities();
                String appPath= PropertyUtils.getInstance().getNotepadPath();
                appCapabilities.setCapability("app", appPath);
                driver = new WindowsDriver<WindowsElement>(new URL(WindowsApplicationDriverUrl), appCapabilities);
            }catch (Exception e){
                e.printStackTrace();
            }

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

}
