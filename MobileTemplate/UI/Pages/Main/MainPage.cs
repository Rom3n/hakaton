using Xamarin.Forms;
using Xamarin.Forms.PlatformConfiguration.AndroidSpecific;

namespace MobileTemplate.UI.Pages {
	public class MainPage : BaseTabbedPage {
		public MainPage() {
			On<Xamarin.Forms.PlatformConfiguration.Android>().SetToolbarPlacement(ToolbarPlacement.Bottom);
			On<Xamarin.Forms.PlatformConfiguration.Android>().SetIsSwipePagingEnabled(true);
			On<Xamarin.Forms.PlatformConfiguration.Android>().SetBarItemColor(Color.Black);
		}

		protected override void OnCurrentPageChanged() {
			Title = CurrentPage?.Title;
			base.OnCurrentPageChanged();
		}
	}
}
