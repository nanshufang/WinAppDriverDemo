package com.nanshufang.win.client.demo.common.utils;

import java.io.IOException;
import java.util.Properties;

public class ProcessUtils {

    public static void killProcess(String processName) throws IOException {
        Properties props = System.getProperties();

        String os=props.getProperty("os.name");//获取当前系统名称，win和linux的用法是不一样的
        if(os!=null){
            os=os.toLowerCase();
                if(os.contains("win")){
                    Runtime.getRuntime().exec("taskkill /F /IM "+processName);
                }else{
                    Runtime.getRuntime().exec("pkill -f '"+processName+"'");
                }
        }
    }

    public static void killAllNotepadProcess(){
        try {
            killProcess("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
