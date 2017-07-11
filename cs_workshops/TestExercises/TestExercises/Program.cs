using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestExercises
{
	public class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine(AnagramCheck("alma", "lawma"));
			Console.ReadLine();
		}

		public static bool AnagramCheck(String a, String b)
		{
			string aa = String.Concat(a.OrderBy(c => c));
			string bb = String.Concat(b.OrderBy(c => c));

			if (aa == bb)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
