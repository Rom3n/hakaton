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

		//public ICommand ItemSelectedCommand => GetNavigateToCommand(AppPages.NewsItem);
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
				NavigateTo(AppPages.NewsItem);
				//await ShowAlert("as", "as", "ok");
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
					Tag = "Поможем разобраться",
					Title = "Можно ли построить хороший дом за миллион рублей?",
					Date = "10:30, сегодня",
					Comments = "5",
					Views = "120"
				},

				new NewsItemObject()
				{
					Tag = "Происшествия",
					Title = "Воронежец разбил камеру видеофиксации ради друга на «Порше»",
					Date = "10:30, сегодня",
					Comments = "0",
					Views = "12"
				},

				new NewsItemObject()
				{
					Tag = "Город",
					Title = "Воронежцев зовут на сельскохозяйственную ярмарку",
					Date = "10:30, сегодня",
					Comments = "14",
					Views = "1332"
				},

				new NewsItemObject()
				{
					Tag = "Происшествия",
					Title = "Воронежец дошутился до уголовной статьи о терроризме",
					Date = "10:30, сегодня",
					Comments = "1",
					Views = "1412"
				},

				new NewsItemObject()
				{
					Tag = "Город",
					Title = "Три автобусных маршрута в Воронеже изменят путь следования с 10 июня",
					Date = "10:30, 07.06.2019",
					Comments = "2",
					Views = "1312"
				},

			};

			;
			ItemsSource.AddRange(items);
		}
	}
}
