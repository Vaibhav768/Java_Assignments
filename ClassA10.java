
import java.util.Arrays;

class ClassAB {
	
	public int[] rotateLeft3(int[] nums)
	{
		if(nums.length < 0) {
			return nums;
		}
		int a = nums[nums.length-1];
	    // write your logic here 
		for(int i=nums.length-1; i>0; i--)
		{
			nums[i] = nums[i-1];
		}
		nums[0] = a;
		return nums;
		
	}
	
	public static void main(String[] args)
	{
		ClassAB aobj=new ClassAB();
		int nums[]= {1,2,3,6,7};
		int result[]=aobj.rotateLeft3(nums);
		System.out.println(Arrays.toString(result));
	}

}
