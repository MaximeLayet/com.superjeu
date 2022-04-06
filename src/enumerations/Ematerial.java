package enumerations;

public enum Ematerial {
    MUD, WOOD, BRICK;

    Ematerial() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ematerial{");
        sb.append('}');
        return sb.toString();
    }
}
