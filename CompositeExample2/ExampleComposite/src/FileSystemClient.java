// Client: Testing the Composite Pattern
public class FileSystemClient {
    public static void main(String[] args) {
        // Create some files
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        File file3 = new File("file3.txt", 300);

        // Create a directory and add files to it
        Directory dir1 = new Directory("Documents");
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        // Create another directory and add dir1 and another file
        Directory dir2 = new Directory("My Folder");
        dir2.addComponent(dir1);
        dir2.addComponent(file3);

        // Perform operations
        System.out.println("Directory size: " + dir2.size() + " KB");
        dir2.displayContents();
        dir2.delete();
    }
}