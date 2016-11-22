package me.chunsheng.shortcut;

import com.intellij.ide.browsers.BrowserLauncher;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

import javax.swing.*;

/**
 * Created by wei_spring on 2016/11/21.
 */
public class AboutDialog extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {

        Project project = anActionEvent.getData(PlatformDataKeys.PROJECT);
        String showText =
                "************************************************************************************\n" +
                        "*\n" +
                        "*\n" +
                        "本插件详细简介:\nhttp://chunsheng.me" +
                        "\n\n本插件开发目的:\n为了方便查询,牢记常用快捷键." +
                        "\n\n本插件展示快捷键来自:\nhttps://github.com/pavlospt/Android-Studio-Tips-by-Philippe-Breault/wiki\n" +
                        "https://github.com/xitu/gold-miner/blob/master/TODO/Android-Studio-Tips.md" +
                        "*\n" +
                        "*\n" +
                        "************************************************************************************";
        int i = Messages.showIdeaMessageDialog(project, showText,
                "关于 EasyShortcut", new String[]{
                        "本插件Github地址", "关闭"
                }, 0, new ImageIcon(getClass().getResource("/icons/jetbrains_large.png")), null);
        if (i == 0) {
            BrowserLauncher.getInstance().open("http://chunsheng.me");
        }
    }
}
