using MobileTemplate.BL.ViewModels.Map;
using Xamarin.Forms.Xaml;

namespace MobileTemplate.UI.Pages.News {
	public partial class NewsPage : BasePage {
		public NewsPage() {
			InitializeComponent();

			BindingContext = new MapViewModel();
		}
	}
}