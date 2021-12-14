package game.objects;

public class GameObject implements Comparable <GameObject>{
	private int id; 
	private String name;
	
	private int comparison[][]= {
			
	//@formatter:on
			//				rock		paper		scissors
			/*rock */		{0,			 -1,			1},
			/*paper */		{1,			  0,		   -1},
			/*scissors */	{-1,		  1,			0}
	};
	//@formatter:off
	
	@Override
	public int compareTo(GameObject other) {
		return comparison[id][other.id];
	}
	public int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
	
	
}
