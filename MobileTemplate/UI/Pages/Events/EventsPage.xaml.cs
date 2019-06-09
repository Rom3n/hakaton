using MobileTemplate.BL.ViewModels.Events;
using MobileTemplate.UI.Controls.FastGrid;
using MobileTemplate.UI.Controls.Cells;
using MobileTemplate.DAL.DataObjects;
using Xamarin.Forms;

namespace MobileTemplate.UI.Pages.Events {
	public partial class EventsPage : BasePage {
		public EventsPage() {
			InitializeComponent();

			var size = Device.Info.ScaledScreenSize;
			fastGridView.ItemTemplateSelector = new FastGridTemplateSelector(
				new FastGridDataTemplate(typeof(CategoryObject).Name, typeof(CategoryCell), new Size(size.Width, 70)),
				new FastGridDataTemplate(typeof(EventObject).Name, typeof(EventCell), new Size(size.Width/2, 260))
			);

			BindingContext = new EventsViewModel();
		}
	}
}