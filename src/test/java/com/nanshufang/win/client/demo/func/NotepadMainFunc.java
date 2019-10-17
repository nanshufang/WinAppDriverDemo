package com.nanshufang.win.client.demo.func;

import com.nanshufang.win.client.demo.page.NotepadMainPage;

public class NotepadMainFunc {

    NotepadMainPage notepadMainPage=null;
    public NotepadMainFunc(){
        notepadMainPage=new NotepadMainPage();
    }

    /**
     * 在正文区域输入 内容
     */
    public void inputContentToEditArea(String content){
        this.notepadMainPage.getEditArea().clear();
        this.notepadMainPage.getEditArea().sendKeys(content);
    }

    /**
     * 点击 格式 菜单
     */
    public void clickFormatMenu(){
        this.notepadMainPage.getFormatMenu().click();
    }

    /**
     * 点击 格式 菜单
     */
    public void clickFontMenu(){
        this.notepadMainPage.getFontMenu().click();
    }

    /**
     * 输入 字号
     */
    public void inputFontSize(Integer fontSize){
        this.notepadMainPage.getFontSizeTextbox().clear();
        this.notepadMainPage.getFontSizeTextbox().sendKeys(fontSize.toString());
    }

    /**
     * 点击 确定 菜单
     */
    public void clickConfirmButton(){
        this.notepadMainPage.getConfirmButton().click();
    }

}
