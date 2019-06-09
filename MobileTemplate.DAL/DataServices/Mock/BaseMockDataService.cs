using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using MobileTemplate.DAL.Helpers;
using Newtonsoft.Json;

namespace MobileTemplate.DAL.DataServices.Mock
{
	class BaseMockDataService
	{
		protected bool UseDelay { get; set; } =

#if DEBUG
			false;
#else
			true;
#endif
		static readonly Random Randomizer = new Random(DateTime.UtcNow.Millisecond);

		
		static Task Delay() {
			return Task.Delay(Randomizer.Next(100, 1000));
		}

		class ValueList<T> {
			public List<T> Values { get; set; }
		}
	}
}