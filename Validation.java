
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public static void main(String[] args) {
		String name;
		String egnOrBulstat;
		String facKey;
		String email;
		Scanner console = new Scanner(System.in);
		Pattern pattern;
		Matcher matcher;
		System.out.println("Enter name");
		name = console.nextLine();
		System.out.println("Enter EGN or bulstat");
		egnOrBulstat = console.nextLine();
		System.out.println("Enter facility key");
		facKey = console.nextLine();
		System.out.println("Enter email");
		email = console.nextLine();
		pattern = Pattern.compile("([A-Za-z ])+");
		matcher = pattern.matcher(name);
		if(matcher.matches()){
			System.out.println("Name:" + true);
		}else{
			System.out.println("Name:" + false);
		}
		pattern = Pattern.compile("(\\d)+");
		matcher = pattern.matcher(egnOrBulstat);
		if(matcher.matches() && (egnOrBulstat.length()==10)){
			System.out.println("EGN:" + true);
		}if(matcher.matches() && (egnOrBulstat.length()==9 || egnOrBulstat.length()==13)){
			System.out.println("Bulstat:" + true);
		}else{
			System.out.println("EGN or Bulstat:" + false);
		}
		pattern = Pattern.compile("(\\d){2}-(\\d){3}");
		matcher = pattern.matcher(facKey);
		if(matcher.matches()){
			System.out.println("Facility key:" + true);
		}else{
			System.out.println("Facility key:" + false);
		}
		pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
		matcher = pattern.matcher(email);
		if(matcher.matches()){
			System.out.println("email:" + true);
		}else{
			System.out.println("email:" + false);
		}
		console.close();
		
	}
}