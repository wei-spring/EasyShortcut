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
public class MacKeyBox extends AnAction {
    // If you register the action from Java code, this constructor is used to set the menu item name
    // (optionally, you can specify the menu description and an icon to display next to the menu item).
    // You can omit this constructor when registering the action in the plugin.xml file.
    public MacKeyBox() {
        // Set the menu item name.
        super("Text _Boxes");
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        java.net.URL resource = MacKeyBox.class.getResource("/icons/jetbrains_large.png");
        ImageIcon myIcon = new ImageIcon(resource);
        String show = "# Mac 常用快捷键\n" +
                "快捷键\t\t\t                   描述  \n" +
                "通用---------------------------------------------\n" +
                "Command + F9                       Build(编译)\n" +
                "Control + R                        Build and run(编译运行)\n" +
                "Control + D                        Debug(调试)\n" +
                "Command + Option + Y               Synchronize(同步)\n" +
                "Control + Command + F12            Maximize/minimize editor(最大化/最小化编辑器)\n" +
                "Control + ` (backquote)            Quick switch scheme(快速切换主题)\n" +
                "Command + , (comma)                Open settings dialogue(打开设置对话框)\n" +
                "Command + ; (semicolon)            Open project structure dialog(打开项目对话框)\n" +
                "Control + Tab                      Switch between tabs and tool window(标签和工具栏切换)\n" +
                "\n" +
                "导航和搜索-----------------------------------------\n" +
                "Press Shift twice                  Search everything (including code and menus)(全局搜索)\n" +
                "Command + F                        Find(查找)\n" +
                "Command + G                        Find next(查找下一个)\n" +
                "Command + Shift + G                Find previous(查找上一个)\n" +
                "Command + R                        Replace(替换)\n" +
                "Command + O                        Find class(搜索类)\n" +
                "Command + Shift + O                Find file (instead of class)(搜索文件)\n" +
                "Command + F12                      Open file structure pop-up(弹出所打开文件的结构)\n" +
                "Control + Right/Left Arrow         Navigate(导航) between open editor tabs\n" +
                "F4 / Command + Down Arrow          Jump to source(跳到源码)\n" +
                "Shift + F4                         Open current editor tab in new window(新窗口打开编辑选项卡)\n" +
                "Command + E                        Recently opened files pop-up(弹出最近打开文件)\n" +
                "Command + Shift + E                Recently edited files pop-up(弹出最近编辑文件)\n" +
                "Command + Shift + Backspace        Go to last edit location(最后编辑位置)\n" +
                "Command + W                        Close active editor tab(关闭当前编辑选项卡)\n" +
                "Esc                                Return to editor window from a tool window(回到编辑窗口)\n" +
                "Shift + Esc                        Hide active or last active tool window(隐藏最近活动窗口)\n" +
                "Command + L                        Go to line(跳转到行)\n" +
                "Control + H                        Open type hierarchy(打开类层次结构)\n" +
                "Command + Shift + H                Open method hierarchy(打开方法层次结构)\n" +
                "Control + Option + H               Open call hierarchy(打开调用层次结构)\n" +
                "\n" +
                "写代码必备------------------------------------------\n" +
                "Command + N                        Generate code (getters, setters, constructors, etc....)\n" +
                "Control + O                        Override methods(重写方法)\n" +
                "Control + I                        Implement methods(实现方法)\n" +
                "Command + Option + T               Surround with (if...else / try...catch / etc.)\n" +
                "Command + minus/plus               Collapse/expand current code block(折叠/展开代码块)\n" +
                "Command + Shift + minus/plus       Collapse/expand all code blocks(折叠/展开所有代码块)\n" +
                "Command + D                        Duplicate current line or selection(复制当前行)\n" +
                "Control + Space                    Basic code completion(基本代码补全)\n" +
                "Control + Shift + Space            Smart code completion (filters the list of methods and\n" +
                "                                   variables by expected type)(自动代码补全)\n" +
                "Command + P                        Show parameters for selected method(显示方法参数)\n" +
                "Command + U                        Go to super-method/super-class(跳转父类/方法)\n" +
                "Command + Y                        Open quick definition lookup(打开快速定义查找)\n" +
                "Command + Option + L               Reformat code(格式化代码)\n" +
                "Control + Option + I               Auto-indent lines(自动缩进行)\n" +
                "Control + Shift + J                Smart line join(自动合并行)\n" +
                "Command + Enter                    Smart line split(自动拆分行)\n" +
                "\n" +
                "版本管理----------------------------------------------\n" +
                "Command + K                        Commit project to VCS(提交代码到版本管理系统)\n" +
                "Command + T                        Update project from VCS(从版本系统更新项目)\n" +
                "Option + Shift + C                 View recent changes(最近修改文件)\n" +
                "Control + V                        Open VCS popup(弹出版本管理)";
        int i = Messages.showIdeaMessageDialog(project, show,
                "作为一名合格工程师,牢记常用快捷键,会提升开发效率.", new String[]{
                        "点击查看完整快捷键", "确定"
                }, 0, myIcon, null);

        if (i == 0) {
            BrowserLauncher.getInstance().open("http://chunsheng.me/android/IntelliJIDEA_ReferenceCard_Mac_Zh.html");
        }
    }
}