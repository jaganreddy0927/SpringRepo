import java.util.List;
import java.util.Map;

public class CollectionTestBean {
	private List list;
	private Map map;
	public void setList(List list) {
		this.list = list;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public void Show(){
		System.out.println("****************Student Details**************************");
		System.out.println(list);
		System.out.println("----------------Student Resualts-------------------------");
		System.out.println(map);
		System.out.println("=================================================");
		System.out.println(list.getClass().getName()+"\t\t\t\t|");
		System.out.println(map.getClass().getName()+"\t\t\t\t|");
		System.out.println("=================================================");
	}

}
