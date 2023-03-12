package composite.example.directory.after;

public abstract class AbstractFile {
	private String name ;
	private int depth = 0 ;
	
	public AbstractFile(String name) { this.name = name ; }
	public String getName() { return name; }
	public void setDepth(int depth) { this.depth = depth ; }
	public int getDepth() { return depth ; }

	public abstract int getSize() ;
	public abstract void print() ;
}
