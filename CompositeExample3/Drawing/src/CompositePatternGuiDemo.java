public class CompositePatternGuiDemo {
    public static void main(String[] args) {
        // Create leaf objects (individual shapes)
        Graphic rectangle = new Rectangle();
        Graphic circle = new Circle();

        // Create a composite object (a group of shapes)
        Group group1 = new Group();
        group1.add(rectangle);
        group1.add(circle);

        // Create another composite object (a nested group)
        Group group2 = new Group();
        group2.add(new Rectangle());
        group2.add(group1); // Add group1 to group2, forming a composite of composites

        // Client draws all shapes via the composite structure
        System.out.println("Drawing Group 2:");
        group2.draw();
    }
}
