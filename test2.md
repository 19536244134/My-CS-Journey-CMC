JAVA
错误路径解决办法

第一步：确认是否安装了 Java 插件
打开 VS Code
点击左侧扩展图标（四个方块）
搜索并安装以下插件：
Java Extension Pack（由 Red Hat 提供）
🔗 https://marketplace.visualstudio.com/items?itemName=redhat.vscode-java-pack
✅ 安装后会自动包含：
Language Support for Java
Debugger for Java
Maven for Java
etc.

第二步：搜索之后
显示
你已经成功安装了 Java Extension Pack，并且 VS Code 提示：

🔔 Java Language Server configuration changed, please reload Visual Studio Code.

这说明：Java 插件已安装，但需要重新加载 VS Code 才能生效。

接下来你应该做什么？
 第一步：点击“Reload”按钮
在右下角弹出的提示框中，点击蓝色的 Reload 按钮：

 第二步：等待插件初始化完成
重启后，VS Code 会自动检测项目。
可能会弹出：
“Select JDK”
或者 “Configure Java Project”
👉 如果出现，请选择你的 JDK 路径（例如：C:\Program Files\Java\jdk-1.8.0_XXX）





✅ 第三步：创建或配置 launch.json
现在你可以为你的 TryCatchDemo.java 创建运行配置。

🔧 方法一：右键运行（推荐）
在 TryCatchDemo.java 文件中右键
选择 “Run” 或 “Debug”
如果第一次运行，VS Code 会提示你创建配置
🔧 方法二：手动创建 launch.json
点击左侧「运行」图标 → 「配置」→ 「Add Configuration...」
选择 Java → Java Application
填写如下内容：
Json
编辑
{
    "name": "TryCatchDemo",
    "type": "java",
    "request": "launch",
    "mainClass": "TryCatchDemo",
    "projectReferred": true,
    "args": [],
    "vmArgs": ""
}
⚠️ 注意：mainClass 是类名，不要加包名（因为没有 package）

保存后，点击顶部的 绿色三角形运行按钮 即可运行！



第四步：测试运行结果
运行后应该看到输出：

Text
编辑
捕获异常：Array index out of range: 0
java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 0
    at TryCatchDemo.main(TryCatchDemo.java:7)
执行完毕！
✅ 成功！




额外建议：避免路径问题
你现在的问题是路径中有空格（VS Code），导致 PowerShell 解析失败。

✅ 推荐做法：
改名文件夹（长期最佳方案）： 把 D:\ruanjian\VS Code\java-projects 改成：
Text
编辑
D:\ruanjian\VSCode\java_projects
👉 去掉空格，更简洁，避免后续问题。
使用命令行时加引号：
Powershell
编辑
cd "D:\ruanjian\VS Code\java-projects"