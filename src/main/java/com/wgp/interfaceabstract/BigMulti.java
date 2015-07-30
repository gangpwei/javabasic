package com.wgp.interfaceabstract;

import java.util.ArrayList;

public class BigMulti
{
	private ArrayList<Integer> num1=null;
	private ArrayList<Integer> num2=null;
	private ArrayList<ArrayList<Integer>> matrix=new ArrayList<ArrayList<Integer>>();
	
	public BigMulti(ArrayList<Integer> num1,ArrayList<Integer> num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public ArrayList<Integer> counter()
	{
		for (int i=num2.size()-1;i>=0;i--)
		{
			matrix.add(arrayListLeftShift(multiWithOneBit(num1,num2.get(i)),num2.size()-1-i));
		}	

		//we got the matrix
		int max=matrix.get(matrix.size()-1).size();
		for (int i=0;i<matrix.size();i++)
		{
			ArrayList<Integer> tmp=matrix.get(i);
			int size=tmp.size();
			if (size<max)
			{
				for (int j=0;j<max-size;j++)
				{
					tmp.add(0, 0);
				}
				matrix.set(i, tmp);
			}
		}

		return addArrayList(matrix);
	}
	
	public static void printResult(ArrayList<Integer> result)
	{
		for (int i=0;i<result.size();i++)
		{
			System.out.print(result.get(i));
		}
		
		System.out.println();
	}
	
	/**
	 * 把几个多位数相加
	 * @param matrix
	 * @return
	 */
	private ArrayList<Integer> addArrayList(ArrayList<ArrayList<Integer>> matrix)
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		int size=matrix.get(matrix.size()-1).size();
		int tmp=0; 
		
		for (int i=0;i<size;i++)
		{
			int sum=0;
			for (int j=0;j<matrix.size();j++)
			{
				sum+=matrix.get(j).get(size-1-i);
			}
			
			sum+=tmp;
			result.add(0, sum%10);
			tmp=sum/10;
		}
		
		if (tmp>0)
		{
			result.add(0, tmp);
		}
		
		return result;
	}
	
	/**
	 * 一个大数乘以一位数
	 * @param num1
	 * @param num2
	 * @return
	 */
	private ArrayList<Integer> multiWithOneBit(ArrayList<Integer> num1,int num2)
	{
		ArrayList<Integer> resultArray=new ArrayList<Integer>();
		
		if (num1==null||num2<0||num2>10)
		{
			return null;
		}
		
		int tmp=0;
		for (int i=num1.size()-1;i>=0;i--)
		{
			int result=num1.get(i)*num2+tmp;
			
			resultArray.add(0,result%10);
			tmp=result/10;
		}
		
		if (tmp>0)
		{
			resultArray.add(0, tmp);
		}
		
		return resultArray;
	}
	
	/**
	 * 一个多位数左移N位
	 * @param num1
	 * @param n
	 * @return
	 */
	private ArrayList<Integer> arrayListLeftShift(ArrayList<Integer> num1,int n)
	{
		if (num1==null||n<0)
		{
			return null;
		}
		
		for (int i=0;i<n;i++)
		{
			num1.add(0);
		}
		
		return num1;
	}
	
	public static ArrayList<Integer> digitalStringToArrayList(String num)
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		for (int i=0;i<num.length();i++)
		{
			String tmp=num.substring(i, i+1);
			
			result.add(Integer.valueOf(tmp));
		}
		
//		BigMulti.printResult(result);
		
		return result;
	}
	
	public static void main(String[] args)
	{
		BigMulti bigMulti=new BigMulti(
				BigMulti.digitalStringToArrayList("123456789"),
				BigMulti.digitalStringToArrayList("987654321"));
		
//		BigMulti.printResult(bigMulti.counter());
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(6);
		a=bigMulti.multiWithOneBit(a, 3);
		BigMulti.printResult(a);
	}
}
