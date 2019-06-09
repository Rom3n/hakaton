using Acr.UserDialogs;
using Android;
using Android.App;
using Android.Content.PM;
using Android.OS;

namespace MobileTemplate.Android
{
    [Activity(Label = "MobileTemplate", Icon = "@drawable/icon", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            TabLayoutResource = Resource.Layout.Tabbar;
            ToolbarResource = Resource.Layout.Toolbar;


			base.OnCreate(savedInstanceState);
			Xamarin.Forms.Forms.Init(this, savedInstanceState);
			FFImageLoading.Forms.Platform.CachedImageRenderer.Init(true);

			UserDialogs.Init(this);
			LoadApplication(new App());
		}
    }
}

