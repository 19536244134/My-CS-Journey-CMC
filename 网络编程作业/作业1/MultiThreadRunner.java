import java.io.*;

public class MultiThreadRunner {
    public static void main(String[] args) {
        // 创建并启动显示线程
        Thread displayThread = new Thread(() -> {
            String[] files = { "./作业1/file1.txt", "./作业1/file2.txt", "./作业1/file3.txt" };
            while (true) {
                for (String fileName : files) {
                    System.out.println("\n--- [线程正在读取]: " + fileName + " ---");
                    readFile(fileName);
                    try {
                        Thread.sleep(3000); // 每3秒换一个
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        });

        displayThread.start(); // 启动线程
        System.out.println(">>> 主线程已启动，后台显示线程正在运行...");
    }

    private static void readFile(String path) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("读取失败: " + e.getMessage());
        }
    }
}