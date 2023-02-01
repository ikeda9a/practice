public class book extends TangibleAsset{
	private String isbn;
	public Book (String name,int price,String color,String isdn){
		super(name,price,color)
		this.isdn = isdn;
		}
	public String getIsdn(){return this.isdn;}
}
