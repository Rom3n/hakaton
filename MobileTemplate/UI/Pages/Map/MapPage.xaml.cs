using MobileTemplate.BL.ViewModels.Map;
using Xamarin.Forms.Xaml;

namespace MobileTemplate.UI.Pages.Map {
	public partial class MapPage : BasePage {
		public MapPage() {
			InitializeComponent();

			BindingContext = new MapViewModel();
		}
	}
}