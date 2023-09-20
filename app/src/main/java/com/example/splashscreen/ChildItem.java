public class ChildItem {
    private String childName;

    public ChildItem(String childName) {
        this.childName = childName;
    }

    // Getters and setters

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public boolean isGroup() {
        return false;
    }
}
