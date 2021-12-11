import java.util.Scanner;
public class L4_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите текст для шифрования: ");
		String Letter1 = in.nextLine();
		System.out.print("Введите ключ: ");
		int key = in.nextInt();
		
		char oldText [] = Letter1.toCharArray();
		long simbols [] = new long[oldText.length];
		char newText [] = new char[oldText.length];
		
		for(int i=0; i<oldText.length; i++) {
			simbols[i] = oldText[i] + key;
			newText[i] = (char)simbols[i];
		}
		
		String Letter2;
		Letter2 = new String (newText);
		
		System.out.println("Текст после шифрования: " + Letter2);
		
		System.out.print("Выполнить обратное преобразование ? (y/n): ");
		Scanner scan = new Scanner(System.in);
		String ans = scan.nextLine();
		
		switch(ans) {
		case "y":{
			char oldText2 [] = Letter2.toCharArray();
			long simbols2 [] = new long[newText.length];
			char newText2 [] = new char[newText.length];
			
			for(int j=0; j<newText.length; j++) {
				simbols2[j] = oldText2[j] - key;
				newText2[j] = (char)simbols2[j];
			}
			
			String Letter3;
			Letter3 = new String (newText2);
			
			System.out.println("Текст после  обратного преобразования: " + Letter3);
			break;
		}
		case "n":{
			System.out.println("До свидания!");
			break;
		}
		default:{
		System.out.println("Некорректный ввод данных");
		}
		}
	}
}