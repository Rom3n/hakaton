using MobileTemplate.UI.Controls.FastGrid;
using MobileTemplate.DAL.DataObjects;
using FFImageLoading.Forms;
using Xamarin.Forms;

namespace MobileTemplate.UI.Controls.Cells {
	public class EventCell : FastGridCell {
		CachedImage _image;

		private ScrollView ScrView;

		protected override void InitializeCell() {
			var screenWidth = Device.Info.ScaledScreenSize.Width;
			var screenHight = Device.Info.ScaledScreenSize.Height;

			_image = new CachedImage {
				HorizontalOptions = LayoutOptions.FillAndExpand,
				Aspect = Aspect.AspectFill,
				WidthRequest = screenWidth / 2,
				HeightRequest = screenHight / 2 - 10
			};

			View = new StackLayout {
				VerticalOptions = LayoutOptions.FillAndExpand,
				HorizontalOptions = LayoutOptions.FillAndExpand,
				Orientation = StackOrientation.Horizontal,			
				Children =
				{
					_image
				}
			};


		}

		protected override void SetupCell(bool isRecycled) {
			if (!(BindingContext is EventObject bindingContext)) return;

			_image.Source = null;
			_image.Source = bindingContext.ImageUrl;
		}
	}
}
