import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier {
    public static void main(String[] args) {
        // 1. 定义源文件和目标文件的数组 (根据你之前的路径层级)
        String folderPath = "./";
        String[] sourceFiles = { "file1_copy.txt", "file2_copy.txt", "file3_copy.txt" };

        System.out.println(">>> 正在开始文件复制任务...");

        for (String fileName : sourceFiles) {
            String sourcePath = folderPath + fileName;
            String targetPath = folderPath + fileName.replace(".txt", "_copy.txt");

            // 2. 执行复制动作
            copyFile(sourcePath, targetPath);
        }

        System.out.println(">>> 所有文件复制完成！请检查文件夹。");
    }

    /**
     * 核心复制方法：使用字节流，可以处理任何类型的文件（文本、图片等）
     */
    private static void copyFile(String src, String dest) {
        // 使用 try-with-resources 自动关闭流，防止“报黄”
        try (FileInputStream in = new FileInputStream(src);
                FileOutputStream out = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024]; // 缓冲区，每次读 1KB
            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            System.out.println("成功：[" + src + "] -> [" + dest + "]");

        } catch (IOException e) {
            System.err.println("复制失败 " + src + ": " + e.getMessage());
        }
    }
}