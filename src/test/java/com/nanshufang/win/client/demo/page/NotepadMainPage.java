package com.nanshufang.win.client.demo.page;

import com.nanshufang.win.client.demo.common.driver.Driver;
import org.openqa.selenium.WebElement;

public class NotepadMainPage {

    /**
     * 文本编辑区
     * @return
     */
    public WebElement getEditArea(){
        WebElement element= Driver.getDriver().findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"桌面 1\"]/Window[@ClassName=\"Notepad\"][@Name=\"无标题 - 记事本\"]/Document[@ClassName=\"Edit\"][@Name=\"文本编辑器\"]");
        return element;
    }

    /**
     * 格式菜单
     * @return
     */
    public WebElement getFormatMenu(){
        WebElement element= Driver.getDriver().findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"桌面 1\"]/Window[@ClassName=\"Notepad\"][@Name=\"无标题 - 记事本\"]/MenuBar[@Name=\"应用程序\"][@AutomationId=\"MenuBar\"]/MenuItem[@Name=\"格式(O)\"]");
        return element;
    }

    /**
     * 字体菜单
     * @return
     */
    public WebElement getFontMenu(){
        WebElement element= Driver.getDriver().findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"桌面 1\"]/Window[@ClassName=\"Notepad\"][@Name=\"无标题 - 记事本\"]/Menu[@ClassName=\"#32768\"][@Name=\"格式(O)\"]/MenuItem[@Name=\"字体(F)...\"]");
        return element;
    }

    /**
     * 字体的输入框
     * @return
     */
    public WebElement getFontSizeTextbox(){
        WebElement element= Driver.getDriver().findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"桌面 1\"]/Window[@ClassName=\"Notepad\"][@Name=\"无标题 - 记事本\"]/Window[@ClassName=\"#32770\"][@Name=\"字体\"]/ComboBox[@ClassName=\"ComboBox\"][@Name=\"大小(S):\"]/Edit[@ClassName=\"Edit\"][@Name=\"大小(S):\"]");
        return element;
    }

    /**
     *  确定 按钮
     * @return
     */
    public WebElement getConfirmButton(){
        WebElement element= Driver.getDriver().findElementByXPath("/Pane[@ClassName=\"#32769\"][@Name=\"桌面 1\"]/Window[@ClassName=\"Notepad\"][@Name=\"无标题 - 记事本\"]/Window[@ClassName=\"#32770\"][@Name=\"字体\"]/Button[@ClassName=\"Button\"][@Name=\"确定\"]");
        return element;
    }

}
