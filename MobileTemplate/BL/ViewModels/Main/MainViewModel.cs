using System.Threading.Tasks;
using System.Windows.Input;
using MobileTemplate.DAL.DataObjects;
using MobileTemplate.DAL.DataServices;

namespace MobileTemplate.BL.ViewModels.Main
{
    public class MainViewModel: BaseViewModel
    {
		public SampleDataObject SampleObject {
			get => Get<SampleDataObject>();
			private set => Set(value);
		}

    }
}
