import java.util.ArrayList;
import java.util.List;

// Composite: Represents a Directory that can contain Files or other Directories
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void open() {
        System.out.println("Opening directory: " + name);
    }

    @Override
    public int size() {
        int totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.size();
        }
        return totalSize;
    }

    @Override
    public void delete() {
        System.out.println("Deleting directory: " + name);
        for (FileSystemComponent component : children) {
            component.delete();
        }
    }

    @Override
    public void displayContents() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : children) {
            component.displayContents();
        }
    }
}
