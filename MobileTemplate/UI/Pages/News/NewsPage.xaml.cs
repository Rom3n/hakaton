using MobileTemplate.BL.ViewModels.News;
using MobileTemplate.UI.Controls.FastGrid;
using MobileTemplate.UI.Pages.Cells;
using MobileTemplate.DAL.DataObjects;
using Xamarin.Forms;

namespace MobileTemplate.UI.Pages.News {
	public partial class NewsPage : BasePage {
		public NewsPage() {
			InitializeComponent();

			var size = Device.Info.ScaledScreenSize;
			fastGridView.ItemTemplateSelector = new FastGridTemplateSelector(
				new FastGridDataTemplate(typeof(NewsItemObject).Name, typeof(NewsItemCell), new Size(size.Width, 160))
			);

			BindingContext = new NewsViewModel();
		}
	}
}