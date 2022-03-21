package Java8;

public class AgeTest {
	
	public void testAge(int age) {
		if(age < 0 || age > 100)
			throw new InvalidAgeException();
		else if(age >=0 && age <=17)
			throw new InAppropriateAgeException();
		else
			System.out.println("You are eligible for voting..");
			
	}

}