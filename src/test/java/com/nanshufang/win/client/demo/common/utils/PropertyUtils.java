package com.nanshufang.win.client.demo.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.Properties;

/**
 * @author wang.gang
 * @Description: TODO
 * @date 2018/8/6上午10:38
 */
public class PropertyUtils {

    static PropertyUtils instance;
    Properties m_properties;


    public static PropertyUtils getInstance(){
        if(null==instance){
            instance=new PropertyUtils();
        }
        return instance;
    }

    public PropertyUtils(){
       this.m_properties= loadProperties();
    }

    synchronized public static Properties loadProperties() {
        Properties properties = loadProps("config/env.properties");
        return properties;
    }

    //
    synchronized static public Properties loadProps(String propName) {
        Properties props = new Properties();
        InputStream in = null;
        try {
            in = PropertyUtils.class.getClassLoader().getResourceAsStream(propName);
            props.load(new InputStreamReader(in, "GBK"));
        } catch (FileNotFoundException e) {
            System.out.println(propName + "文件未找到!");
        } catch (IOException e) {
            System.out.println("加载" + propName + "文件出现IOException!");
        } finally {
            try {
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(propName + "文件流关闭出现异常!");
            }
        }
        return props;
    }

    public String getProperty(String key) {
        String value = m_properties.getProperty(key);
        if (StringUtils.isBlank(value)) {
            return "";
        }
        return value;
    }


    //////////////////////////////////////////////////////////////
    /////////读取properties中的各个值
    //////////////////////////////////////////////////////////////

    /**
     * 读取        return this.getProperty("WindowsApplicationDriverUrl");
     * @return
     */
    public String getWindowsApplicationDriverUrl(){
        return this.getProperty("WindowsApplicationDriverUrl");
    }

    public String getNotepadPath(){
        return this.getProperty("notePadPath");
    }

}

