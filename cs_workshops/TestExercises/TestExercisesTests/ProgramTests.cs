using Microsoft.VisualStudio.TestTools.UnitTesting;
using TestExercises;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestExercises.Tests
{
	[TestClass()]
	public class ProgramTests
	{
		[TestMethod()]
		public void AnagramCheckTest()
		{
			Assert.AreEqual(true, Program.AnagramCheck("alma", "lama"));
		}
	}
}