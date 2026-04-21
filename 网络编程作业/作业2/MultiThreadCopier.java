import java.io.*;

public class MultiThreadCopier {
    public static void main(String[] args) {
        String[] files = { "./作业2/file1_copy.txt", "./作业2/file2_copy.txt", "./作业2/file3_copy.txt" };

        System.out.println(">>> 开始多线程并行复制任务...");

        for (String fileName : files) {
            // 为每个文件创建一个独立的线程
            Thread t = new Thread(() -> {
                copyFile(fileName, fileName.replace(".txt", "_multicopy.txt"));
            });
            t.start(); // 三个线程几乎同时启动
        }
    }

    private static void copyFile(String src, String dest) {
        try (FileInputStream in = new FileInputStream(src);
                FileOutputStream out = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            System.out.println("【线程通知】：已成功完成 " + src + " 的复制！");

        } catch (IOException e) {
            System.out.println("复制出错: " + e.getMessage());
        }
    }
}