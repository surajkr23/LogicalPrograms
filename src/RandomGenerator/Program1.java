package RandomGenerator;
import java.util.Random;
public class Program1 {
	
	public static int generateRandomNumber()
	{
		Random random=new Random();
		return random.nextInt();
	}
	public static String generateRandomString(int length)
	{
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random=new Random();
		StringBuilder sb=new StringBuilder(length);
		
		for(int i=0; i<length; i++)
		{
			int randomIndex=random.nextInt(characters.length());
			int randomChar=characters.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
			System.out.println("Random Numbers:");
			for(int i=1;i<5;i++)
			{
				int randomNumber=generateRandomNumber();
				System.out.println(randomNumber);
			}
			System.out.println("Random Strings:");
			for(int i=1;i<5;i++)
			{
				String randomString=generateRandomString(8);
				System.out.println(randomString);
			}

	}

}
