using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using System.Windows.Input;
using MobileTemplate.DAL.DataObjects;
using MvvmHelpers;
using Xamarin.Forms;

namespace MobileTemplate.BL.ViewModels.Events {
	public class EventsViewModel : BaseViewModel {
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

		public EventsViewModel() {
			GenerateSource();
		}



		async Task ItemSelectedCommandAsync(object obj) {
			if (obj is EventObject product)
				NavigateTo(AppPages.EventItem);
		}

		void GenerateSource() {

			var items = new List<object>
			{
				new CategoryObject {Name = "Кино"},

				new EventObject()
				{
					ImageUrl = "http://155822.selcdn.ru/upload-8bfeca17cf9a3316f68775e6b5e44259/iblock/38f/38ff8cb757e6ef2373ab2ea63b97c2d1/959ee07b2de4328c6015a86bc4fc4ac9.png",
				},
				new EventObject()
				{
					ImageUrl = "https://s3.afisha.ru/mediastorage/8a/00/a49a64dd4aac43f09cbe15e4008a.jpg",
				},

				new CategoryObject {Name = "Концерты"},
				new EventObject()
				{
					ImageUrl = "https://cdn.kassir.ru/vrn/poster/24/24247d9bd55a540d1c9a121901e45112.jpg",

				},
				new EventObject()
				{
					ImageUrl = "http://musicafisha.ru/sites/default/files/ivan-dorn-2016-ekb-03.jpg",

				},

			};
			ItemsSource.AddRange(items);
		}
	}
}
