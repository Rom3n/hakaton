using MobileTemplate.BL.ViewModels.Map;
using Xamarin.Forms.Maps;
using Xamarin.Forms.Xaml;

namespace MobileTemplate.UI.Pages.Map {
	public partial class MapPage : BasePage {
		public MapPage() {
			InitializeComponent();

			BindingContext = new MapViewModel();
			LocationMap.MoveToRegion(MapSpan.FromCenterAndRadius(new Position(51.661518, 39.190122), Distance.FromMiles(5)));
		}
	}
}