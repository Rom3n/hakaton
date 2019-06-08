using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using System.Windows.Input;
using MobileTemplate.DAL.DataObjects;
using MvvmHelpers;
using Xamarin.Forms;

namespace MobileTemplate.BL.ViewModels.News {
	public class NewsViewModel : BaseViewModel {

		ObservableRangeCollection<object> _itemsSource = new ObservableRangeCollection<object>();

		ICommand _itemSelectedCommand;
		public ICommand ItemSelectedCommand => _itemSelectedCommand ??
											   (_itemSelectedCommand = new Command(async (o) =>
												   await ItemSelectedCommandAsync(o)));


		public ObservableRangeCollection<object> ItemsSource {
			get => _itemsSource;
			set {
				_itemsSource = value;
				OnPropertyChanged();
			}
		}

		public NewsViewModel() {
			GenerateSource();
		}


		async Task ItemSelectedCommandAsync(object obj) {
			if (obj is NewsItemObject newsitem)
				await ShowAlert(newsitem.Tag, newsitem.Title + " " + newsitem.Date, "OK");
		}

		void GenerateSource() {
			var size = Device.Info.ScaledScreenSize;
			var r = new Random(DateTime.Now.Millisecond);


			var items = new List<object>
			{

				new NewsItemObject()
				{
					Tag = "Город",
					Title = "В Воронеже нашли самую красивую улицу",
					Date = "10:30, сегодня",
					Comments = "0",
					Views = "12"
				},

				new NewsItemObject()
				{
					Tag = "Город",
					Title = "В Воронеже нашли самую красивую улицу",
					Date = "10:30, сегодня",
					Comments = "0",
					Views = "12"
				},

				new NewsItemObject()
				{
					Tag = "Город",
					Title = "В Воронеже нашли самую красивую улицу",
					Date = "10:30, сегодня",
					Comments = "0",
					Views = "12"
				},

				new NewsItemObject()
				{
					Tag = "Город",
					Title = "В Воронеже нашли самую красивую улицу",
					Date = "10:30, сегодня",
					Comments = "0",
					Views = "12"
				},

			};

			;
			ItemsSource.AddRange(items);
		}
	}
}
