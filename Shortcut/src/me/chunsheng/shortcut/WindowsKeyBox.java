package me.chunsheng.shortcut;

import com.intellij.ide.browsers.BrowserLauncher;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;


import javax.swing.*;


/**
 * Created by wei_spring on 2016/11/18.
 */
public class WindowsKeyBox extends AnAction {
    // If you register the action from Java code, this constructor is used to set the menu item name
    // (optionally, you can specify the menu description and an icon to display next to the menu item).
    // You can omit this constructor when registering the action in the plugin.xml file.
    public WindowsKeyBox() {
        // Set the menu item name.
        super("Text _Boxes");
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);

        System.out.println("1:" + event.getActionManager().getComponentName());
        System.out.println("2:" + project.getName());
        System.out.println("3:" + event.getPresentation().getText());
        System.out.println("3:" + event.getPresentation().isEnabled());

//        java.net.URL resource = MacKeyBox.class.getResource("icons/gif023.gif");
//        ImageIcon myIcon = new ImageIcon(resource);
        String show = "快捷键\t\t\t                   描述  \n" +
                "通用---------------------------------------------\n" +
                "Control + F9                       Build(编译)\n" +
                "Shift + F10                        Build and run(编译运行)\n" +
                "Shift + F9                         Debug(调试)\n" +
                "Control + Alt + Y                  Synchronize(同步)\n" +
                "Control + Shift + F12              Maximize/minimize editor(最大化/最小化编辑器)\n" +
                "Control + ` (backquote)            Quick switch scheme(快速切换主题)\n" +
                "Control + Alt + S                  Open settings dialogue(打开设置对话框)\n" +
                "Control + Alt + Shift + S          Open project structure dialog(打开项目对话框)\n" +
                "Control + Tab                      Switch between tabs and tool window(标签和工具栏切换)\n" +
                "\n" +
                "导航和搜索-----------------------------------------\n" +
                "Press Shift twice                  Search everything (including code and menus)(全局搜索)\n" +
                "Control + F                        Find(查找)\n" +
                "F3                                 Find next(查找下一个)\n" +
                "Shift + F3                         Find previous(查找上一个)\n" +
                "Control + R                        Replace(替换)\n" +
                "Control + N                        Find class(搜索类)\n" +
                "Control + Shift + N                Find file (instead of class)(搜索文件)\n" +
                "Control + F12                      Open file structure pop-up(弹出所打开文件的结构)\n" +
                "Alt + Right/Left Arrow             Navigate(导航) between open editor tabs\n" +
                "F4 / Control + Enter               Jump to source(跳到源码)\n" +
                "Shift + F4                         Open current editor tab in new window(新窗口打开编辑选项卡)\n" +
                "Control + E                        Recently opened files pop-up(弹出最近打开文件)\n" +
                "Control + Shift + E                Recently edited files pop-up(弹出最近编辑文件)\n" +
                "Control + Shift + Backspace        Go to last edit location(最后编辑位置)\n" +
                "Control + F4                       Close active editor tab(关闭当前编辑选项卡)\n" +
                "Esc                                Return to editor window from a tool window(回到编辑窗口)\n" +
                "Shift + Esc                        Hide active or last active tool window(隐藏最近活动窗口)\n" +
                "Control + G                        Go to line(跳转到行)\n" +
                "Control + H                        Open type hierarchy(打开类层次结构)\n" +
                "Control + Shift + H                Open method hierarchy(打开方法层次结构)\n" +
                "Control + Alt + H                  Open call hierarchy(打开调用层次结构)\n" +
                "\n" +
                "写代码必备------------------------------------------\n" +
                "Alt + Insert                       Generate code (getters, setters, constructors, etc....)\n" +
                "Control + O                        Override methods(重写方法)\n" +
                "Control + I                        Implement methods(实现方法)\n" +
                "Control + Alt + T                  Surround with (if...else / try...catch / etc.)\n" +
                "Control + minus/plus               Collapse/expand current code block(折叠/展开代码块)\n" +
                "Control + Shift + minus/plus       Collapse/expand all code blocks(折叠/展开所有代码块)\n" +
                "Control + D                        Duplicate current line or selection(复制当前行)\n" +
                "Control + Space                    Basic code completion(基本代码补全)\n" +
                "Control + Shift + Space            Smart code completion (filters the list of methods and\n" +
                "                                   variables by expected type)(自动代码补全)\n" +
                "Control + P                        Show parameters for selected method(显示方法参数)\n" +
                "Control + U                        Go to super-method/super-class(跳转父类/方法)\n" +
                "Control + Shift + I                Open quick definition lookup(打开快速定义查找)\n" +
                "Control + Alt + L                  Reformat code(格式化代码)\n" +
                "Control + Alt + I                  Auto-indent lines(自动缩进行)\n" +
                "Control + Shift + J                Smart line join(自动合并行)\n" +
                "Control + Enter                    Smart line split(自动拆分行)\n" +
                "\n" +
                "版本管理----------------------------------------------\n" +
                "Control + K                        Commit project to VCS(提交代码到版本管理系统)\n" +
                "Control + T                        Update project from VCS(从版本系统更新项目)\n" +
                "Alt + Shift + C                    View recent changes(最近修改文件)\n" +
                "Alt + ` (backquote)                Open VCS popup(弹出版本管理)";

        //JBPopupFactory.getInstance().createMessage(show).showCenteredInCurrentWindow(project);


        int i = Messages.showIdeaMessageDialog(project, show,
                "作为一名合格工程师,牢记常用快捷键,会提升开发效率.", new String[]{
                        "点击查看完整快捷键", "确定"
                }, 0, new ImageIcon(getClass().getResource("/icons/jetbrains_large.png")), null);

        if (i == 0) {
            BrowserLauncher.getInstance().open("http://chunsheng.me/android/IntelliJIDEA_ReferenceCard_Zh.html");
//            java.net.URL resource = MacKeyBox.class.getResource("/icons/android_studio_tips_1.gif");
//            try {
//
//            BrowserLauncher.getInstance().open("https://camo.githubusercontent.com/e6d705f9aa9521a0ec8c939c81a9509b76022a85/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d4676344d784857496448772f564346575934596b7630492f41414141414141414e6f512f59566532686d6e6b4150452f773636372d683334382d6e6f2f33312d616e616c797a6564617461666c6f772e676966");
//            }catch (Exception e){
//
//            }
        }
//        ArrayList<String> items = Lists.newArrayListWithExpectedSize(3);
//        for (int i = 0; i < 3 ; i++) {
//            items.add("item"+i);
//        }
//        JBList.createDefaultListModel(ArrayUtil.toObjectArray(items));
//        final JList list = new JBList(JBList.createDefaultListModel(items.toArray()));
//        JBPopup popup = JBPopupFactory.getInstance()
//                .createListPopupBuilder(list)
//                .setTitle("Restart ghc-modi for module")
//                //.setItemChoosenCallback(makeModuleChoiceCallback(e, list))
//                .createPopup();
//        popup.showCenteredInCurrentWindow(project);
    }

}