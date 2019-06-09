using System.Windows.Input;

namespace MobileTemplate.DAL.DataObjects {
	public class BindableLocation {
		public double Latitude { get; set; }
		public double Longitude { get; set; }
		public ICommand ActionCommand { get; set; }
		public string LocationType { get; set; }

		public string LocationTitle { get; set; }

	}
}
