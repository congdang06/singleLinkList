
public class MainLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkList newLink = new SingleLinkList();
		newLink.AddFront(23);
		newLink.AddFront(10000000);
		newLink.AddFront(234123424);
		newLink.AddFront(24);
		System.out.print("AddFront: ");
		newLink.printLinkList();
		
		System.out.print("\n\nAddBack: ");
		newLink.AddBack(2);
		newLink.AddBack(12);
		newLink.AddBack(85);
		newLink.printLinkList();
		
		System.out.print("\n\nGetFirstData: ");
		System.out.print(newLink.getFirst());
		
		System.out.print("\n\nGetLastData: ");
		System.out.print(newLink.getLast());
		
		System.out.print("\n\nLinkListSize: ");
		System.out.print(newLink.size());
		
//		System.out.print("\n\nDeleteValue: ");
		newLink.deleteValue(24);
		System.out.print("\n\nfirst data delete: " );
		newLink.printLinkList();
		
		newLink.deleteValue(23);
		System.out.print("\nDelete any value: ");
		newLink.printLinkList();
		
		System.out.print("\nClear all data: ");
		newLink.clear();
		newLink.printLinkList();
				
	}

}
