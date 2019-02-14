public class LinearSearch implements Practice03Search
{
	public String searchName()
	{
		return "Linear search";
	}
	
	//linear search that implements Practice03Seach.java
	public int search(int [] arr, int target)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == target)
			{
				return i;
			} //if
		} //for
		return -1;
	}
}