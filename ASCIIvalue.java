package kas;

public class ASCIIvalue {
	public static void main(String args[]){
		String ch;
		for(int i=1; i<=255; i++){
			ch= new Character((char)i).toString();
			System.out.println(i+"->"+ch+"\t");
		}
		
	}

}
