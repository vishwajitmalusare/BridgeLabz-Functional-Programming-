/**
 * @ProblemStatement: Create Object Oriented Analysis and Design of a simple Address Book Problem.
 * 
 * @author: Vishwajeet Malusare
 * */
package addressBook;

import java.util.Comparator;
/**This class is written for comparison operation in address book*/
public class CompareAddressBook 
{
	public static class NameComparator implements Comparator<Person>
	{

		/**
		 * This method is written to compare using first name
		 * */
		@Override
		public int compare(Person personOne, Person personTwo) 
		{
			return(personOne.getFirstName().compareTo(personTwo.getFirstName()));
		}
		
	}
	
	/**
	 * This method is written to compare the data using zip code
	 * */
	public static class ZIPComparator implements Comparator<Person>
	{

		@Override
		public int compare(Person personOne, Person personTwo) {
			
			int personOneZip = Integer.parseInt(personOne.getZip());
			int personTwoZip = Integer.parseInt(personTwo.getZip());
			if(personOneZip < personTwoZip)
			{
				return -1;
			}
			else if(personOneZip > personTwoZip)
			{
				return 1;
			}
			return 0;
		}

		
	}
}
