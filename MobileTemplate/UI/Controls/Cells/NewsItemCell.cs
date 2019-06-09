using MobileTemplate.UI.Controls.FastGrid;
using MobileTemplate.DAL.DataObjects;
using Xamarin.Forms;

namespace MobileTemplate.UI.Pages.Cells {
	public class NewsItemCell : FastGridCell {
		Label _tag;
		Label _title;
		Label _date;
		Label _comments;
		Label _views;
		private StackLayout dateview;
		private StackLayout countsview;
		private StackLayout innerview;

		protected override void InitializeCell() {
			var screenWidth = Device.Info.ScaledScreenSize.Width;

			_tag = new Label {
				HorizontalOptions = LayoutOptions.FillAndExpand,
				FontSize = 20,
				TextColor = Color.Blue
			};

			_title = new Label {
				HorizontalOptions = LayoutOptions.FillAndExpand,
				FontSize = 24,
				TextColor = Color.Black
			};

			_date = new Label {
				VerticalOptions = LayoutOptions.Start,
				HorizontalOptions = LayoutOptions.Start,
				FontSize = 16,
				TextColor = Color.Gray
			};

			_comments = new Label {
				HorizontalOptions = LayoutOptions.FillAndExpand,
				FontSize = 16,
				TextColor = Color.Gray
			};

			_views = new Label {
				HorizontalOptions = LayoutOptions.FillAndExpand,
				FontSize = 16,
				TextColor = Color.Gray
			};

			dateview = new StackLayout {
				VerticalOptions = LayoutOptions.FillAndExpand,
				HorizontalOptions = LayoutOptions.Start,
				Orientation = StackOrientation.Horizontal,
				Children =
				{
					_date,

				}
			};

			countsview = new StackLayout {
				VerticalOptions = LayoutOptions.FillAndExpand,
				HorizontalOptions = LayoutOptions.Start,
				Orientation = StackOrientation.Horizontal,
				Children =
	{
					_comments,
					_views

				}
			};

			innerview = new StackLayout {
				VerticalOptions = LayoutOptions.FillAndExpand,
				HorizontalOptions = LayoutOptions.EndAndExpand,
				Orientation = StackOrientation.Horizontal,
				Children =
				{
					dateview,
					_comments,
					_views

				}
			};

			View = new StackLayout {
				Padding = 20,
				VerticalOptions = LayoutOptions.FillAndExpand,
				HorizontalOptions = LayoutOptions.FillAndExpand,
				Children =
				{
					_tag,
					_title,
					innerview

				}
			};


		}

		protected override void SetupCell(bool isRecycled) {
			if (!(BindingContext is NewsItemObject bindingContext)) return;

			_tag.Text = bindingContext.Tag;
			_title.Text = bindingContext.Title;
			_date.Text = bindingContext.Date;
			_comments.Text = bindingContext.Comments;
			_views.Text = bindingContext.Views;

		}
	}
}
