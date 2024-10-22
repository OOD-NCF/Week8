// Leaf: Represents a File in the file system
class File implements FileSystemComponent {
    private String name;
    private int size; // Size in KB for simplicity

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void open() {
        System.out.println("Opening file: " + name);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + name);
    }

    @Override
    public void displayContents() {
        System.out.println("File: " + name);
    }
}