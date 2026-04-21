import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) {
        // 1. 指定我们要循环显示的文件名
        String[] files = { "./file1.txt", "./file2.txt", "./file3.txt" };

        System.out.println(">>> 程序已启动，开始循环读取文件内容...");
        System.out.println(">>> 提示：按 Ctrl + C 可以强制停止程序。");

        // 2. 开启无限循环
        while (true) {
            for (String fileName : files) {
                File file = new File(fileName);

                System.out.println("\n------------------------------------");
                System.out.println("正在读取文件: " + fileName);

                if (file.exists()) {
                    // 3. 读取并显示内容
                    printFile(file);
                } else {
                    System.out.println("[警告] 文件不存在，请检查文件名是否正确！");
                }

                // 4. 停顿 3 秒再读下一个，不然刷新太快看不清
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    private static void printFile(File file) {
        try (BufferedReader br = new java.io.BufferedReader(
                new java.io.InputStreamReader(new java.io.FileInputStream(file), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("读取出错: " + e.getMessage());
        }
    }
}
