package com.nanshufang.win.client.demo.testcase;

/**
 * @Author WangGang6@100tal.com
 * @create 2019/9/12 22:49
 */

import com.nanshufang.win.client.demo.common.driver.Driver;
import com.nanshufang.win.client.demo.common.utils.ProcessUtils;
import com.nanshufang.win.client.demo.func.NotepadMainFunc;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChangeFontTest {

    @BeforeClass
    public void beforeClass() {
        ProcessUtils.killAllNotepadProcess();
        Driver.initDriver();
    }

    @BeforeTest
    public void beforeTest() throws Exception {

    }

    @AfterTest
    public void afterTest() throws Exception {

    }

    @Test()
    public void loginTest()  {
        NotepadMainFunc notepadMainFunc=new NotepadMainFunc();
        notepadMainFunc.inputContentToEditArea("这是测试文本，This is some test Text!");
        notepadMainFunc.clickFormatMenu();
        notepadMainFunc.clickFontMenu();
        notepadMainFunc.inputFontSize(30);
        notepadMainFunc.clickConfirmButton();
        Assert.assertEquals("a","a","验证是否相等");
    }

}
