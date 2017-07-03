using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
	class Program
	{
		static void Main(string[] args)
		{

			int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

			IEnumerable<int> firstList = n.Where(y => y % 2 == 0);
			double averageOfOddNumbers = n.Where(y => y % 2 == 1).Average();

			foreach (int e in firstList)
			{
				Console.WriteLine(e);
			}
			
			Console.WriteLine("average of odd numbers: " + averageOfOddNumbers);

			Console.ReadLine();



		}
	}
}
