namespace MobileTemplate
{
	public enum AppPages {
		Main,
		News,
		NewsItem,
		Events,
		EventItem,
		Map
	}

	public enum NavigationMode {
		Normal,
		Modal,
		Root,
		Custom
	}

	public enum PageState {
		Clean,
		Loading,
		Normal,
		NoData,
		Error,
		NoInternet
	}
}
