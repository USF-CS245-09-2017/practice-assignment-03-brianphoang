public class BinaryRecursiveSearch implements Practice03Search
{
	public int search(int[] arr, int target)
	{
		return search(arr, target, 0, arr.length - 1);
	};
	
	public String searchName()
	{
		return "Binary recursive search";
	}
	
	//binary recursive search implements Practice03Seach.java
	public int search(int[] arr, int target, int minimum, int maximum)
	{
		// base case
		if (minimum > maximum)
		{
			return -1;
		} //if
		
		int middle = (minimum + maximum) / 2;
		if (arr[middle] == target)
		{
			return middle;
		} //if
		if ((arr[middle] - target) < 0)
		{
			return search(arr, target, minimum, middle - 1);
		} //if
		else
		{
			return search(arr, target, middle + 1, maximum);
		} //else
	}
}