import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.List;
import java.util.Set;

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
        // Path pathToFile3 = Path.of("layer1", "layer2");
        // IO.println(pathToFile3);
        // Files.createDirectories(pathToFile3);

        // Path fullPathsToFile = pathToFile3.resolve("demo4.txt"); // join the paths

        // IO.println("File created: " + Files.createFile(fullPathsToFile));

        // Path relativePath = pathToFile3.relativize(fullPathsToFile);
        // IO.println("relative path from " +pathToFile3 + " to " + fullPathsToFile + " is: " +relativePath);

        // Path pathToFile1 = file.toPath();

        // IO.println(pathToFile2.equals(pathToFile1));

        FileSystem fs = FileSystems.getDefault();
        IO.println("Filesystem: " + fs);

        // BasicFileAttributes attr 
        //          = Files.readAttributes(pathToFile, BasicFileAttributes.class);

        // IO.println("Creation Time: " + attr.creationTime() + "\n"
        //         +"Modification Time: " + attr.lastModifiedTime() + "\n"
        //         + "Last Access Time: " + attr.lastAccessTime());

        // sets the last modified time in milliseconds:
        // long currentTime = System.currentTimeMillis();
        // FileTime ft = FileTime.fromMillis(currentTime);
        // Files.setLastModifiedTime(pathToFile, ft);

        // Listing a file system's root directories
        // Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        // dirs.forEach(path -> IO.println(path));

        // creates new directory on POSIX file systems

        // Set<PosixFilePermission> perms = 
        //         PosixFilePermissions.fromString("rwxr-x---");
        // FileAttribute<Set<PosixFilePermission>> attr = 
        //         PosixFilePermissions.asFileAttribute(perms);

        // throws NoSuchFileException if parent directory does not exists
        // Files.createDirectory(Path.of("new-dir3", "new-dir4"), attr);

        // Creates a directory by creating all nonexistent parent directories first
        // Files.createDirectories(Path.of("new-dir1", "new-dir2"), attr);

        // read the POSIX permission provided
        // Set<PosixFilePermission> permissions = 
        //         Files.getPosixFilePermissions(Path.of("new-dir"), new LinkOption[] {});

        // permissions.forEach(p -> IO.println(p));

        // write the POSIX permission
        // Files.setPosixFilePermissions(pathToFile, perms);

        // Listing the content of the directory
        try (DirectoryStream<Path> stream = 
                    Files.newDirectoryStream(Path.of("/home/nites/library"))){
            for (Path p : stream) {
                IO.println(p.getFileName());
            }
        }   
        catch (IOException | DirectoryIteratorException ex) {
            System.err.println(ex.getMessage());
        }

        // Walking the File Tree

        
    }
}


