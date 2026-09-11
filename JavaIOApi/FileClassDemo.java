import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.List;

public class FileClassDemo {

    /*
        An instance of a File does not allow you to access the content of the file it represents. 
        With this instance, you can check if this file exists or is readable (among other things).
    */

    public static void main(String[] args) throws IOException {
        File file = new File("/home/nitesh/library/JAVA-Core/JavaIOApi", "test.txt");

        // boolean isExists = file.exists();
        // IO.println("Does file exists: " + isExists);

        // boolean isCreated = file.createNewFile();
        // IO.println("Is file created: " + isCreated);

        // IO.println("can write: " + file.canWrite());
        
        // String content1 = "Hello, World!";
        // String content2 = "Bye, World!";

        // IO.println(List.of(content.toCharArray()));
        // IO.println(List.of(content));

        // recommended way to write multiliple lines
        // use the last argument to prevent clearing existing content 
        // Files.write(file.toPath(), List.of(content1 + " again", content2 + " again") /*, StandardOpenOption.APPEND */);

        // not recommended
        // Files.writeString(file.toPath(), "Writing usign writeString()", StandardOpenOption.APPEND);

        Path pathToFile = file.toPath();
        // IO.println(Files.isRegularFile(p athToFile, new LinkOption[] {}));
        // File file2 = pathToFile.toFile();

        // IO.println(file.equals(file2));
        
        // List<String> lines = Files.readAllLines(pathToFile);
        // IO.println(lines);

        // file.delete(); // old way to do

        // Files.delete(pathToFile); // new way to do
        // FileTime fileTime = Files.getLastModifiedTime(pathToFile, new LinkOption[]{});
        // IO.println("Last Modified1: " + fileTime);
        
        // Files.setLastModifiedTime(pathToFile, fileTime);

        // IO.println("Last Modified2: " + Files.getLastModifiedTime(pathToFile, new LinkOption[] {}));

        // RandomAccessFile rf = new RandomAccessFile(file, "rw");

        // rf.write(1);
        // rf.writeUTF("writing string using writeUTF(str) method");

        // IO.println(/*returns int type*/rf.readUTF() + "/n" + /*reads the text from next line*/rf.readLine());

        // rf.close();

        // URI uri = file.toURI();
        // IO.println(uri);

        // Paths.get(uri); // it calls Path.of(URI uri) under the hood
        // Path pathToFile2 = Path.of(uri);
        Path pathToFile3 = Path.of("layer1", "layer2");
        // IO.println(pathToFile3);
        // Files.createDirectories(pathToFile3);

        Path fullPathsToFile = pathToFile3.resolve("demo4.txt"); // join the paths
         
        // IO.println("File created: " + Files.createFile(fullPathsToFile));

        Path relativePath = pathToFile3.relativize(fullPathsToFile);
        // IO.println("relative path from " +pathToFile3 + " to " + fullPathsToFile + " is: " +relativePath);

        // Path pathToFile1 = file.toPath();

        // IO.println(pathToFile2.equals(pathToFile1));

        // FileSystem fs = FileSystems.getDefault();
        // IO.println("Filesystem: " +fs);

        BasicFileAttributes attr = Files.readAttributes(pathToFile, BasicFileAttributes.class);

        IO.println("Creation Time: " + attr.creationTime() + "\n"
                +"Modification Time: " + attr.lastModifiedTime() + "\n"
                + "Last Access Time: " + attr.lastAccessTime());
        
        // sets the last modified time in milliseconds:
        long currentTime = System.currentTimeMillis();
        FileTime ft = FileTime.fromMillis(currentTime);
        Files.setLastModifiedTime(pathToFile, ft);
    }
}

