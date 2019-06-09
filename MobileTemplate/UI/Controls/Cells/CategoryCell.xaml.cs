using MobileTemplate.UI.Controls.FastGrid;
using Xamarin.Forms.Xaml;

namespace MobileTemplate.UI.Controls.Cells {
	[XamlCompilation(XamlCompilationOptions.Compile)]
	public partial class CategoryCell : FastGridCell {
		protected override void InitializeCell() {
			InitializeComponent();
		}

		protected override void SetupCell(bool isRecycled) {
		}
	}
}