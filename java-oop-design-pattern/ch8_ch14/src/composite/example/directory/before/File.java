package composite.example.directory.before;

public class File {
	private String name ;
	private int size ;
	private int depth = 0 ;
	
	public File(String name, int size) {
		this.name = name ;
		this.size = size ;
	}
	public void setDepth(int depth) {
		this.depth = depth ;
	}
	public String getName() { return name ; }
	public int getSize() { return size ; }
	public void print() {
		for ( int i = 0 ; i < depth ; i ++ )
			System.out.print("\t") ;
		System.out.println("[File] " + name + ", Size: " + size) ;
	}
}
