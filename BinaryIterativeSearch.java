public class BinaryIterativeSearch implements Practice03Search
{
	public int search(int[] arr, int target)
	{
		return search(arr, target, 0, arr.length);
	};
	
	public String searchName() 
	{
		return "Binary iterative search";
	}
	
	//binary iterative search that implements Practice03Seach.java
	public int search(int[] arr, int target, int minimum, int maximum)
	{
		int middle;
		
		//loop
		while (minimum < maximum)
		{
			middle = (minimum + maximum) / 2;
			if (arr[middle] == target)
			{
				return middle;
			} //if
			if ((arr[middle] - target) < 0)
			{
				minimum = middle + 1;
			} //if
			else 
			{
				maximum = middle - 1;
			} //else
		} //while
		return -1;
	}
}