using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Windows.Input;
using MobileTemplate.DAL.DataObjects;
using Xamarin.Forms;
using Xamarin.Forms.Maps;

namespace MobileTemplate.BL.ViewModels.Map {

	public class MapViewModel : BaseViewModel {


		public ObservableCollection<BindableLocation> Locations { get; set; }

		public ICommand PinCommand;

		public MapViewModel() {
			var locations = new List<BindableLocation>();
			var location = new BindableLocation {
				LocationType = "ДТП",
				LocationTitle = "Авария у светофора",
				Latitude = 51.651228,
				Longitude = 39.134749,
				ActionCommand = new Command(PinSelected)
			};
			locations.Add(location);

			location = new BindableLocation {
				LocationType = "Акция в магните",
				LocationTitle = "с 10:00 до 15:00",
				Latitude = 51.673000,
				Longitude = 39.151882,
				ActionCommand = new Command(PinSelected)
			};

			locations.Add(location);

			location = new BindableLocation {
				LocationType = "ул. Сакко и Ванцетти, 52-56",
				LocationTitle = "c 10:00 до 17:00",
				Latitude = 51.681639,
				Longitude = 39.220691,
				ActionCommand = new Command(PinSelected)

			};

			locations.Add(location);

			Locations = new ObservableCollection<BindableLocation>(locations);
		}

		public void PinSelected(object param) {
			var pin = param as Pin;

			if (pin != null) {
				//NavigateTo(AppPages.PointInfo);
				//Device.BeginInvokeOnMainThread(() =>
				{
					ShowAlert(pin.Label, pin.Address, "ok");
				};
			}
		}
	}
}


