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
public class TipsDialog extends AnAction {
    // If you register the action from Java code, this constructor is used to set the menu item name
    // (optionally, you can specify the menu description and an icon to display next to the menu item).
    // You can omit this constructor when registering the action in the plugin.xml file.
    public TipsDialog() {
        // Set the menu item name.
        super("Text _Boxes");
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
    }

    public void actionPerformed(AnActionEvent event) {

        Project project = event.getData(PlatformDataKeys.PROJECT);
        String tipsName = event.getPresentation().getText();

        String tipsContent = "";

        String tipsGifUrl = "";

        switch (tipsName) {
            case "1.分析传入数据流(Analyze data flow to here)":
                tipsContent = "描述：这个操作将会根据当前选中的变量、参数或者字段，分析出其传递到此处的路径。 当你进入某段陌生的代码，试图明白某个参数是怎么传递到此处的时候，这是一个非常有用的操作。\n" +
                        "调用：Menu → Analyze → Analyze Data Flow to Here\n" +
                        "快捷键：无，可以在设置中指定。\n" +
                        "相反的操作：分析传出数据流（Analyze data flow from here），这个将会分析当前选中的变量往下传递的路径，直到结束。";

                tipsGifUrl = "https://camo.githubusercontent.com/e6d705f9aa9521a0ec8c939c81a9509b76022a85/68747470733a2f2f6" +
                        "c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d4676344d784857496448772f564346575934596b763049" +
                        "2f41414141414141414e6f512f59566532686d6e6b4150452f773636372d683334382d6e6f2f33312d616e616c797a6564" +
                        "617461666c6f772e676966";
                break;
            case "2.堆栈追踪分析(Analyze Stacktrace)":
                tipsContent = "描述： 这个操作读取一份堆栈追踪信息，并且使它像logcat中那样可以点击。当你从bug报告中或者终端复制了一份堆栈追踪，使用该操作可以很方便地调试。\n" +
                        "调用：Menu → Analyze → Analyze Stacktrace\n" +
                        "快捷键：无，可以在设置中指定。\n" +
                        "更多：通过使用“ProGuard Unscramble Plugin”插件，也可以分析混淆过的堆栈追踪。";

                tipsGifUrl = "https://camo.githubusercontent.com/c85ace7958f610a21016c86ac3412cd62f2229d0/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742" +
                        "e636f6d2f2d7564326c31516448546f772f564341454143434b3162492f41414141414141414e6d592f3561336f64396e496d32452f773637362d683339322f33302d616e616c797" +
                        "a65737461636b74726163652e676966";
                break;
            case "3.关联调试程序(Attach Debugger)":
                tipsContent = "描述：随时启动调试程序，即使你没有以调试模式启动你的应用。这是一个很方便的操作，因为你不必为了调试程序而以调试模式重新部署你的应用。" +
                        "当别人正在测试应用，突然遇到一个bug而将设备交给你时，你也可以很快地进入调试模式。\n" +
                        "调用：点击工具栏图标或者Menu → Build → Attach to Android Process\n" +
                        "快捷键：无，可以在设置中指定，或者点击工具栏对应的图标。";

                tipsGifUrl = "https://camo.githubusercontent.com/4491b2a7bb083711a35ebeec2a4d179d34fa67b0/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e7" +
                        "42e636f6d2f2d794f7953574131645750552f5642676948384b6e6b47492f41414141414141414e66552f3045362d793075357369632f773337382d683233362d6e6f2f32362d6" +
                        "1747461636864656275676765722e676966";
                break;

            case "4.书签(Bookmarks)":
                tipsContent = "描述：这是一个很有用的功能，让你可以在某处做个标记（书签），方便后面再跳转到此处。\n" +
                        "调用：Menu → Navigate → Bookmarks\n" +
                        "快捷键：\n" +
                        "添加/移除书签：F3(OS X) 、F11(Windows/Linux);\n" +
                        "添加/移除书签(带标记)：Alt + F3(OS X)、Ctrl + F11(Windows/Linux);\n" +
                        "显示全部书签：Cmd + F3(OS X) 、Shift + F11(Windows/Linux)，显示所有的书签列表，并且是可以搜索的。\n" +
                        "上一个/下一个书签：无，可以在设置中设置快捷键。\n" +
                        "更多：当你为某个书签指定了标记，你可以使用快捷键 Ctrl + 标记 来快速跳转到标记处，比如输入Ctrl + 1，跳到标记为1的书签处。";

                tipsGifUrl = "https://camo.githubusercontent.com/85d7166b42db371a3e4a5d8e797c032ab98fd2ba/68747470733a2f2f6c68342e676f6f676c6575736572636f6e746" +
                        "56e742e636f6d2f2d5372663330316435736f552f555f4d37593659745470492f41414141414141414d32772f6f35634976506a47774e6f2f773834382d683337312d6e6f2f" +
                        "30372d626f6f6b6d61726b732e676966";
                break;

            case "5.折叠/展开代码块(Collapse Expand Code Block)":

                tipsContent = "描述：该操作提供一种方法，让你隐藏你不关心的部分代码，以一种较为简洁的格式显示关键代码。一个有意思的用法是隐藏匿名内部类的代码，让其看起来像一个Lambda表达式。\n" +
                        "快捷键：Cmd + \"+\"/\"-\"(OS X)、Ctrl + Shift + \"+\"/\"-\"(Windows/Linux);\n" +
                        "更多：可以在Settig → Editor → General → Code Folding 中设置折叠规则";

                tipsGifUrl = "https://camo.githubusercontent.com/e0d4d68a581d562f7d0b8cd554c8f046c0b6b397/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742" +
                        "e636f6d2f2d73783545616a49425a73592f555f487078744346616c492f41414141414141414d31512f542d385033336e74646c452f773236382d683134372d6e6f2f30362d63" +
                        "6f6465666f6c64696e672e676966";

                break;

            case "6.列选择/块选择(Column Selection)":

                tipsContent = "描述：正常选择时，当你向下选择时，会直接将当前行到行尾都选中，而块选择模式下，则是根据鼠标选中的矩形区域来选择。\n" +
                        "调用：按住Alt，然后拖动鼠标选择。\n" +
                        "开启/关闭块选择：Menu → Edit → Column Selection Mode\n" +
                        "快捷键：切换块选择模式：Cmd + Shift + 8(OS X)、Shift + Alt + Insert\uFEFF(Windows/Linux);";

                tipsGifUrl = "https://camo.githubusercontent.com/d31bcfbaacfd7d529356500dbc0fc03494fc49e8/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742" +
                        "e636f6d2f2d737737752d3955736563672f5643502d746561335345492f41414141414141414e72342f43796c61327356717355492f773439372d683133372d6e6f2f33332d636f6c" +
                        "756d6e73656c656374696f6e2e676966";
                break;

            case "7.与分支比对(Compare With Branch (Git))":

                tipsContent = "描述：假如你的项目是使用git来管理的，你可以将当前文件或者文件夹与其他的分支进行比对。比较有用的是可以让你了解到你与主分支有多少差别。\n" +
                        "调用：Menu → VCS → Git → Compare With Branch";

                tipsGifUrl = "https://camo.githubusercontent.com/3c10b458680696e626528ddd2bd7b1159e9faf64/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6" +
                        "d2f2d7857314a3342425a485a632f5643364656434d657857492f41414141414141414e384d2f47454a71737a6f717a586b2f773537302d683332382d6e6f2f33382d636f6d70617265776" +
                        "974686272616e63682e676966";

                break;
            case "8.与剪切板比对(Compare With Clipboard)":
                tipsContent = "描述：将当前选中的部分与剪切板上的内容进行比对。\n" +
                        "调用：右键选中的部分，在右键菜单中选择“Compare With Clipboard”。";

                tipsGifUrl = "https://camo.githubusercontent.com/98f603e75700d5099ab27205bdf8fc065c272ab2/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e63" +
                        "6f6d2f2d3672446e386b4c375067772f56436c454d31336f594b492f41414141414141414e306f2f4a576964755731705773552f773531392d683236352d6e6f2f33342d636f6d70617" +
                        "26577697468636c6970626f6172642e676966";
                break;

            case "9.语句补全(Complete Statement)":
                tipsContent = "描述：这个方法将会生成缺失的代码来补全语句，常用的使用场景如下：\n" +
                        "在行末添加一个分号，即使光标不在行末；\n" +
                        "为if、while、for 语句生成圆括号和大括号；\n" +
                        "方法声明后，添加大括号；\n" +
                        "调用：Menu → Edit → Compelete Current Statement\n" +
                        "快捷键：Cmd + Shift + Enter(OS X)、Ctrl + Shift + Enter(Windows/Linux)；\n" +
                        "更多：如果一个语句已经补全，当你执行该操作时，则会直接跳到下一行，即使光标不在当前行的行末。";

                tipsGifUrl = "https://camo.githubusercontent.com/290accc03b09a61854e6042283920352e7878c11/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e6" +
                        "36f6d2f2d6f5a655753696d72766f552f5641577235516f412d6f492f41414141414141414e51452f304c784c304c6b4e384a772f773238312d683132342d6e6f2f31362d636f6d70" +
                        "6c65746573746174656d656e742e676966";
                break;

            case "10.条件断点(Conditional Breakpoints)":
                tipsContent = "描述：简单说，就是当设定的条件满足时，才会触发断点。你可以基于当前范围输入一个java布尔表达式，并且条件输入框内是支持代码补全的。\n" +
                        "调用：右键需要填写表达式的断点，然后输入布尔表达式。";

                tipsGifUrl = "https://camo.githubusercontent.com/c7529147fed09597ed30b559e560ae9e997f9987/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742" +
                        "e636f6d2f2d70396b364a694e4c516d592f5642417765666c726b59492f41414141414141414e58382f67436175666a47626431632f773531342d683236342d6e6f2f32322d636f6" +
                        "e646974696f6e616c627265616b706f696e742e676966";
                break;
            case "11.上下文信息(Context Info)":
                tipsContent = "描述：当前作用域定义超过滚动区域，执行该操作将显示所在的上下文信息，通常它显示的是类名或者内部类类名或者当前所在的方法名。该操作在xml文件中同样适用。\n" +
                        "调用：Menu → View → Context Info\n" +
                        "快捷键：Alt + Q (Windows/Linux)\n" +
                        "更多：个人认为，这个功能更好的用法是快速查看当前类继承的父类或者实现的接口。";
                tipsGifUrl = "https://camo.githubusercontent.com/1ca6f3bb22881cd144bf7d209bac8d628db5a230/68747470733a2f2f6c68342e676f6f676c6575736572636f6e7465" +
                        "6e742e636f6d2f2d464e6732683135463463302f56442d724a757058676b492f41414141414141414f4c342f6c6661516d626a777061772f773537342d683137342d6e6f2f3" +
                        "4372d636f6e74657874696e666f2e676966";
                break;
            case "12.删除行(Delete Line)":
                tipsContent = "描述：如果没选中，则删除光标所在行，如果选中，则会删除选中所在的所有行。\n" +
                        "快捷键：Cmd + Delete(OS X)、Ctrl + Y(Windows/Linux)";

                tipsGifUrl = "https://camo.githubusercontent.com/54b9366c400fbdacf88eb2e9518c662bd933fef4/68747470733a2f2f6c68332e676f6f676c6575736572636f6e746" +
                        "56e742e636f6d2f2d625035574f564d667037412f555f6370516930627668492f41414141414141414d39632f646376764a7531555334302f773236352d683130332d6e6f2f31" +
                        "302d64656c6574656c696e652e676966";
                break;
            case "13.禁用断点(Disable Breakpoints)":
                tipsContent = "这个操作将使得断点。当你有一个设置过复杂条件的断点或者是日志断点，当前不需要，但是下次又不用重新创建，该操作是很方便的。\n" +
                        "调用：按住Alt，然后单击断点即可。";
                tipsGifUrl = "https://camo.githubusercontent.com/99c86b907d5b641bd972a5623e052bf3d6383d0e/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742" +
                        "e636f6d2f2d684e6b306b754c3157424d2f5642625158616d47382d492f41414141414141414e654d2f796e66534a3568714376412f773336352d683233352d6e6f2f32352d" +
                        "646961626c65627265616b706f696e742e676966";
                break;
            case "14.行复制(Duplicate Line)":
                tipsContent = "描述：复制当前行，并粘贴到下一行，这个操作不会影响剪贴板的内容。这个命令配合移动行快捷键非常有用。\n" +
                        "快捷键：Cmd + D(OS X)、Ctrl + D(Windows/Linux)";

                tipsGifUrl = "https://camo.githubusercontent.com/16050871c9355c806d456271f80694aed963abce/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e6" +
                        "36f6d2f2d31646e6f316a6e325063672f555f7366684f7858546b492f41414141414141414e43382f38736c3354567a3164416f2f773236352d683130332d6e6f2f31312d647570" +
                        "6c69636174655f6c696e65732e676966";
                break;
            case "15.编写正则表达式(Edit Regex)":
                tipsContent = "描述：使用Java编写正则表达式是一件很困难的事，主要原因是：\n" +
                        "你必须得避开反斜杠；\n" +
                        "说实话，正则很难；\n" +
                        "看第二条。\n" +
                        "IDE能帮我们干点啥呢？当然是一个舒服的界面来编写和测试正则啦~\n" +
                        "\n" +
                        "快捷键：Alt + Enter → check regexp";

                tipsGifUrl = "https://camo.githubusercontent.com/9529434ede726ca59befe2fbe972bdc012ef498b/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e6" +
                        "36f6d2f2d7a696e5651696f516930632f56475833747859653069492f41414141414141414f35632f44356e6870535379496d6b2f773431392d683137302d6e6f2f36382d6368656" +
                        "36b7265676578702e676966";
                break;
            case "16.使用Enter和Tab进行代码补全的差别(Enter vs Tab for Code Completion)":
                tipsContent = "描述：代码补全时，可以使用Enter或Tab来进行补全操作，但是两者是有差别的。\n" +
                        "使用Enter时：从光标处插入补全的代码，对原来的代码不做任何操作。\n" +
                        "使用Tab时：从光标处插入补全的代码，并删除后面的代码，直到遇到点号、圆括号、分号或空格为止。";

                tipsGifUrl = "https://camo.githubusercontent.com/2c6ab6bcd594e46bf46fa07f1bdb663b50c343d3/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f" +
                        "6d2f2d7a6b445952696a477034412f5644304b74646b727146492f41414141414141414f4a452f7745723133346a6d4678452f773235322d683132332d6e6f2f34352d636f6465636f6d" +
                        "706c6574696f6e656e7465727461622e676966";
                break;
            case "17.计算表达式(Evaluate Expression)":
                tipsContent = "描述：这个操作可以用来查看变量的内容并且计算几乎任何有效的java表达式。需要注意的是，如果你修改了变量的状态，这个状态在你恢复代码执行后依然会保留。\n" +
                        "快捷键：处在断点状态时，光标放在变量处，按Alt + F8，即可显示计算表达式对话框。";

                tipsGifUrl = "https://camo.githubusercontent.com/665d1efc30389932391c58515bb254a3acb660f0/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6" +
                        "d2f2d7956613354367455564a452f56426c7337486f6f6e65492f41414141414141414e67302f4d744a70494b43564577732f773733392d683231352d6e6f2f32372d6576616c7561746" +
                        "565787072657373696f6e2e676966";
                break;
            case "18.提取方法(Extract Method)":
                tipsContent = "描述：提取一段代码块，生成一个新的方法。当你发现某个方法里面过于复杂，需要将某一段代码提取成单独的方法时，该技巧是很有用的。\n" +
                        "调用：Menu → Refactor → Extract → Method\n" +
                        "快捷键：Cmd + Alt + M(OS X)、Ctrl + Alt + M(Windows/Linux)；\n" +
                        "更多：在提取代码的对话框，你可以更改方法的修饰符和参数的变量名。";
                tipsGifUrl = "https://camo.githubusercontent.com/19b4881053264a263d929c8b54ceb6276e8f3fd3/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2" +
                        "d395145306e38696634384d2f5645704e6e4141444a76492f41414141414141414f61412f68646e2d6f4d79572d56412f773538342d683435382d6e6f2f35332d6578747261637" +
                        "46d6574686f642e676966";
                break;
            case "19.提取参数(Extract Parameter)":
                tipsContent = "描述：这是一个提取参数的快捷操作。当你觉得可以通过提取参数来优化某个方法的时候，这个技巧将很有用。该操作会将当前值作为一个方法的参数，将旧的值放到方法调用的地方，作为传进来的参数。\n" +
                        "调用：Menu → Refactor → Extract → Parameter\n" +
                        "快捷键：Cmd + Alt + P(OS X)、Ctrl + Alt + P(Windows/Linux)；\n" +
                        "更多：通过勾选“delegate”，可以保持旧的方法，重载生成一个新方法。";
                tipsGifUrl = "https://camo.githubusercontent.com/db3eb6531ede7c1fccd822ffad8c2f5a0a4eb67b/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d30353" +
                        "6504b6a44787737552f56456a6f5258626c6b39492f41414141414141414f586f2f44574f45554d696b574d552f773437342d683236332d6e6f2f35322d65787472616374706172616d2e676966";
                break;
            case "20.提取变量(Extract Variable)":
                tipsContent = "描述：这是一个提取变量的快捷操作。当你在没有写变量声明的直接写下值的时候，这是一个很方便生成变量声明的操作，同时还会给出一个建议的变量命名。\n" +
                        "调用：Menu → Refactor → Extract → Variable\n" +
                        "快捷键：Cmd + Alt + V(OS X)、Ctrl + Alt + V(Windows/Linux)；\n" +
                        "更多：当你需要改变变量声明的类型，例如使用 List 替代 ArrayList，可以按下Shift + Tab，就会显示所有可用的变量类型。";

                tipsGifUrl = "https://camo.githubusercontent.com/692f704ba730319686aaa1019acd6af601efb006/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d3736" +
                        "47483866776c5038772f56456558573178357163492f41414141414141414f56302f595f4454556f4f35562d632f773336382d683236392d6e6f2f35312d657874726163747661726961626c652e676966";
                break;
            case "21.查找操作(Find Action)":
                tipsContent = "描述：输入某个操作的名称，快速查找，对于没有快捷键的部分操作这是一个很有用的技巧。\n" +
                        "快捷键：Cmd +Shift + A(OS X)、Ctrl + Shift + A(Windows/Linux)；\n" +
                        "更多：当某个操作是有快捷键的，会显示在旁边。";

                tipsGifUrl = "https://camo.githubusercontent.com/28b4402cac570430d576af05afe5f9c51992597c/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d3152356" +
                        "7366339353350632f555f534a55554b5f7a5a492f41414141414141414d34412f37386b5067495f553558342f773530302d683233332d6e6f2f30382d66696e64616374696f6e2e676966";
                break;
            case "22.查找补全(Find Complection)":
                tipsContent = "描述：当你在一个文件中进行查找时，使用自动补全快捷键可以给出在当前文件中出现的建议单词；\n" +
                        "快捷键：Cmd + F(OS X),Ctrl + F(Windows/Linux),输入一些字符，然后使用自动补全；";
                tipsGifUrl = "https://camo.githubusercontent.com/45d6f8753fd6b4c229e2676061f4e7cf8852e432/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d3848426" +
                        "1757739304959552f56466f53713737456266492f41414141414141414f73732f5f38424d4e6a67417374342f773431382d683236382d6e6f2f36312d66696e64636f6d706c6574696f6e2e676966";
                break;
            case "23.隐藏所有面板(Hide All Panels)":
                tipsContent = "描述：切换编辑器铺满整个程序界面，隐藏其他的面板。再次执行该操作，将会回到隐藏前的状态。\n" +
                        "调用：Menu → Window → Active Tool Window → Hide All Windows；\n" +
                        "快捷键：Cmd +Shift + F12(OS X)、Ctrl + Shift + F12(Windows/Linux)；";
                tipsGifUrl = "https://camo.githubusercontent.com/9761b20320558de4fe65dede169ecb0355a7ea19/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d49354b4" +
                        "574716a4c3663632f56445a75797864546937492f41414141414141414f42382f6a724d52357868746d45492f773536362d683338372d6e6f2f34322d68696465616c6c77696e646f77732e676966";
                break;
            case "24.高亮一切(Hightlight All the Things)":
                tipsContent = "描述：该操作将会高亮某个字符在当前文件中所有出现的地方。这不仅仅是简单的匹配，实际上它会分析当前的作用域，只高亮相关的部分。\n" +
                        "调用：Menu → Edit → Find → Highlight Usages in File；\n" +
                        "定位到上一处/下一处：Menu → Edit → Find → Find Next/Previous；\n" +
                        "快捷键：相关快捷键请在菜单中查看；\n" +
                        "更多：\n" +
                        "如果高亮一个方法的return或throw语句，将会高亮这个方法的所有出口/结束点；\n" +
                        "如果高亮某个类定义处的extend或implements语句，将会高亮继承的或实现的方法；\n" +
                        "高亮一个import语句也会高亮使用到的地方；\n" +
                        "按下Esc可以退出高亮模式；";
                tipsGifUrl = "https://camo.githubusercontent.com/1356f628f597f28c5807e7f74101e3c8a67e9487/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d50485146597163" +
                        "596935382f552d745174617a754362492f41414141414141414d72452f53474e426d7447774d416b2f773139382d683138342d6e6f2f30312d686967686c696768742e676966";
                break;
            case "25.内联(Inline)":
                tipsContent = "描述：当你开始对提取操作有点兴奋的时候，突然觉得东西太多了，怎么办呢？这是一个和提取相反的操作。该操作对方法、字段、参数和变量均有效。\n" +
                        "调用：Menu → Refactor → Inline\n" +
                        "快捷键：Cmd + Alt + N(OS X)、Ctrl + Alt + N(Windows/Linux)；";
                tipsGifUrl = "https://camo.githubusercontent.com/7f5e1a6b6caa1ea444c965e3c95e541c044ff30b/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d4f67764373786c5" +
                        "36c686b2f5645347a7449566d4567492f41414141414141414f63342f544a64546347477a655a632f773439352d683233322d6e6f2f35342d696e6c696e652e676966";
                break;
            case "26.审查变量(Inspect Variable)":
                tipsContent = "描述：该操作可以在不打开计算表达式对话框就能审查表达式的值。\n" +
                        "快捷键：调试状态下，按住Alt键，然后单击表达式即可。";
                tipsGifUrl = "https://camo.githubusercontent.com/4a7a64389d1ef828e41e0ce9eeb5ea886f1b939a/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d653846614d49512d6f34672f5642715f59" +
                        "4b6f32374e492f41414141414141414e69512f524c6c3463346e51434d512f773738332d683235302d6e6f2f32382d6d6f7573655f6576616c756174655f65787072657373696f6e2e676966";
                break;
            case "27.合并行和文本(Join Lines and Literals)":
                tipsContent = "描述：这个操作比起在行末使劲按删除键爽多了！该操作遵守格式化规则，同时：\n" +
                        "\n" +
                        "合并两行注释，同时移除多余的//；\n" +
                        "合并多行字符串，移除+和双引号；\n" +
                        "合并字段的声明和初始化赋值；\n" +
                        "快捷键：Ctrl + Shift + J；";
                tipsGifUrl = "https://camo.githubusercontent.com/9780c04c2a3da58b11603f41fc034276165e8da8/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d42313842596c48754965302f564168474174" +
                        "41434850492f41414141414141414e53632f477a59497547454e6958552f773336352d683330332d6e6f2f31382d6a6f696e6c696e65732e676966";
                break;
            case "28.回到上一个工具窗口(Jump to Last Tool Window)":
                tipsContent = "描述：有时候你会从某个工具窗口跳到编辑器里面，然后又需要重新回到刚才操作的那个工具窗，比如你查找使用情况的时，使用该操作可以在不使用鼠标的情况下跳转到之前的工具窗口。\n" +
                        "快捷键：F12；";
                tipsGifUrl = "https://camo.githubusercontent.com/da9251d2b1b82cc71b317d0a2e07a02170256cc7/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d31692d36326f5045315f632f564455676a4130" +
                        "45676c492f41414141414141414f41632f7a487730442d7a445738632f773439352d683137362d6e6f2f34312d6c617374746f6f6c77696e646f772e676966";
                break;
            case "29.上一个编辑位置(Last Edit Location)":
                tipsContent = "描述：该操作将使得你导航到上一处你改动过的地方，这与点击工具栏上的返回箭头回到上一个定位位置是不一样的，该操作将会返回到上一个编辑的位置。\n" +
                        "快捷键： Cmd + Shift + Delete(OS X)、Ctrl + Shift + Backspace\uFEFF(Windows/Linux);";
                tipsGifUrl = "https://camo.githubusercontent.com/174d321999eda8faa7180bf84d514078807067ca/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d49374542333631745376512f56416341684b6a6d66" +
                        "74492f41414141414141414e51772f574a31327a57636b5478302f773333392d683130302d6e6f2f31372d6e617669676174652d70726576696f75732d6368616e6765732e676966";
                break;
            case "30.动态模板(Live Templates)":
                tipsContent = "描述：动态模板是一种快速插入代码片段的方法，使用动态模板比较有意思的是你可以使用合适的默认值将模板参数化，当你插入代码片段时，这可以指导你完成参数。\n" +
                        "更多：如果你知道模板的缩写，就可以不必使用快捷键，只需要键入缩写并使用Tab键补全即可。\n" +
                        "快捷键：Cmd + J(OS X)、Ctrl + J(Windows/Linux);";

                tipsGifUrl = "https://camo.githubusercontent.com/39ad5c820974097991b7b408f8f13d8369b43ea9/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d7544617a654132537544552f5641426544643234346" +
                        "7492f41414141414141414e4c302f4c764944377a76356462412f773435362d683235382d6e6f2f31352d6c6976655f74656d706c617465732e676966";
                break;
            case "31.日志断点(Logging Breakpoints)":
                tipsContent = "\n" +
                        "描述：这是一种打印日志而不是暂停的断点，当你想打印一些日志信息但是不想添加log代码后重新部署项目，这是一个非常有用的操作。\n" +
                        "调用：在断点上右键，取消Suspend的勾选，然后勾选上Log evaluated Expression，并在输入框中输入你要打印的日志信息。";
                tipsGifUrl = "https://camo.githubusercontent.com/1ba05cc7ea4a98e1ec9e6c4ec38fc5958ae02d68/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d4843746d6253306c4558342f5642474c6643737a7679" +
                        "492f41414141414141414e5a672f706e6a484f49504a5034552f773630312d683437302d6e6f2f32332d6c6f6767696e67627265616b706f696e74732e676966";
                break;
            case "32.标记对象(Mark Object)":
                tipsContent = "描述：当你在调试的时候，这个操作可以让你给某个特殊的对象添加一个标签，方便你后面很快地辨认。在调试时，当你从一堆相似的对象中查看某个对象是否和之前是一样的，这就是一个非常有用的操作。\n" +
                        "调用：右键你需要标记的对象，选中Mark Object，输入标签；\n" +
                        "快捷键：选中对象时，按F3(OS X)、F11(Windows/Linux)；";

                tipsGifUrl = "https://camo.githubusercontent.com/b586a83d041bb703410218e72b725fb5ffb72642/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d5975635630734f566758452f5642775574334c30" +
                        "6757492f41414141414141414e6a6b2f32344737306750744676302f773630372d683330312d6e6f2f32392d6d61726b6f626a6563742e676966";
                break;
            case "33.在方法和内部类之间跳转(Move Between Methods and Inner Classes)":
                tipsContent = "描述：该操作让光标在当前文件的方法或内部类的名字间跳转。\n" +
                        "调用：Navigate → Next Method/Previous Method;\n" +
                        "快捷键：Ctrl + Up/Down\uFEFF(OS X)、Alt + Up/Down\uFEFF(Windows/Linux);";
                tipsGifUrl = "https://camo.githubusercontent.com/333d0f996b5524b63a7de0e89f9ad81952e74677/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d46584c674f57747465496f2f552d796759325531793" +
                        "1492f41414141414141414d73512f68784a5549735f6b6776772f773432352d683431342d6e6f2f30322d6d6f76655f6265747765656e5f6d6574686f64732e676966";
                break;
            case "34.上下移动行(Move Lines Up Down)":
                tipsContent = "描述：不需要复制粘贴就可以上下移动行了。\n" +
                        "快捷键：Alt + Shift + Up/Down\uFEFF；";
                tipsGifUrl = "https://camo.githubusercontent.com/aadc98e6a0ae262ce1ca91d60e81c209db0b5a0f/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d766b444e46754c303439452f555f585869334e4d" +
                        "7839492f41414141414141414d35382f64775136717a32764357592f773237392d683132322d6e6f2f30392d6d6f76656c696e65732e676966";
                break;
            case "35.移动方法(Move Methods)":
                tipsContent = "描述：这个操作和移动行操作很类似，不过该操作是应用于整个方法的，在不需要复制、粘贴的情况下，就可以将整个方法块移动到另一个方法的前面或后面。该操作的实际叫做“移动语句”，这意味着你可以移动任何类型的语句，你可以方便地调整字段或内部类的顺序。\n" +
                        "快捷键：Cmd + Alt + Up/Down(OS X)、Ctrl + Shift + Up/Down(Windows/Linux);\n";
                tipsGifUrl = "https://camo.githubusercontent.com/9fb9c19d9100d7a1afe7a7ed5ce0c02295aaf1b3/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d6d5a4735466a5f514d5f512f564152786e3854" +
                        "586d6b492f41414141414141414e4f6b2f415355705870442d4e4c672f773236342d683236362d6e6f2f31352d6d6f76656d6574686f64732e676966";
                break;
            case "36.定位到嵌套文件(Navigate to Nested File)":
                tipsContent = "描述：有时你有一堆存放在不同目录下的同名文件，例如不同模块下的AndroidManifest.xml文件，当你想定位到其中的一个文件，你会得到一堆搜索结果，" +
                        "\n你还得辨认哪个才是你需要的。通过在检索框中输入部分路径的前缀，并添加斜杠号，你就可以在第一次尝试的时候就找到正确的那个。\n" +
                        "快捷键：Cmd + O(OS X)、Ctrl + N\uFEFF(Windows/Linux);";
                tipsGifUrl = "https://camo.githubusercontent.com/2df87c99304ece620e1e2909cdfd2ae1cd9b35ce/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d32334332513253306332452f56467a45493569753047492f41414141414" +
                        "141414f774d2f4f73316a474d48475649412f773431382d683236382d6e6f2f36332d6e65737465646e617669676174696f6e2e676966";
                break;
            case "37.定位到父类(Navigate to parent)":
                tipsContent = "描述：如果光标是在一个继承父类重写的方法里，这个操作将定位到父类实现的地方。如果光标是在类名上，则定位到父类类名。\n" +
                        "Menu → Navigate → Super Class/Method\n" +
                        "快捷键：Cmd + U(OS X)、Ctrl + U(Windows/Linux);";
                tipsGifUrl = "https://camo.githubusercontent.com/cf0b84735e24205e90ac821101453a8c0a66a179/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d4843583563626a6b69756f2f56444a2d644a61377755492f41414" +
                        "141414141414e2d4d2f64573068376351396c30592f773431362d683239302f33392d6e61766967617465746f706172656e742e676966";
                break;
            case "38.取反补全(Negation Completion)":
                tipsContent = "描述：有时你自动补全一个布尔值，然后回到该值的前面添加一个感叹号来完成取反操作，现在通过使用输入!代替enter完成补全操作，就可以跳过这些繁琐的操作了。\n" +
                        "快捷键：代码补全的时候，按下!即可（有时需要上下键选中候选项）；";
                tipsGifUrl = "https://camo.githubusercontent.com/38bbc2bf805beeabc3ce7801af7da330257efabe/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d4c3937315844324e657a672f56464e30716c6a534a51492f4141" +
                        "4141414141414f6a382f356b39666b6a4f776a49512f773436362d683235342d6e6f2f35382d6e6567617465636f6d706c6574696f6e2e676966";
                break;
            case "39.根据编号打开面板(Open a Panel by Its Number)":
                tipsContent = "描述：你可能已经注意到某些面板的名称左边有一个数字，这里有个快捷操作可以打开它们。如果你没看到面板的名称，请点击IDE的左下角的切换按钮。\n" +
                        "快捷键：Cmd + 数字(OS X)、Alt + 数字(Windows/Linux);";
                tipsGifUrl = "https://camo.githubusercontent.com/5a8d611c3b5ac3d0a811c28c6cbb2868dd384ff6/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d3971694e583050304b536b2f564466424645414b5738492f4141" +
                        "4141414141414f44342f487974506f4a56303742412f773536372d683338372d6e6f2f34322d6f70656e70616e656c62796e756d6265722e676966";
                break;
            case "40.在外部打开文件(Open File Externally)":
                tipsContent = "描述：通过这个快捷键，简单地点击Tab，就可以打开当前文件所在的位置或者该文件的任意上层路径。\n" +
                        "快捷键：Cmd + 单击Tab(OS X)、Ctrl + 点击Tab(Windows/Linux);";
                tipsGifUrl = "https://camo.githubusercontent.com/3f7a4226a9f31e42d0bf964648e44adff196a1bf/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d45416f6972335a5031624d2f564674794f354f61555f492f4141" +
                        "4141414141414f75672f62366a654b4456542d424d2f773431382d683236382d6e6f2f36322d6f70656e66696e6465722e676966";
                break;
            case "41.参数信息(Parameter Info)":
                tipsContent = "描述：这个操作将显示和你在方法声明处写一样的参数列表，当你想看某个存在的方法的参数，这是一个很有用的操作。" +
                        "\n光标下的参数显示为黄色，如果没有参数显示黄色，意味着你的方法调用是无效的，很可能是某个参数分配不对。（例如一个浮点数赋值给了整型参数）。" +
                        "\n如果你正在写一个方法调用，突然离开编辑的地方，再返回的时候，输入一个逗号，就可以重新触发参数信息。\n" +
                        "快捷键：Cmd + P(OS X)、Ctrl + U(Windows/Linux);";
                tipsGifUrl = "https://camo.githubusercontent.com/6fc9ddf95e3a365b09dda1202905bd88a1e44b31/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d6e70756657613579796e6b2f5644764a704a37313742492f414141" +
                        "41414141414f48732f5378334f4864617066526b2f773437322d683139352d6e6f2f34342d706172616d65746572696e666f2e676966";
                break;
            case "42.后缀补全(Postfix Completion)":
                tipsContent = "描述：你可以认为该操作是一种代码补全，它会在点号之前生成代码，而不是在点号之后。实际上你调用这个操作和正常的代码补全操作一样：在一个表达式之后输入点号。\n" +
                        "例如对一个列表进行遍历，你可以输入myList.for，然后按下Tab键，就会自动生成for循环代码。\n" +
                        "\n" +
                        "调用： 你可以在某个表达式后面输入点号，出现一个候选列表，在常规的代码补全提示就可以看到一系列后缀补全关键字，同样的，你也可以在Editor → Postfix Completion中看到一系列后缀补全关键字。\n" +
                        "\n" +
                        "常用的有后缀补全关键字有：\n" +
                        "\n" +
                        ".for (补全foreach语句)\n" +
                        ".format (使用String.format()包裹一个字符串)\n" +
                        ".cast (使用类型转化包裹一个表达式)";
                tipsGifUrl = "https://camo.githubusercontent.com/a8a40b3eb9ab30d77193a091a5a6a79764ac6a75/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d724c4d646562396362424d2f56435655773059363536492f414141414" +
                        "14141414e74382f4a324b6952504d6a527a732f773437342d683133362d6e6f2f33332d706f7374666978636f6d706c6574696f6e2e676966";
                break;
            case "43.快速查看定义(Quick Definition Lookup)":
                tipsContent = "描述：你曾经是否想查看一个方法或者类的具体实现，但是不想离开当前界面？ 该操作可以帮你搞定。\n" +
                        "快捷键：Alt + Space / Cmd + Y(OS X)、Ctrl + Shift + I(Windows/Linux)\n";
                tipsGifUrl = "https://camo.githubusercontent.com/0afe532c991c3fc756ada0330f4de37d7025e15f/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d6d36623436682d6b3161632f555f4361313937784e78492f41414141" +
                        "414141414d79512f3657326b557956365275302f773538342d683139312d6e6f2f30352d717569636b646566696e6974696f6e2e676966";
                break;
            case "44.最近修改的文件(Recently Changed Files)":
                tipsContent = "描述：该操作类似于“最近访问（Recents）”弹窗，会显示最近本地修改过的文件列表，根据修改时间排列。可以输入字符来过滤列表结果。\n" +
                        "快捷键：Cmd + Shift + E(OS X)、Ctrl + Shift + E(Windows/Linux)";
                tipsGifUrl = "https://camo.githubusercontent.com/af31014cd597e73d8012e13477035eff1a672203/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d5f574e7647505a33617a302f5645543179736a596d45492f4141414" +
                        "1414141414f53412f62704162794b737a6a74552f773431312d683336352d6e6f2f34392d726563656e746c796564697465642e676966";
                break;
            case "45.最近访问(Recents)":
                tipsContent = "描述：该操作可以得到一个最近访问文件的可搜索的列表。\n" +
                        "快捷键：Cmd + E(OS X)、Ctrl + E(Windows/Linux)";
                tipsGifUrl = "https://camo.githubusercontent.com/cbe1e2232312c2af2fdeac8e9e29898923ece59f/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d45505642766e726450674d2f555f384f493466635a66492f41414" +
                        "141414141414e4b452f466a566d32624b694a7a412f773438302d683330302d6e6f2f31342d726563656e74732e676966";
                break;
            case "46.重构(Refactor This)":
                tipsContent = "描述：该操作可以显示所有对当前选中项可行的重构方法。这个列表可以用数字序号快速选择。\n" +
                        "\n" +
                        "快捷键：Ctrl + T(OS X)、Ctrl + Alt + Shift + T(Windows/Linux)";
                tipsGifUrl = "https://camo.githubusercontent.com/ae6b1cd97ad17002f8efc83a539f5a85c4f11fa6/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d535f7a77557a595334676b2f56455a4272424748306c492f41414" +
                        "141414141414f55772f6e37516f47686567745a512f773438302d683230362d6e6f2f35302d72656c6174656466696c652e676966";
                break;
            case "47.相关文件(Related File)":
                tipsContent = "描述：该操作有助于在布局文件和Activity/Fragment之间轻松跳转。这也是一个快捷操作，在类名/布局顶端的左侧。\n" +
                        "快捷键：Ctrl + Cmd + Up(OS X)、Ctrl + Alt + Home(Windows/Linux)";
                tipsGifUrl = "https://camo.githubusercontent.com/ae6b1cd97ad17002f8efc83a539f5a85c4f11fa6/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d535f7a77557a595334676b2f56455a4272424748306c492f41414" +
                        "141414141414f55772f6e37516f47686567745a512f773438302d683230362d6e6f2f35302d72656c6174656466696c652e676966";
                break;
            case "48.重命名(Rename)":
                tipsContent = "描述：你可以通过该操作重命名变量、字段、方法、类、包。当然了，该操作会确保重命名对上下文有意义，不会无脑替换掉所有文件中的名字；\n" +
                        "快捷键：Shift + F6\n" +
                        "更多：如果你忘记了这个快捷键，你可以使用快速修复（Quick Fix）的快捷键，它通常包含重命名选项。";
                tipsGifUrl = "https://camo.githubusercontent.com/facea93d58bb8e976bfc9205ba022b65194031fa/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d41526142746777663863632f5645393762725a4e6f49492f414141" +
                        "41414141414f65452f304a6c46447873784835672f773333322d683137372d6e6f2f35352d72656e616d652e676966";
                break;
            case "49.返回到编辑器(Return to the Editor)":
                tipsContent = "描述：一大堆快捷键操作会把你从编辑器带走（type hierarchy, find usages, 等等）。如果你想返回到编辑器，你有两个选项：\n" +
                        "\n" +
                        "Esc：该操作仅仅把光标移回编辑器。\n" +
                        "Shift + Esc：该操作会关闭当前面板，然后把光标移回到编辑器。\n" +
                        "快捷键：\n" +
                        "\n" +
                        "返回但保留打开的面板：Esc\n" +
                        "关闭面板并返回：Shift + Esc";
                tipsGifUrl = "https://camo.githubusercontent.com/1ee906aafdd09feba75c33e8edcbc266dcfbe56c/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d7134644d3464496e6743492f5644504c55395a616f68492f41414141" +
                        "414141414e5f672f35494573636b70347573492f773535302d683239392d6e6f2f34302d72657475726e746f656469746f722e676966";
                break;
            case "50. Select In":
                tipsContent = "描述：拿着当前文件然后问你在哪里选中该文件。恕我直言，最有用的就是在项目结构或者资源管理器中打开该文件。每一个操作都有数字或者字母作为前缀，" +
                        "\n可以通过这个前缀来快速跳转。通常，我会 Alt + F1 然后 回车(Enter) 来打开项目视图，然后 再用 Alt + F1 在OS X的Finder里找到文件。" +
                        "\n你可以在文件中或者直接在项目视图里使用该操作。\n" +
                        "\n" +
                        "快捷键：Alt + F1；";
                tipsGifUrl = "https://camo.githubusercontent.com/7b0868d94a00dc7a52f8f49aaa30408caf4a2df8/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d4d4656382d4a736d7a53552f56416d71754f72457338492f41414141" +
                        "414141414e54302f5f3254565f3052477467672f773434392d683333372d6e6f2f31392d73656c6563742d696e2e676966";
                break;
            case "51.分号/点 补全(Semicolon Dot Completion)":
                tipsContent = "描述：代码补全这个功能太棒啦！我们大概都对以下这种情况很熟悉：开始输入点什么东西，接着从IDE得到一些建议的选项，然\n" +
                        "\n后通过Enter或者Tab来选择我们想要的补全代码。其实还有另外一种方法来选择补全的代码：我们可以输入一个点(.)或者一个分号(;)。" +
                        "\n这样就会完成补全，添加所选字符。这在结束一条语句补全或者快速链式调用方法的时候特别有用。\n" +
                        "注意点：如果你要代码补全的方法需要参数，这些参数会被略过。\n" +
                        "快捷键：Autocomplete + \".\" 或者 \";\"";
                tipsGifUrl = "https://camo.githubusercontent.com/3738911e396395273afdcc5c1fef8b14374bbd7a/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d726b4c367233754a6565492f56476e77454a39554c59492f4141414141414" +
                        "1414f39302f6269456c474f70583630492f773335322d683137372d6e6f2f36392d73656d69636f6c6f6e646f74636f6d706c6574696f6e2e676966";
                break;
            case "52.显示当前运行点(Show Execution Point)":
                tipsContent = "描述：该操作会立刻把你的光标移回到当前debug处。\n" +
                        "通常的情况是： 1. 你在某处触发了断点 2. 然后在文件中随意浏览 3. 直接调用这个快捷键，快速返回之前逐步调试的地方。\n" +
                        "\n" +
                        "快捷键：（Debug时) Alt + F10；\n";
                tipsGifUrl = "https://camo.githubusercontent.com/386b9d8180ec836eb6b8a4969e4f19f5e1800148/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d7358456f4a7648645f51512f5643766f35434d6d4f75492f41414141414141" +
                        "414e35632f7a715f39594230352d33552f773434332d683238372d6e6f2f33362d657865637574696f6e706f696e742e676966";
                break;
            case "53.扩大选择(Shrink Selection)":
                tipsContent = "描述：该操作会在上下文逐渐扩大当前选择范围。例如，它会先选中当前变量，再选中当前语句，然后选中整个方法，等等。\n" +
                        "快捷键：Cmd + F2(OS X)、Ctrl + F2（Windows、Linux）";
                tipsGifUrl = "https://camo.githubusercontent.com/7f65ff75eabe5ff1dbe37bdecccebd3637915afd/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d374b6463665456632d69732f555f786832426247797a492f414141414141" +
                        "41414e46452f6a6f574a563971574242342f773335372d683231322d6e6f2f31322d657870616e645f736872696e6b5f73656c656374696f6e2e676966";
                break;
            case "54.终止进程(Stop Process)":
                tipsContent = "描述：该操作会终止当前正在运行的任务。如果任务数量大于一，则显示一个列表供你选择。在终止调试或者中止编译的时候特别有用！\n" +
                        "快捷键：Cmd + F2(OS X)、Ctrl + F2（Windows、Linux）";
                tipsGifUrl = "https://camo.githubusercontent.com/a19aa864a4eeaf947a989a3434aef917e4898493/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d366933455939495a4a42672f56437156795f61623345492f4" +
                        "1414141414141414e34552f656244376c4d394a3638512f773435312d683236352d6e6f2f33352d73746f70726f636573732e676966";
                break;
            case "55.Sublime Text式的多处选择(Sublime Text Multi Selection)":
                tipsContent = "描述：这个功能超级赞！该操作会识别当前选中字符串，选择下一个同样的字符串，并且添加一个光标。这意味着你可以在同一个文件里拥有多个光标，你可以同时在所有光标处输入任何东西。\n" +
                        "快捷键：Ctrl + G(OS X)、Alt + Ｊ（Windows、Linux）\n";
                tipsGifUrl = "https://camo.githubusercontent.com/334322ddfaae5a120d2ade313f61e08cddb35557/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d576e7848775075616b466f2f56434b6d44646b455474492f41" +
                        "414141414141414e714d2f5a48724e5434636c4f5a302f773232382d683134362d6e6f2f33322d6d756c746973656c656374696f6e2e676966";
                break;
            case "56.包裹代码(Surround With)":
                tipsContent = "描述： 该操作可以用特定代码结构包裹住选中的代码块，通常是if语句，循环，try/catch语句或者runnable语句。 如果你没有选中任何东西，该操作会包裹当前一整行。\n" +
                        "\n" +
                        "快捷键：Cmd + Alt + T(OS X)、Ctrl + Alt + T(Windows/Linux)";
                tipsGifUrl = "https://camo.githubusercontent.com/d7daf10a6cdd7691b4d6eb8d60a8d10e3500eddf/68747470733a2f2f6c68332e676f6f676c6575736572636f6e74656e742e636f6d2f2d574e7650596570645758592f555f3236386c4c727a57492f4141" +
                        "4141414141414e48632f436769727176455a5462772f773239392d683136372d6e6f2f31332d737572726f756e645f776974682e676966";
                break;
            case "57.临时断点(Temporary Breakpoints)":
                tipsContent = "描述：通过该操作可以添加一个断点，这个断点会在第一次被命中的时候自动移除。\n" +
                        "\n" +
                        "快捷键：Alt + 鼠标左键 点击代码左侧（鼠标）、Cmd + Alt + Shift + F8(OS X)、Ctrl + Alt + Shift + F8(Windows/Linux)";
                tipsGifUrl = "https://camo.githubusercontent.com/be8462f05f1693bb80150abd8f9ea270e17ba975/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d76386362734a78736970302f56424c57494f376f3046492f414141414" +
                        "14141414e626f2f584e4e69455f5a444367302f773438372d683231322d6e6f2f32342d74656d706f72617279627265616b706f696e74732e676966";
                break;
            case "58.调用层级树弹窗(The Call Hierarchy Popup)":
                tipsContent = "描述：该操作会给你展示 在一个方法的声明和调用之间所有可能的路径。\n" +
                        "\n" +
                        "快捷键：Ctrl + Alt + H\n" +
                        "\n";
                tipsGifUrl = "https://camo.githubusercontent.com/7416d7cbdb5e9f12f5b904508ab745892b594af7/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d4564623444795f626572592f552d39452d7831443738492f4141414141414" +
                        "1414d77672f4d7137585f58766a2d71672f773435312d683338342d6e6f2f30342d63616c6c696e676869657261726368792e676966";
                break;
            case "59.文件结构弹窗(The File Structure Popup)":
                tipsContent = "描述：该操作可以展示当前类的大纲，并且可以快速跳转。你还可以通过键盘输入来过滤结果。这是一种很高效的方法来跳转到指定方法。\n" +
                        "\n" +
                        "更多：\n" +
                        "\n" +
                        "你在输入字符的时候可以用驼峰风格来过滤选项。比如输入\"oCr\"会找到\"onCreate\"\n" +
                        "你可以通过勾选多选框来决定是否显示匿名类。这在某些情况下很有用，比如你想直接跳转到一个OnClickListener的onClick方法。\n" +
                        "快捷键：Cmd + F12(OS X)、Ctrl + F12(Windows/Linux)\n" +
                        "\n" +
                        "调用：Menu → Navigate → File Structure";
                tipsGifUrl = "https://camo.githubusercontent.com/4963ca81ae8bc58cbba872741d65af715051d657/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d6f55354d376770496f78302f552d33386b33504b5462492f414141414141" +
                        "41414d76592f46747a55516866687649632f773332362d683239372d6e6f2f30332d66696c657374727563747572652e676966";
                break;
            case "60.切换器(The Switcher)":
                tipsContent = "描述：该快捷键基本上就是IDE的alt+tab/cmd+tab命令。你可以用它在导航tab或者面板切换。一旦打开这个窗口，只要一直按着ctrl键，" +
                        "\n你可以通过对应的数字或者字母快捷键快速选择。你也可以通过backspace键来关闭一个已选中的tab或者面板。\n" +
                        "\n" +
                        "快捷键：Ctrl + Tab\n" +
                        "\n";
                tipsGifUrl = "https://camo.githubusercontent.com/a882ba7ae50c19a4edf668dba5f97cb01b64d3df/68747470733a2f2f6c68352e676f6f676c6575736572636f6e74656e742e636f6d2f2d41556b36734843634a566f2f56443558686679307548492f414141414141414" +
                        "14f4b672f4f397a37526f6d5a5a33492f773533322d683334392d6e6f2f34362d73776974636865722e676966";
                break;
            case "61.移除包裹代码(Unwrap Remove)":
                tipsContent = "描述：该操作会移除周围的代码，它可能是一条if语句，一个while循环，一个try/catch语句甚至是一个runnable语句。该操作恰恰和包裹代码（Surround With）相反。\n" +
                        "\n" +
                        "快捷键：Cmd + Shift + Delete(OS X)、Ctrl + Shift + Delete(Windows/Linux)";
                tipsGifUrl = "https://camo.githubusercontent.com/cac02c6db2bd306d4153cfddd4cbeebbe6877b55/68747470733a2f2f6c68362e676f6f676c6575736572636f6e74656e742e636f6d2f2d306b5f71656d78616871452f56413251766332384757492f41414141414141414" +
                        "e56632f68617a33687956672d6e4d2f773534362d683233372d6e6f2f32302d756e777261702e676966";
                break;
            case "62.版本控制操作弹窗(VCS Operations Popup)":
                tipsContent = "描述：该操作会给你显示最常用的版本控制操作。如果你的项目没有用git等版本控制软件进行管理，它至少会给你提供一个由IDE维护的本地历史记录。\n" +
                        "快捷键：Ctrl + V(OS X)、Alt + `(Windows/Linux)";
                tipsGifUrl = "https://camo.githubusercontent.com/dc3875603552f5e40fb8f41be8735e0a3c8efbff/68747470733a2f2f6c68342e676f6f676c6575736572636f6e74656e742e636f6d2f2d454343613561714278436b2f564330325436727a3167492f4141414141414141" +
                        "4e37452f6474443234434e4a6264672f773435302d683332392d6e6f2f33372d766373706f7075702e676966";
                break;
            default:
                break;
        }

        int i = Messages.showIdeaMessageDialog(project, tipsContent,
                "Tips之 " + tipsName, new String[]{
                        "查看该Tips的Gif动图", "关闭"
                }, 0, new ImageIcon(getClass().getResource("/icons/jetbrains_small.png")), null);

        if (i == 0) {
            BrowserLauncher.getInstance().open(tipsGifUrl);
        }
    }

}