using MobileTemplate.BL.ViewModels;

namespace MobileTemplate.UI.Pages {
	interface IBasePage {
		string Title { get; set; }
		void SetViewModel(BaseViewModel viewModel);
	}
}
