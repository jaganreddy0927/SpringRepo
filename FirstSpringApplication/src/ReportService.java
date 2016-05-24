
public class ReportService implements Service {
	
	private Generator g;
	public ReportService(Generator g){
		this.g=g;
	}

	@Override
	public void showReoprts() {
		g.generateReports();
		// TODO Auto-generated method stub
		
	}

}
