// multiple inheritance
public class FullStackDeveloper implements BackEndDeveloper, FrontEndDeveloper, DataBaseAdmin{
	public void doBackEndProject() {
		System.out.println("Fullstack developer  is working on Backend project");
	}
	
	public void doFrontEndProject() {
		System.out.println("Fullstack developer  is working on frontend project");
	}
	
	public void doDataBaseProject() {
		System.out.println("Fullstack developer  is working on database project");
	}

}
