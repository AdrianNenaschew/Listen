public class BuildTree {

	public Element root;
	public Element aknoten = root;

	public BuildTree() {
		root = new Element(100);
		root.left = new Element(50);
		root.right = new Element(150);
	}

	
}